package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexOffice.Office.MsoEditingType
import typingsSlinky.activexOffice.Office.MsoSegmentType
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeNode extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val EditingType: MsoEditingType = js.native
  @JSName("Excel.ShapeNode_typekey")
  var ExcelDotShapeNode_typekey: ShapeNode = js.native
  val Parent: js.Any = js.native
  val Points: SafeArray[Double] = js.native
  val SegmentType: MsoSegmentType = js.native
}

object ShapeNode {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    EditingType: MsoEditingType,
    ExcelDotShapeNode_typekey: ShapeNode,
    Parent: js.Any,
    Points: SafeArray[Double],
    SegmentType: MsoSegmentType
  ): ShapeNode = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EditingType = EditingType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], SegmentType = SegmentType.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ShapeNode_typekey")(ExcelDotShapeNode_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeNode]
  }
  @scala.inline
  implicit class ShapeNodeOps[Self <: ShapeNode] (val x: Self) extends AnyVal {
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
    def withEditingType(value: MsoEditingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EditingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotShapeNode_typekey(value: ShapeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.ShapeNode_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegmentType(value: MsoSegmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

