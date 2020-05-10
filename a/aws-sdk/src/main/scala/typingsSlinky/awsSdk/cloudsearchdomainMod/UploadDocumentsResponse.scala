package typingsSlinky.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadDocumentsResponse extends js.Object {
  /**
    * The number of documents that were added to the search domain.
    */
  var adds: js.UndefOr[Adds] = js.native
  /**
    * The number of documents that were deleted from the search domain.
    */
  var deletes: js.UndefOr[Deletes] = js.native
  /**
    * The status of an UploadDocumentsRequest.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Any warnings returned by the document service about the documents being uploaded.
    */
  var warnings: js.UndefOr[DocumentServiceWarnings] = js.native
}

object UploadDocumentsResponse {
  @scala.inline
  def apply(): UploadDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadDocumentsResponse]
  }
  @scala.inline
  implicit class UploadDocumentsResponseOps[Self <: UploadDocumentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdds(value: Adds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adds")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletes(value: Deletes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletes")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnings(value: DocumentServiceWarnings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
  }
  
}

