package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextFrame extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  var MarginBottom: Double = js.native
  var MarginLeft: Double = js.native
  var MarginRight: Double = js.native
  var MarginTop: Double = js.native
  @JSName("Office.TextFrame_typekey")
  var OfficeDotTextFrame_typekey: TextFrame = js.native
  var Orientation: MsoTextOrientation = js.native
  val Parent: js.Any = js.native
}

object TextFrame {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    MarginBottom: Double,
    MarginLeft: Double,
    MarginRight: Double,
    MarginTop: Double,
    OfficeDotTextFrame_typekey: TextFrame,
    Orientation: MsoTextOrientation,
    Parent: js.Any
  ): TextFrame = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], MarginBottom = MarginBottom.asInstanceOf[js.Any], MarginLeft = MarginLeft.asInstanceOf[js.Any], MarginRight = MarginRight.asInstanceOf[js.Any], MarginTop = MarginTop.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.TextFrame_typekey")(OfficeDotTextFrame_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFrame]
  }
  @scala.inline
  implicit class TextFrameOps[Self <: TextFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotTextFrame_typekey(value: TextFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.TextFrame_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: MsoTextOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

