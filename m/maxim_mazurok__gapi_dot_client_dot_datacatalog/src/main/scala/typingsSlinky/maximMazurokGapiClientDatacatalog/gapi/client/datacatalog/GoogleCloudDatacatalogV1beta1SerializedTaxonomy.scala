package typingsSlinky.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1SerializedTaxonomy extends StObject {
  
  /** A list of policy types that are activated for a taxonomy. */
  var activatedPolicyTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** Description of the serialized taxonomy. The length of the description is limited to 2000 bytes when encoded in UTF-8. If not set, defaults to an empty description. */
  var description: js.UndefOr[String] = js.native
  
  /** Required. Display name of the taxonomy. Max 200 bytes when encoded in UTF-8. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Top level policy tags associated with the taxonomy if any. */
  var policyTags: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1SerializedPolicyTag]] = js.native
}
object GoogleCloudDatacatalogV1beta1SerializedTaxonomy {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1SerializedTaxonomy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1SerializedTaxonomy]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1SerializedTaxonomyMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1SerializedTaxonomy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivatedPolicyTypes(value: js.Array[String]): Self = StObject.set(x, "activatedPolicyTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivatedPolicyTypesUndefined: Self = StObject.set(x, "activatedPolicyTypes", js.undefined)
    
    @scala.inline
    def setActivatedPolicyTypesVarargs(value: String*): Self = StObject.set(x, "activatedPolicyTypes", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setPolicyTags(value: js.Array[GoogleCloudDatacatalogV1beta1SerializedPolicyTag]): Self = StObject.set(x, "policyTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTagsUndefined: Self = StObject.set(x, "policyTags", js.undefined)
    
    @scala.inline
    def setPolicyTagsVarargs(value: GoogleCloudDatacatalogV1beta1SerializedPolicyTag*): Self = StObject.set(x, "policyTags", js.Array(value :_*))
  }
}
