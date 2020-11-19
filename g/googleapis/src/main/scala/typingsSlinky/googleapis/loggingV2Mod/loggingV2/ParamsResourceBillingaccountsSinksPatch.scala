package typingsSlinky.googleapis.loggingV2Mod.loggingV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceBillingaccountsSinksPatch extends StandardParameters {
  
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
object ParamsResourceBillingaccountsSinksPatch {
  
  @scala.inline
  def apply(): ParamsResourceBillingaccountsSinksPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBillingaccountsSinksPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceBillingaccountsSinksPatchOps[Self <: ParamsResourceBillingaccountsSinksPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaLogSink): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setSinkName(value: String): Self = this.set("sinkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSinkName: Self = this.set("sinkName", js.undefined)
    
    @scala.inline
    def setUniqueWriterIdentity(value: Boolean): Self = this.set("uniqueWriterIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueWriterIdentity: Self = this.set("uniqueWriterIdentity", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
}
