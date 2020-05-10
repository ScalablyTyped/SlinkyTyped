package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FolderMetadata extends js.Object {
  /**
    * The time when the folder was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the creator.
    */
  var CreatorId: js.UndefOr[IdType] = js.native
  /**
    * The ID of the folder.
    */
  var Id: js.UndefOr[ResourceIdType] = js.native
  /**
    * List of labels on the folder.
    */
  var Labels: js.UndefOr[SharedLabels] = js.native
  /**
    * The size of the latest version of the folder metadata.
    */
  var LatestVersionSize: js.UndefOr[SizeType] = js.native
  /**
    * The time when the folder was updated.
    */
  var ModifiedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The name of the folder.
    */
  var Name: js.UndefOr[ResourceNameType] = js.native
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: js.UndefOr[ResourceIdType] = js.native
  /**
    * The resource state of the folder.
    */
  var ResourceState: js.UndefOr[ResourceStateType] = js.native
  /**
    * The unique identifier created from the subfolders and documents of the folder.
    */
  var Signature: js.UndefOr[HashType] = js.native
  /**
    * The size of the folder metadata.
    */
  var Size: js.UndefOr[SizeType] = js.native
}

object FolderMetadata {
  @scala.inline
  def apply(): FolderMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderMetadata]
  }
  @scala.inline
  implicit class FolderMetadataOps[Self <: FolderMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatorId(value: IdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: ResourceIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: SharedLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestVersionSize(value: SizeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestVersionSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestVersionSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestVersionSize")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifiedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifiedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceNameType): Self = {
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
    def withParentFolderId(value: ResourceIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentFolderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentFolderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentFolderId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceState(value: ResourceStateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceState")(js.undefined)
        ret
    }
    @scala.inline
    def withSignature(value: HashType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Signature")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: SizeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(js.undefined)
        ret
    }
  }
  
}

