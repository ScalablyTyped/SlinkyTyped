package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlkBusinessCardControl extends js.Object {
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkBusinessCardControl_typekey")
  var OutlookDotOlkBusinessCardControl_typekey: OlkBusinessCardControl = js.native
}

object OlkBusinessCardControl {
  @scala.inline
  def apply(
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkBusinessCardControl_typekey: OlkBusinessCardControl
  ): OlkBusinessCardControl = {
    val __obj = js.Dynamic.literal(MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkBusinessCardControl_typekey")(OutlookDotOlkBusinessCardControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkBusinessCardControl]
  }
  @scala.inline
  implicit class OlkBusinessCardControlOps[Self <: OlkBusinessCardControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOutlookDotOlkBusinessCardControl_typekey(value: OlkBusinessCardControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.OlkBusinessCardControl_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

