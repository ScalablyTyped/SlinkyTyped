package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.activexStdole.stdole.OLE_COLOR
import typingsSlinky.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlkCategory extends js.Object {
  var AutoSize: Boolean = js.native
  var BackColor: OLE_COLOR = js.native
  var BackStyle: OlBackStyle = js.native
  var Enabled: Boolean = js.native
  var ForeColor: OLE_COLOR = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkCategory_typekey")
  var OutlookDotOlkCategory_typekey: OlkCategory = js.native
}

object OlkCategory {
  @scala.inline
  def apply(
    AutoSize: Boolean,
    BackColor: OLE_COLOR,
    BackStyle: OlBackStyle,
    Enabled: Boolean,
    ForeColor: OLE_COLOR,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkCategory_typekey: OlkCategory
  ): OlkCategory = {
    val __obj = js.Dynamic.literal(AutoSize = AutoSize.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkCategory_typekey")(OutlookDotOlkCategory_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkCategory]
  }
  @scala.inline
  implicit class OlkCategoryOps[Self <: OlkCategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackColor(value: OLE_COLOR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackStyle(value: OlBackStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForeColor(value: OLE_COLOR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForeColor")(value.asInstanceOf[js.Any])
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
    def withOutlookDotOlkCategory_typekey(value: OlkCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.OlkCategory_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

