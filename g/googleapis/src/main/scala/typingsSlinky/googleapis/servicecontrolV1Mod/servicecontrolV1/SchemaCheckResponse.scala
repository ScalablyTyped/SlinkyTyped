package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the Check method.
  */
@js.native
trait SchemaCheckResponse extends js.Object {
  /**
    * Indicate the decision of the check.  If no check errors are present, the
    * service should process the operation. Otherwise the service should use
    * the list of errors to determine the appropriate action.
    */
  var checkErrors: js.UndefOr[js.Array[SchemaCheckError]] = js.native
  /**
    * Feedback data returned from the server during processing a Check request.
    */
  var checkInfo: js.UndefOr[SchemaCheckInfo] = js.native
  /**
    * The same operation_id value used in the CheckRequest. Used for logging
    * and diagnostics purposes.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Quota information for the check request associated with this response.
    */
  var quotaInfo: js.UndefOr[SchemaQuotaInfo] = js.native
  /**
    * The actual config id used to process the request.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object SchemaCheckResponse {
  @scala.inline
  def apply(): SchemaCheckResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckResponse]
  }
  @scala.inline
  implicit class SchemaCheckResponseOps[Self <: SchemaCheckResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckErrors(value: js.Array[SchemaCheckError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckInfo(value: SchemaCheckInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaInfo(value: SchemaQuotaInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceConfigId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceConfigId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceConfigId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceConfigId")(js.undefined)
        ret
    }
  }
  
}

