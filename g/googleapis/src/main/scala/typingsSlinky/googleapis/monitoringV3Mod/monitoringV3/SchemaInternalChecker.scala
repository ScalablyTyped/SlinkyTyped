package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An internal checker allows uptime checks to run on private/internal GCP
  * resources.
  */
@js.native
trait SchemaInternalChecker extends js.Object {
  /**
    * The checker&#39;s human-readable name. The display name should be unique
    * within a Stackdriver Workspace in order to make it easier to identify;
    * however, uniqueness is not enforced.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The GCP zone the uptime check should egress from. Only respected for
    * internal uptime checks, where internal_network is specified.
    */
  var gcpZone: js.UndefOr[String] = js.native
  /**
    * A unique resource name for this InternalChecker. The format
    * is:projects/[PROJECT_ID]/internalCheckers/[INTERNAL_CHECKER_ID].PROJECT_ID
    * is the stackdriver workspace project for the uptime check config
    * associated with the internal checker.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The GCP VPC network (https://cloud.google.com/vpc/docs/vpc) where the
    * internal resource lives (ex: &quot;default&quot;).
    */
  var network: js.UndefOr[String] = js.native
  /**
    * The GCP project_id where the internal checker lives. Not necessary the
    * same as the workspace project.
    */
  var peerProjectId: js.UndefOr[String] = js.native
  /**
    * The current operational state of the internal checker.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaInternalChecker {
  @scala.inline
  def apply(): SchemaInternalChecker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInternalChecker]
  }
  @scala.inline
  implicit class SchemaInternalCheckerOps[Self <: SchemaInternalChecker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withGcpZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcpZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcpZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcpZone")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerProjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerProjectId")(js.undefined)
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
  }
  
}

