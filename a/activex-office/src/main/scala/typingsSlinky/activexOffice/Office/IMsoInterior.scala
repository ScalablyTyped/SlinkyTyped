package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMsoInterior extends js.Object {
  val Application: js.Any = js.native
  var Color: js.Any = js.native
  var ColorIndex: js.Any = js.native
  val Creator: Double = js.native
  var InvertIfNegative: js.Any = js.native
  @JSName("Office.IMsoInterior_typekey")
  var OfficeDotIMsoInterior_typekey: IMsoInterior = js.native
  val Parent: js.Any = js.native
  var Pattern: js.Any = js.native
  var PatternColor: js.Any = js.native
  var PatternColorIndex: js.Any = js.native
}

object IMsoInterior {
  @scala.inline
  def apply(
    Application: js.Any,
    Color: js.Any,
    ColorIndex: js.Any,
    Creator: Double,
    InvertIfNegative: js.Any,
    OfficeDotIMsoInterior_typekey: IMsoInterior,
    Parent: js.Any,
    Pattern: js.Any,
    PatternColor: js.Any,
    PatternColorIndex: js.Any
  ): IMsoInterior = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], InvertIfNegative = InvertIfNegative.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PatternColor = PatternColor.asInstanceOf[js.Any], PatternColorIndex = PatternColorIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoInterior_typekey")(OfficeDotIMsoInterior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoInterior]
  }
  @scala.inline
  implicit class IMsoInteriorOps[Self <: IMsoInterior] (val x: Self) extends AnyVal {
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
    def withColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorIndex(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvertIfNegative(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvertIfNegative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotIMsoInterior_typekey(value: IMsoInterior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.IMsoInterior_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatternColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatternColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatternColorIndex(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatternColorIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

