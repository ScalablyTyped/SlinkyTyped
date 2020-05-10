package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteDocumentRequest extends js.Object {
  /**
    * One or more identifiers for documents to delete from the index.
    */
  var DocumentIdList: typingsSlinky.awsSdk.kendraMod.DocumentIdList = js.native
  /**
    * The identifier of the index that contains the documents to delete.
    */
  var IndexId: typingsSlinky.awsSdk.kendraMod.IndexId = js.native
}

object BatchDeleteDocumentRequest {
  @scala.inline
  def apply(DocumentIdList: DocumentIdList, IndexId: IndexId): BatchDeleteDocumentRequest = {
    val __obj = js.Dynamic.literal(DocumentIdList = DocumentIdList.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteDocumentRequest]
  }
  @scala.inline
  implicit class BatchDeleteDocumentRequestOps[Self <: BatchDeleteDocumentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentIdList(value: DocumentIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentIdList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexId(value: IndexId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

