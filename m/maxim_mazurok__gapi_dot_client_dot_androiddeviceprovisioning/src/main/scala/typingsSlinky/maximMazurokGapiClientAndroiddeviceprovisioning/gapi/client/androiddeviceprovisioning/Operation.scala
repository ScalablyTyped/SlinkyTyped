package typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operation extends StObject {
  
  /** If the value is `false`, it means the operation is still in progress. If `true`, the operation is completed, and either `error` or `response` is available. */
  var done: js.UndefOr[Boolean] = js.native
  
  /**
    * This field will always be not set if the operation is created by `claimAsync`, `unclaimAsync`, or `updateMetadataAsync`. In this case, error information for each device is set in
    * `response.perDeviceStatus.result.status`.
    */
  var error: js.UndefOr[Status] = js.native
  
  /** This field will contain a `DevicesLongRunningOperationMetadata` object if the operation is created by `claimAsync`, `unclaimAsync`, or `updateMetadataAsync`. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.maximMazurokGapiClientAndroiddeviceprovisioningStrings.Operation with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The server-assigned name, which is only unique within the same service that originally returns it. If you use the default HTTP mapping, the `name` should be a resource name ending
    * with `operations/{unique_id}`.
    */
  var name: js.UndefOr[String] = js.native
  
  /** This field will contain a `DevicesLongRunningOperationResponse` object if the operation is created by `claimAsync`, `unclaimAsync`, or `updateMetadataAsync`. */
  var response: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.maximMazurokGapiClientAndroiddeviceprovisioningStrings.Operation with TopLevel[js.Any]
  ] = js.native
}
object Operation {
  
  @scala.inline
  def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  implicit class OperationMutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.maximMazurokGapiClientAndroiddeviceprovisioningStrings.Operation with TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResponse(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.maximMazurokGapiClientAndroiddeviceprovisioningStrings.Operation with TopLevel[js.Any]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
