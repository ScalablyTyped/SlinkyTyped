package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceBundle extends js.Object {
  /**
    * The bundle identifier.
    */
  var BundleId: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.BundleId] = js.native
  /**
    * The compute type. For more information, see Amazon WorkSpaces Bundles.
    */
  var ComputeType: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.ComputeType] = js.native
  /**
    * A description.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.Description] = js.native
  /**
    * The image identifier of the bundle.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.native
  /**
    * The last time that the bundle was updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the bundle.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  /**
    * The owner of the bundle. This is the account identifier of the owner, or AMAZON if the bundle is provided by AWS.
    */
  var Owner: js.UndefOr[BundleOwner] = js.native
  /**
    * The size of the root volume.
    */
  var RootStorage: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.RootStorage] = js.native
  /**
    * The size of the user storage.
    */
  var UserStorage: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.UserStorage] = js.native
}

object WorkspaceBundle {
  @scala.inline
  def apply(): WorkspaceBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceBundle]
  }
  @scala.inline
  implicit class WorkspaceBundleOps[Self <: WorkspaceBundle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleId(value: BundleId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeType(value: ComputeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputeType")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
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
    def withImageId(value: WorkspaceImageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NonEmptyString): Self = {
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
    def withOwner(value: BundleOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(js.undefined)
        ret
    }
    @scala.inline
    def withRootStorage(value: RootStorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withUserStorage(value: UserStorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserStorage")(js.undefined)
        ret
    }
  }
  
}

