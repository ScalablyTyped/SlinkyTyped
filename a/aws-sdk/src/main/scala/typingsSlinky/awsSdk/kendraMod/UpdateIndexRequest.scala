package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateIndexRequest extends js.Object {
  /**
    * A new description for the index.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.kendraMod.Description] = js.native
  /**
    * The document metadata to update. 
    */
  var DocumentMetadataConfigurationUpdates: js.UndefOr[DocumentMetadataConfigurationList] = js.native
  /**
    * The identifier of the index to update.
    */
  var Id: IndexId = js.native
  /**
    * The name of the index to update.
    */
  var Name: js.UndefOr[IndexName] = js.native
  /**
    * A new IAM role that gives Amazon Kendra permission to access your Amazon CloudWatch logs.
    */
  var RoleArn: js.UndefOr[typingsSlinky.awsSdk.kendraMod.RoleArn] = js.native
}

object UpdateIndexRequest {
  @scala.inline
  def apply(Id: IndexId): UpdateIndexRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIndexRequest]
  }
  @scala.inline
  implicit class UpdateIndexRequestOps[Self <: UpdateIndexRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: IndexId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
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
    def withDocumentMetadataConfigurationUpdates(value: DocumentMetadataConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentMetadataConfigurationUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentMetadataConfigurationUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentMetadataConfigurationUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: IndexName): Self = {
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
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
  }
  
}

