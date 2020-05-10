package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceMetadata extends js.Object {
  /**
    * The ID of the resource.
    */
  var Id: js.UndefOr[ResourceIdType] = js.native
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[ResourceNameType] = js.native
  /**
    * The original name of the resource before a rename operation.
    */
  var OriginalName: js.UndefOr[ResourceNameType] = js.native
  /**
    * The owner of the resource.
    */
  var Owner: js.UndefOr[UserMetadata] = js.native
  /**
    * The parent ID of the resource before a rename operation.
    */
  var ParentId: js.UndefOr[ResourceIdType] = js.native
  /**
    * The type of resource.
    */
  var Type: js.UndefOr[ResourceType] = js.native
  /**
    * The version ID of the resource. This is an optional field and is filled for action on document version.
    */
  var VersionId: js.UndefOr[DocumentVersionIdType] = js.native
}

object ResourceMetadata {
  @scala.inline
  def apply(): ResourceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceMetadata]
  }
  @scala.inline
  implicit class ResourceMetadataOps[Self <: ResourceMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOriginalName(value: ResourceNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalName")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: UserMetadata): Self = {
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
    def withParentId(value: ResourceIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionId(value: DocumentVersionIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(js.undefined)
        ret
    }
  }
  
}

