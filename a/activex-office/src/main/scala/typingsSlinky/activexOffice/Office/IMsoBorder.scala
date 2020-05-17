package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMsoBorder extends js.Object {
  val Application: js.Any = js.native
  var Color: js.Any = js.native
  var ColorIndex: js.Any = js.native
  val Creator: Double = js.native
  var LineStyle: js.Any = js.native
  @JSName("Office.IMsoBorder_typekey")
  var OfficeDotIMsoBorder_typekey: IMsoBorder = js.native
  val Parent: js.Any = js.native
  var Weight: js.Any = js.native
}

object IMsoBorder {
  @scala.inline
  def apply(
    Application: js.Any,
    Color: js.Any,
    ColorIndex: js.Any,
    Creator: Double,
    LineStyle: js.Any,
    OfficeDotIMsoBorder_typekey: IMsoBorder,
    Parent: js.Any,
    Weight: js.Any
  ): IMsoBorder = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoBorder_typekey")(OfficeDotIMsoBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoBorder]
  }
  @scala.inline
  implicit class IMsoBorderOps[Self <: IMsoBorder] (val x: Self) extends AnyVal {
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
    def withLineStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotIMsoBorder_typekey(value: IMsoBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.IMsoBorder_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Weight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

