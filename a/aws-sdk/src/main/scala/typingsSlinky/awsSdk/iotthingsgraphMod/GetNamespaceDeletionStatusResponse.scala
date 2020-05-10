package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNamespaceDeletionStatusResponse extends js.Object {
  /**
    * An error code returned by the namespace deletion task.
    */
  var errorCode: js.UndefOr[NamespaceDeletionStatusErrorCodes] = js.native
  /**
    * An error code returned by the namespace deletion task.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * The ARN of the namespace that is being deleted.
    */
  var namespaceArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the namespace that is being deleted.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.native
  /**
    * The status of the deletion request.
    */
  var status: js.UndefOr[NamespaceDeletionStatus] = js.native
}

object GetNamespaceDeletionStatusResponse {
  @scala.inline
  def apply(): GetNamespaceDeletionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNamespaceDeletionStatusResponse]
  }
  @scala.inline
  implicit class GetNamespaceDeletionStatusResponseOps[Self <: GetNamespaceDeletionStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: NamespaceDeletionStatusErrorCodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
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
    def withStatus(value: NamespaceDeletionStatus): Self = {
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
  }
  
}

