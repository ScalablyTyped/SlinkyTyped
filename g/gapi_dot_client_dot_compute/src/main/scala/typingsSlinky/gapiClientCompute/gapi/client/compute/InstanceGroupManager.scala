package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupManager extends js.Object {
  /**
    * The base instance name to use for instances in this group. The value must be 1-58 characters long. Instances are named by appending a hyphen and a
    * random four-character string to the base instance name. The base instance name must comply with RFC1035.
    */
  var baseInstanceName: js.UndefOr[String] = js.native
  /** [Output Only] The creation timestamp for this managed instance group in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  /** [Output Only] The list of instance actions and the number of instances in this managed instance group that are scheduled for each of those actions. */
  var currentActions: js.UndefOr[InstanceGroupManagerActionsSummary] = js.native
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  /** [Output Only] The fingerprint of the resource data. You can use this optional field for optimistic locking when you update the resource. */
  var fingerprint: js.UndefOr[String] = js.native
  /** [Output Only] A unique identifier for this resource type. The server generates this identifier. */
  var id: js.UndefOr[String] = js.native
  /** [Output Only] The URL of the Instance Group resource. */
  var instanceGroup: js.UndefOr[String] = js.native
  /**
    * The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the
    * managed instance group.
    */
  var instanceTemplate: js.UndefOr[String] = js.native
  /** [Output Only] The resource type, which is always compute#instanceGroupManager for managed instance groups. */
  var kind: js.UndefOr[String] = js.native
  /** The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035. */
  var name: js.UndefOr[String] = js.native
  /** Named ports configured for the Instance Groups complementary to this Instance Group Manager. */
  var namedPorts: js.UndefOr[js.Array[NamedPort]] = js.native
  /** [Output Only] The URL of the region where the managed instance group resides (for regional resources). */
  var region: js.UndefOr[String] = js.native
  /** [Output Only] The URL for this managed instance group. The server defines this URL. */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the
    * instances in the managed instance group.
    */
  var targetPools: js.UndefOr[js.Array[String]] = js.native
  /**
    * The target number of running instances for this managed instance group. Deleting or abandoning instances reduces this number. Resizing the group
    * changes this number.
    */
  var targetSize: js.UndefOr[Double] = js.native
  /** [Output Only] The URL of the zone where the managed instance group is located (for zonal resources). */
  var zone: js.UndefOr[String] = js.native
}

object InstanceGroupManager {
  @scala.inline
  def apply(): InstanceGroupManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManager]
  }
  @scala.inline
  implicit class InstanceGroupManagerOps[Self <: InstanceGroupManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseInstanceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseInstanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseInstanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentActions(value: InstanceGroupManagerActionsSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentActions")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    def withNamedPorts(value: js.Array[NamedPort]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedPorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedPorts")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetPools(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetPools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPools")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSize")(js.undefined)
        ret
    }
    @scala.inline
    def withZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(js.undefined)
        ret
    }
  }
  
}

