package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.activexStdole.stdole.StdFont
import typingsSlinky.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlkCommandButton extends js.Object {
  var Accelerator: String = js.native
  var AutoSize: Boolean = js.native
  var Caption: String = js.native
  var DisplayDropArrow: Boolean = js.native
  var Enabled: Boolean = js.native
  val Font: StdFont = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkCommandButton_typekey")
  var OutlookDotOlkCommandButton_typekey: OlkCommandButton = js.native
  var Picture: StdPicture = js.native
  var PictureAlignment: OlPictureAlignment = js.native
  var TextAlign: OlTextAlign = js.native
  var WordWrap: Boolean = js.native
}

object OlkCommandButton {
  @scala.inline
  def apply(
    Accelerator: String,
    AutoSize: Boolean,
    Caption: String,
    DisplayDropArrow: Boolean,
    Enabled: Boolean,
    Font: StdFont,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkCommandButton_typekey: OlkCommandButton,
    Picture: StdPicture,
    PictureAlignment: OlPictureAlignment,
    TextAlign: OlTextAlign,
    WordWrap: Boolean
  ): OlkCommandButton = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], DisplayDropArrow = DisplayDropArrow.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PictureAlignment = PictureAlignment.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkCommandButton_typekey")(OutlookDotOlkCommandButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkCommandButton]
  }
  @scala.inline
  implicit class OlkCommandButtonOps[Self <: OlkCommandButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accelerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayDropArrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayDropArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: StdFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Font")(value.asInstanceOf[js.Any])
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
    def withOutlookDotOlkCommandButton_typekey(value: OlkCommandButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.OlkCommandButton_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicture(value: StdPicture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPictureAlignment(value: OlPictureAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextAlign(value: OlTextAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WordWrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

