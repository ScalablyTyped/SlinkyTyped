package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextStyle extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Levels: TextStyleLevels = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.TextStyle_typekey")
  var PowerPointDotTextStyle_typekey: TextStyle = js.native
  val Ruler: typingsSlinky.activexPowerpoint.PowerPoint.Ruler = js.native
  val TextFrame: typingsSlinky.activexPowerpoint.PowerPoint.TextFrame = js.native
}

object TextStyle {
  @scala.inline
  def apply(
    Application: Application,
    Levels: TextStyleLevels,
    Parent: js.Any,
    PowerPointDotTextStyle_typekey: TextStyle,
    Ruler: Ruler,
    TextFrame: TextFrame
  ): TextStyle = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Levels = Levels.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Ruler = Ruler.asInstanceOf[js.Any], TextFrame = TextFrame.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextStyle_typekey")(PowerPointDotTextStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
  @scala.inline
  implicit class TextStyleOps[Self <: TextStyle] (val x: Self) extends AnyVal {
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
    def withLevels(value: TextStyleLevels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Levels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotTextStyle_typekey(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.TextStyle_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuler(value: Ruler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ruler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextFrame(value: TextFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextFrame")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

