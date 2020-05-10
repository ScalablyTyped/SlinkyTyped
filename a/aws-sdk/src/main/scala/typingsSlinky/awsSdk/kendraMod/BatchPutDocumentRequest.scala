package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutDocumentRequest extends js.Object {
  /**
    * One or more documents to add to the index.  Each document is limited to 5 Mb, the total size of the list is limited to 50 Mb.
    */
  var Documents: DocumentList = js.native
  /**
    * The identifier of the index to add the documents to. You need to create the index first using the CreateIndex operation.
    */
  var IndexId: typingsSlinky.awsSdk.kendraMod.IndexId = js.native
  /**
    * The Amazon Resource Name (ARN) of a role that is allowed to run the BatchPutDocument operation. For more information, see IAM Roles for Amazon Kendra.
    */
  var RoleArn: js.UndefOr[typingsSlinky.awsSdk.kendraMod.RoleArn] = js.native
}

object BatchPutDocumentRequest {
  @scala.inline
  def apply(Documents: DocumentList, IndexId: IndexId): BatchPutDocumentRequest = {
    val __obj = js.Dynamic.literal(Documents = Documents.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutDocumentRequest]
  }
  @scala.inline
  implicit class BatchPutDocumentRequestOps[Self <: BatchPutDocumentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocuments(value: DocumentList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Documents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexId(value: IndexId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexId")(value.asInstanceOf[js.Any])
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

