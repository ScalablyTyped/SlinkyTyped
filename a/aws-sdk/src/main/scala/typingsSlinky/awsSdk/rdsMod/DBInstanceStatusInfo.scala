package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBInstanceStatusInfo extends js.Object {
  /**
    * Details of the error if there is an error for the instance. If the instance isn't in an error state, this value is blank.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * Boolean value that is true if the instance is operating normally, or false if the instance is in an error state.
    */
  var Normal: js.UndefOr[Boolean] = js.native
  /**
    * Status of the DB instance. For a StatusType of Read Replica, the values can be replicating, replication stop point set, replication stop point reached, error, stopped, or terminated.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * This value is currently "read replication."
    */
  var StatusType: js.UndefOr[String] = js.native
}

object DBInstanceStatusInfo {
  @scala.inline
  def apply(): DBInstanceStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBInstanceStatusInfo]
  }
  @scala.inline
  implicit class DBInstanceStatusInfoOps[Self <: DBInstanceStatusInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withNormal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Normal")(js.undefined)
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
    @scala.inline
    def withStatusType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusType")(js.undefined)
        ret
    }
  }
  
}

