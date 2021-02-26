package typingsSlinky.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IamPolicyAnalysisResult extends StObject {
  
  /** The access control lists derived from the iam_binding that match or potentially match resource and access selectors specified in the request. */
  var accessControlLists: js.UndefOr[js.Array[GoogleCloudAssetV1AccessControlList]] = js.native
  
  /** The [full resource name](https://cloud.google.com/asset-inventory/docs/resource-name-format) of the resource to which the iam_binding policy attaches. */
  var attachedResourceFullName: js.UndefOr[String] = js.native
  
  /** Represents whether all analyses on the iam_binding have successfully finished. */
  var fullyExplored: js.UndefOr[Boolean] = js.native
  
  /** The Cloud IAM policy binding under analysis. */
  var iamBinding: js.UndefOr[Binding] = js.native
  
  /** The identity list derived from members of the iam_binding that match or potentially match identity selector specified in the request. */
  var identityList: js.UndefOr[GoogleCloudAssetV1IdentityList] = js.native
}
object IamPolicyAnalysisResult {
  
  @scala.inline
  def apply(): IamPolicyAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamPolicyAnalysisResult]
  }
  
  @scala.inline
  implicit class IamPolicyAnalysisResultMutableBuilder[Self <: IamPolicyAnalysisResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlLists(value: js.Array[GoogleCloudAssetV1AccessControlList]): Self = StObject.set(x, "accessControlLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlListsUndefined: Self = StObject.set(x, "accessControlLists", js.undefined)
    
    @scala.inline
    def setAccessControlListsVarargs(value: GoogleCloudAssetV1AccessControlList*): Self = StObject.set(x, "accessControlLists", js.Array(value :_*))
    
    @scala.inline
    def setAttachedResourceFullName(value: String): Self = StObject.set(x, "attachedResourceFullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachedResourceFullNameUndefined: Self = StObject.set(x, "attachedResourceFullName", js.undefined)
    
    @scala.inline
    def setFullyExplored(value: Boolean): Self = StObject.set(x, "fullyExplored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullyExploredUndefined: Self = StObject.set(x, "fullyExplored", js.undefined)
    
    @scala.inline
    def setIamBinding(value: Binding): Self = StObject.set(x, "iamBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamBindingUndefined: Self = StObject.set(x, "iamBinding", js.undefined)
    
    @scala.inline
    def setIdentityList(value: GoogleCloudAssetV1IdentityList): Self = StObject.set(x, "identityList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityListUndefined: Self = StObject.set(x, "identityList", js.undefined)
  }
}
