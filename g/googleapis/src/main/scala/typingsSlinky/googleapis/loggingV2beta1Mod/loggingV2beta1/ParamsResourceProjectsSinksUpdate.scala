package typingsSlinky.googleapis.loggingV2beta1Mod.loggingV2beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsSinksUpdate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLogSink] = js.native
  /**
    * Required. The full resource name of the sink to update, including the
    * parent resource and the sink identifier:
    * "projects/[PROJECT_ID]/sinks/[SINK_ID]"
    * "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
    * "folders/[FOLDER_ID]/sinks/[SINK_ID]" Example:
    * "projects/my-project-id/sinks/my-sink-id".
    */
  var sinkName: js.UndefOr[String] = js.native
  /**
    * Optional. See sinks.create for a description of this field. When updating
    * a sink, the effect of this field on the value of writer_identity in the
    * updated sink depends on both the old and new values of this field: If the
    * old and new values of this field are both false or both true, then there
    * is no change to the sink's writer_identity. If the old value is false and
    * the new value is true, then writer_identity is changed to a unique
    * service account. It is an error if the old value is true and the new
    * value is set to false or defaulted to false.
    */
  var uniqueWriterIdentity: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Field mask that specifies the fields in sink that need an
    * update. A sink field will be overwritten if, and only if, it is in the
    * update mask. name and output only fields cannot be updated.An empty
    * updateMask is temporarily treated as using the following mask for
    * backwards compatibility purposes:  destination,filter,includeChildren At
    * some point in the future, behavior will be removed and specifying an
    * empty updateMask will be an error.For a detailed FieldMask definition,
    * see
    * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskExample:
    * updateMask=filter.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsSinksUpdate {
  @scala.inline
  def apply(): ParamsResourceProjectsSinksUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSinksUpdate]
  }
  @scala.inline
  implicit class ParamsResourceProjectsSinksUpdateOps[Self <: ParamsResourceProjectsSinksUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestBody(value: SchemaLogSink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(js.undefined)
        ret
    }
    @scala.inline
    def withSinkName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sinkName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSinkName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sinkName")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueWriterIdentity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueWriterIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueWriterIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueWriterIdentity")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(js.undefined)
        ret
    }
  }
  
}

