package typingsSlinky.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDatastoreAdminV1Index extends StObject {
  
  /** Required. The index's ancestor mode. Must not be ANCESTOR_MODE_UNSPECIFIED. */
  var ancestor: js.UndefOr[String] = js.native
  
  /** Output only. The resource ID of the index. */
  var indexId: js.UndefOr[String] = js.native
  
  /** Required. The entity kind to which this index applies. */
  var kind: js.UndefOr[String] = js.native
  
  /** Output only. Project ID. */
  var projectId: js.UndefOr[String] = js.native
  
  /** Required. An ordered sequence of property names and their index attributes. */
  var properties: js.UndefOr[js.Array[GoogleDatastoreAdminV1IndexedProperty]] = js.native
  
  /** Output only. The state of the index. */
  var state: js.UndefOr[String] = js.native
}
object GoogleDatastoreAdminV1Index {
  
  @scala.inline
  def apply(): GoogleDatastoreAdminV1Index = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1Index]
  }
  
  @scala.inline
  implicit class GoogleDatastoreAdminV1IndexMutableBuilder[Self <: GoogleDatastoreAdminV1Index] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAncestor(value: String): Self = StObject.set(x, "ancestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAncestorUndefined: Self = StObject.set(x, "ancestor", js.undefined)
    
    @scala.inline
    def setIndexId(value: String): Self = StObject.set(x, "indexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexIdUndefined: Self = StObject.set(x, "indexId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Array[GoogleDatastoreAdminV1IndexedProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: GoogleDatastoreAdminV1IndexedProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
