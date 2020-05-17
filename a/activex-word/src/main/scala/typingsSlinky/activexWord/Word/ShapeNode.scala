package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.MsoEditingType
import typingsSlinky.activexOffice.Office.MsoSegmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeNode extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val EditingType: MsoEditingType = js.native
  val Parent: js.Any = js.native
  val Points: js.Any = js.native
  val SegmentType: MsoSegmentType = js.native
  @JSName("Word.ShapeNode_typekey")
  var WordDotShapeNode_typekey: ShapeNode = js.native
}

object ShapeNode {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    EditingType: MsoEditingType,
    Parent: js.Any,
    Points: js.Any,
    SegmentType: MsoSegmentType,
    WordDotShapeNode_typekey: ShapeNode
  ): ShapeNode = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EditingType = EditingType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], SegmentType = SegmentType.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ShapeNode_typekey")(WordDotShapeNode_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeNode]
  }
  @scala.inline
  implicit class ShapeNodeOps[Self <: ShapeNode] (val x: Self) extends AnyVal {
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
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: js.Any): Self = {
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
    @scala.inline
    def withWordDotShapeNode_typekey(value: ShapeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.ShapeNode_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

