package typingsSlinky.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud asset. This includes all Google Cloud Platform resources, Cloud IAM
  * policies, and other non-GCP assets.
  */
@js.native
trait SchemaAsset extends StObject {
  
  /**
    * Type of the asset. Example: &quot;compute.googleapis.com/Disk&quot;.
    */
  var assetType: js.UndefOr[String] = js.native
  
  /**
    * Representation of the actual Cloud IAM policy set on a cloud resource.
    * For each resource, there must be at most one Cloud IAM policy set on it.
    */
  var iamPolicy: js.UndefOr[SchemaPolicy] = js.native
  
  /**
    * The full name of the asset. For example:
    * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
    * See [Resource
    * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
    * for more information.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Representation of the resource.
    */
  var resource: js.UndefOr[SchemaResource] = js.native
}
object SchemaAsset {
  
  @scala.inline
  def apply(): SchemaAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsset]
  }
  
  @scala.inline
  implicit class SchemaAssetMutableBuilder[Self <: SchemaAsset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetType(value: String): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
    
    @scala.inline
    def setIamPolicy(value: SchemaPolicy): Self = StObject.set(x, "iamPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamPolicyUndefined: Self = StObject.set(x, "iamPolicy", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResource(value: SchemaResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
