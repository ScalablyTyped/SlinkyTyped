package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TableViewTableWinSaveInfo...
  */
@js.native
trait ITableViewTableWinSaveInfo extends js.Object {
  /**
    * Table name.
    */
  var qCaption: String = js.native
  /**
    * Information about the position of the table.
    */
  var qPos: IRect = js.native
}

object ITableViewTableWinSaveInfo {
  @scala.inline
  def apply(qCaption: String, qPos: IRect): ITableViewTableWinSaveInfo = {
    val __obj = js.Dynamic.literal(qCaption = qCaption.asInstanceOf[js.Any], qPos = qPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableViewTableWinSaveInfo]
  }
  @scala.inline
  implicit class ITableViewTableWinSaveInfoOps[Self <: ITableViewTableWinSaveInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCaption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQPos(value: IRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qPos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

