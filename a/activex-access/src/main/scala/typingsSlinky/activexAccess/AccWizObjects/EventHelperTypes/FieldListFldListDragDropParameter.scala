package typingsSlinky.activexAccess.AccWizObjects.EventHelperTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldListFldListDragDropParameter extends js.Object {
  val SourceCtlName: String = js.native
  val SourceFieldList: Double = js.native
  val SourceRow: Double = js.native
  val TargetCtlName: String = js.native
  val TargetFieldList: Double = js.native
  val TargetRow: Double = js.native
}

object FieldListFldListDragDropParameter {
  @scala.inline
  def apply(
    SourceCtlName: String,
    SourceFieldList: Double,
    SourceRow: Double,
    TargetCtlName: String,
    TargetFieldList: Double,
    TargetRow: Double
  ): FieldListFldListDragDropParameter = {
    val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName.asInstanceOf[js.Any], SourceFieldList = SourceFieldList.asInstanceOf[js.Any], SourceRow = SourceRow.asInstanceOf[js.Any], TargetCtlName = TargetCtlName.asInstanceOf[js.Any], TargetFieldList = TargetFieldList.asInstanceOf[js.Any], TargetRow = TargetRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldListFldListDragDropParameter]
  }
  @scala.inline
  implicit class FieldListFldListDragDropParameterOps[Self <: FieldListFldListDragDropParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceCtlName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceCtlName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceFieldList(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceFieldList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetCtlName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetCtlName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetFieldList(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetFieldList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetRow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

