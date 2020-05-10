package typingsSlinky.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The current status of a Replica.
  */
@js.native
trait SchemaReplicaStatus extends js.Object {
  /**
    * [Output Only] Human-readable details about the current state of the
    * replica
    */
  var details: js.UndefOr[String] = js.native
  /**
    * [Output Only] The state of the Replica.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * [Output Only] The template used to build the replica.
    */
  var templateVersion: js.UndefOr[String] = js.native
  /**
    * [Output Only] Link to the virtual machine that this Replica represents.
    */
  var vmLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] The time that this Replica got to the RUNNING state, in RFC
    * 3339 format. If the start time is unknown, UNKNOWN is returned.
    */
  var vmStartTime: js.UndefOr[String] = js.native
}

object SchemaReplicaStatus {
  @scala.inline
  def apply(): SchemaReplicaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplicaStatus]
  }
  @scala.inline
  implicit class SchemaReplicaStatusOps[Self <: SchemaReplicaStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withVmLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmLink")(js.undefined)
        ret
    }
    @scala.inline
    def withVmStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmStartTime")(js.undefined)
        ret
    }
  }
  
}

