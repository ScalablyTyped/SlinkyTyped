package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlkSenderPhoto extends js.Object {
  var Enabled: Boolean = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkSenderPhoto_typekey")
  var OutlookDotOlkSenderPhoto_typekey: OlkSenderPhoto = js.native
  val PreferredHeight: Double = js.native
  val PreferredWidth: Double = js.native
}

object OlkSenderPhoto {
  @scala.inline
  def apply(
    Enabled: Boolean,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkSenderPhoto_typekey: OlkSenderPhoto,
    PreferredHeight: Double,
    PreferredWidth: Double
  ): OlkSenderPhoto = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], PreferredHeight = PreferredHeight.asInstanceOf[js.Any], PreferredWidth = PreferredWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkSenderPhoto_typekey")(OutlookDotOlkSenderPhoto_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkSenderPhoto]
  }
  @scala.inline
  implicit class OlkSenderPhotoOps[Self <: OlkSenderPhoto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseIcon(value: StdPicture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MouseIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMousePointer(value: OlMousePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MousePointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotOlkSenderPhoto_typekey(value: OlkSenderPhoto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.OlkSenderPhoto_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferredHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferredWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

