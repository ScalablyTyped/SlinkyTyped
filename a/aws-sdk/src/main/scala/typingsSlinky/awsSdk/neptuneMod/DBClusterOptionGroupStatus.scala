package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterOptionGroupStatus extends js.Object {
  /**
    * Specifies the name of the DB cluster option group.
    */
  var DBClusterOptionGroupName: js.UndefOr[String] = js.native
  /**
    * Specifies the status of the DB cluster option group.
    */
  var Status: js.UndefOr[String] = js.native
}

object DBClusterOptionGroupStatus {
  @scala.inline
  def apply(): DBClusterOptionGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterOptionGroupStatus]
  }
  @scala.inline
  implicit class DBClusterOptionGroupStatusOps[Self <: DBClusterOptionGroupStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBClusterOptionGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterOptionGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterOptionGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterOptionGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

