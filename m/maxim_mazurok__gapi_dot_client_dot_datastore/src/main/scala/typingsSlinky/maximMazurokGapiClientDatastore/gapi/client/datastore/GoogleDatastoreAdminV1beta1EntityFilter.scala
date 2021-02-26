package typingsSlinky.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDatastoreAdminV1beta1EntityFilter extends StObject {
  
  /** If empty, then this represents all kinds. */
  var kinds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An empty list represents all namespaces. This is the preferred usage for projects that don't use namespaces. An empty string element represents the default namespace. This should be
    * used if the project has data in non-default namespaces, but doesn't want to include them. Each namespace in this list must be unique.
    */
  var namespaceIds: js.UndefOr[js.Array[String]] = js.native
}
object GoogleDatastoreAdminV1beta1EntityFilter {
  
  @scala.inline
  def apply(): GoogleDatastoreAdminV1beta1EntityFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1beta1EntityFilter]
  }
  
  @scala.inline
  implicit class GoogleDatastoreAdminV1beta1EntityFilterMutableBuilder[Self <: GoogleDatastoreAdminV1beta1EntityFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKinds(value: js.Array[String]): Self = StObject.set(x, "kinds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindsUndefined: Self = StObject.set(x, "kinds", js.undefined)
    
    @scala.inline
    def setKindsVarargs(value: String*): Self = StObject.set(x, "kinds", js.Array(value :_*))
    
    @scala.inline
    def setNamespaceIds(value: js.Array[String]): Self = StObject.set(x, "namespaceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceIdsUndefined: Self = StObject.set(x, "namespaceIds", js.undefined)
    
    @scala.inline
    def setNamespaceIdsVarargs(value: String*): Self = StObject.set(x, "namespaceIds", js.Array(value :_*))
  }
}
