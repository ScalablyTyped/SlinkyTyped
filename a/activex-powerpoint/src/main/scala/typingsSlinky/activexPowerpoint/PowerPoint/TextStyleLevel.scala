package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextStyleLevel extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Font: typingsSlinky.activexPowerpoint.PowerPoint.Font = js.native
  val ParagraphFormat: typingsSlinky.activexPowerpoint.PowerPoint.ParagraphFormat = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.TextStyleLevel_typekey")
  var PowerPointDotTextStyleLevel_typekey: TextStyleLevel = js.native
}

object TextStyleLevel {
  @scala.inline
  def apply(
    Application: Application,
    Font: Font,
    ParagraphFormat: ParagraphFormat,
    Parent: js.Any,
    PowerPointDotTextStyleLevel_typekey: TextStyleLevel
  ): TextStyleLevel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ParagraphFormat = ParagraphFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextStyleLevel_typekey")(PowerPointDotTextStyleLevel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyleLevel]
  }
  @scala.inline
  implicit class TextStyleLevelOps[Self <: TextStyleLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParagraphFormat(value: ParagraphFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParagraphFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotTextStyleLevel_typekey(value: TextStyleLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.TextStyleLevel_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

