package typingsSlinky.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceRequirements extends js.Object {
  
  /**
    * (Optional) Cloud Run fully managed: Only memory and CPU are supported. Note: The only supported values for CPU are '1', '2', and '4'. Setting 4 CPU requires at least 2Gi of memory.
    * Cloud Run for Anthos: supported Limits describes the maximum amount of compute resources allowed. The values of the map is string form of the 'quantity' k8s type:
    * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
    */
  var limits: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.ResourceRequirements with TopLevel[js.Any]
  ] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: Only memory and CPU are supported. Note: The only supported values for CPU are '1' and '2'. Cloud Run for Anthos: supported Requests describes
    * the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an
    * implementation-defined value. The values of the map is string form of the 'quantity' k8s type:
    * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
    */
  var requests: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.ResourceRequirements with TopLevel[js.Any]
  ] = js.native
}
object ResourceRequirements {
  
  @scala.inline
  def apply(): ResourceRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceRequirements]
  }
  
  @scala.inline
  implicit class ResourceRequirementsOps[Self <: ResourceRequirements] (val x: Self) extends AnyVal {
    
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
    def setLimits(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.ResourceRequirements with TopLevel[js.Any]
    ): Self = this.set("limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimits: Self = this.set("limits", js.undefined)
    
    @scala.inline
    def setRequests(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.ResourceRequirements with TopLevel[js.Any]
    ): Self = this.set("requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
  }
}
