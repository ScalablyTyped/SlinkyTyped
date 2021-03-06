package typingsSlinky.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetLabelsRequest extends StObject {
  
  /** Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field. */
  var clusterId: js.UndefOr[String] = js.native
  
  /**
    * Required. The fingerprint of the previous set of labels for this resource, used to detect conflicts. The fingerprint is initially generated by Kubernetes Engine and changes after
    * every request to modify or update labels. You must always provide an up-to-date fingerprint hash when updating or changing labels. Make a `get()` request to the resource to get the
    * latest fingerprint.
    */
  var labelFingerprint: js.UndefOr[String] = js.native
  
  /** The name (project, location, cluster id) of the cluster to set labels. Specified in the format `projects/∗/locations/∗/clusters/ *`. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced
    * by the name field.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /** Required. The labels to set for that cluster. */
  var resourceLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.SetLabelsRequest with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and
    * replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.native
}
object SetLabelsRequest {
  
  @scala.inline
  def apply(): SetLabelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetLabelsRequest]
  }
  
  @scala.inline
  implicit class SetLabelsRequestMutableBuilder[Self <: SetLabelsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    @scala.inline
    def setLabelFingerprint(value: String): Self = StObject.set(x, "labelFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFingerprintUndefined: Self = StObject.set(x, "labelFingerprint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setResourceLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.SetLabelsRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "resourceLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLabelsUndefined: Self = StObject.set(x, "resourceLabels", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
