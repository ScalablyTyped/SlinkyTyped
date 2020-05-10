package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotsRequest extends js.Object {
  /**
    * Copies the tags from the specified volume to corresponding snapshot.
    */
  var CopyTagsFromSource: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.CopyTagsFromSource] = js.native
  /**
    *  A description propagated to every snapshot specified by the instance.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The instance to specify which volumes should be included in the snapshots.
    */
  var InstanceSpecification: typingsSlinky.awsSdk.ec2Mod.InstanceSpecification = js.native
  /**
    * Tags to apply to every snapshot specified by the instance.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}

object CreateSnapshotsRequest {
  @scala.inline
  def apply(InstanceSpecification: InstanceSpecification): CreateSnapshotsRequest = {
    val __obj = js.Dynamic.literal(InstanceSpecification = InstanceSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotsRequest]
  }
  @scala.inline
  implicit class CreateSnapshotsRequestOps[Self <: CreateSnapshotsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceSpecification(value: InstanceSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyTagsFromSource(value: CopyTagsFromSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyTagsFromSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyTagsFromSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyTagsFromSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withTagSpecifications(value: TagSpecificationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSpecifications")(js.undefined)
        ret
    }
  }
  
}

