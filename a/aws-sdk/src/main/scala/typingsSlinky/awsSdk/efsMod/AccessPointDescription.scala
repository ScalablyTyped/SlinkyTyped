package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPointDescription extends js.Object {
  /**
    * The unique Amazon Resource Name (ARN) associated with the access point.
    */
  var AccessPointArn: js.UndefOr[typingsSlinky.awsSdk.efsMod.AccessPointArn] = js.native
  /**
    * The ID of the access point, assigned by Amazon EFS.
    */
  var AccessPointId: js.UndefOr[typingsSlinky.awsSdk.efsMod.AccessPointId] = js.native
  /**
    * The opaque string specified in the request to ensure idempotent creation.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.efsMod.ClientToken] = js.native
  /**
    * The ID of the EFS file system that the access point applies to.
    */
  var FileSystemId: js.UndefOr[typingsSlinky.awsSdk.efsMod.FileSystemId] = js.native
  /**
    * Identifies the lifecycle phase of the access point.
    */
  var LifeCycleState: js.UndefOr[typingsSlinky.awsSdk.efsMod.LifeCycleState] = js.native
  /**
    * The name of the access point. This is the value of the Name tag.
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.efsMod.Name] = js.native
  /**
    * Identified the AWS account that owns the access point resource.
    */
  var OwnerId: js.UndefOr[AwsAccountId] = js.native
  /**
    * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point that is used for all file operations by NFS clients using the access point.
    */
  var PosixUser: js.UndefOr[typingsSlinky.awsSdk.efsMod.PosixUser] = js.native
  /**
    * The directory on the Amazon EFS file system that the access point exposes as the root directory to NFS clients using the access point.
    */
  var RootDirectory: js.UndefOr[typingsSlinky.awsSdk.efsMod.RootDirectory] = js.native
  /**
    * The tags associated with the access point, presented as an array of Tag objects.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.efsMod.Tags] = js.native
}

object AccessPointDescription {
  @scala.inline
  def apply(): AccessPointDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPointDescription]
  }
  @scala.inline
  implicit class AccessPointDescriptionOps[Self <: AccessPointDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessPointArn(value: AccessPointArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessPointArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessPointArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessPointArn")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessPointId(value: AccessPointId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessPointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessPointId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessPointId")(js.undefined)
        ret
    }
    @scala.inline
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSystemId(value: FileSystemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSystemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemId")(js.undefined)
        ret
    }
    @scala.inline
    def withLifeCycleState(value: LifeCycleState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifeCycleState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifeCycleState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifeCycleState")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPosixUser(value: PosixUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PosixUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosixUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PosixUser")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDirectory(value: RootDirectory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

