package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TableViewDlgSaveInfo...
  */
@js.native
trait ITableViewDlgSaveInfo extends js.Object {
  /**
    * Set of data for internal and source view modes.
    */
  var qCtlInfo: ITableViewCtlSaveInfo = js.native
  /**
    * View mode to display when opening Qlik Sense data model viewer.
    * One of:
    *   0 for internal view mode
    *   1 for source view mode
    */
  var qMode: Double = js.native
  /**
    * Information about the position of the dialog window.
    * Not used in Qlik Sense.
    */
  var qPos: IRect = js.native
}

object ITableViewDlgSaveInfo {
  @scala.inline
  def apply(qCtlInfo: ITableViewCtlSaveInfo, qMode: Double, qPos: IRect): ITableViewDlgSaveInfo = {
    val __obj = js.Dynamic.literal(qCtlInfo = qCtlInfo.asInstanceOf[js.Any], qMode = qMode.asInstanceOf[js.Any], qPos = qPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableViewDlgSaveInfo]
  }
  @scala.inline
  implicit class ITableViewDlgSaveInfoOps[Self <: ITableViewDlgSaveInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQCtlInfo(value: ITableViewCtlSaveInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCtlInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMode")(value.asInstanceOf[js.Any])
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

