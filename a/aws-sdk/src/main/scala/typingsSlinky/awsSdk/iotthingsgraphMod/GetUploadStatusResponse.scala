package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUploadStatusResponse extends js.Object {
  /**
    * The date at which the upload was created.
    */
  var createdDate: js.Date = js.native
  /**
    * The reason for an upload failure.
    */
  var failureReason: js.UndefOr[StringList] = js.native
  /**
    * The ARN of the upload.
    */
  var namespaceArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the upload's namespace.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.native
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace.
    */
  var namespaceVersion: js.UndefOr[Version] = js.native
  /**
    * The ID of the upload.
    */
  var uploadId: UploadId = js.native
  /**
    * The status of the upload. The initial status is IN_PROGRESS. The response show all validation failures if the upload fails.
    */
  var uploadStatus: UploadStatus = js.native
}

object GetUploadStatusResponse {
  @scala.inline
  def apply(createdDate: js.Date, uploadId: UploadId, uploadStatus: UploadStatus): GetUploadStatusResponse = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], uploadStatus = uploadStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUploadStatusResponse]
  }
  @scala.inline
  implicit class GetUploadStatusResponseOps[Self <: GetUploadStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadId(value: UploadId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadStatus(value: UploadStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureReason(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceName(value: NamespaceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceName")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceVersion")(js.undefined)
        ret
    }
  }
  
}

