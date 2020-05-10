package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TableViewConnectionPointSaveInfo...
  */
@js.native
trait ITableViewConnectionPointSaveInfo extends js.Object {
  /**
    * List of the fields in the table.
    */
  var qFields: js.Array[String] = js.native
  /**
    * Information about the position of the connection point.
    */
  var qPos: IPoint = js.native
}

object ITableViewConnectionPointSaveInfo {
  @scala.inline
  def apply(qFields: js.Array[String], qPos: IPoint): ITableViewConnectionPointSaveInfo = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qPos = qPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableViewConnectionPointSaveInfo]
  }
  @scala.inline
  implicit class ITableViewConnectionPointSaveInfoOps[Self <: ITableViewConnectionPointSaveInfo] (val x: Self) extends AnyVal {
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
  }
  
}

