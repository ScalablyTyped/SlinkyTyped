package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlkInfoBar extends js.Object {
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkInfoBar_typekey")
  var OutlookDotOlkInfoBar_typekey: OlkInfoBar = js.native
}

object OlkInfoBar {
  @scala.inline
  def apply(MouseIcon: StdPicture, MousePointer: OlMousePointer, OutlookDotOlkInfoBar_typekey: OlkInfoBar): OlkInfoBar = {
    val __obj = js.Dynamic.literal(MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkInfoBar_typekey")(OutlookDotOlkInfoBar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkInfoBar]
  }
  @scala.inline
  implicit class OlkInfoBarOps[Self <: OlkInfoBar] (val x: Self) extends AnyVal {
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
    def withOutlookDotOlkInfoBar_typekey(value: OlkInfoBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.OlkInfoBar_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

