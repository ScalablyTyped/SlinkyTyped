package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TableViewBroomPointSaveInfo...
  */
@js.native
trait ITableViewBroomPointSaveInfo extends js.Object {
  /**
    * List of fields in the table.
    */
  var qFields: js.Array[String] = js.native
  /**
    * Information about the position of the broom point.
    */
  var qPos: IPoint = js.native
  /**
    * Name of the table.
    */
  var qTable: String = js.native
}

object ITableViewBroomPointSaveInfo {
  @scala.inline
  def apply(qFields: js.Array[String], qPos: IPoint, qTable: String): ITableViewBroomPointSaveInfo = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qPos = qPos.asInstanceOf[js.Any], qTable = qTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableViewBroomPointSaveInfo]
  }
  @scala.inline
  implicit class ITableViewBroomPointSaveInfoOps[Self <: ITableViewBroomPointSaveInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQPos(value: IPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

