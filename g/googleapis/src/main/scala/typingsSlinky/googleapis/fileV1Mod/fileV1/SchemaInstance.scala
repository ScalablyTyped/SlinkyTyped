package typingsSlinky.googleapis.fileV1Mod.fileV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cloud Filestore instance.
  */
@js.native
trait SchemaInstance extends StObject {
  
  /**
    * Output only. The time when the instance was created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Optional. A description of the instance (2048 characters or less).
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Server-specified ETag for the instance resource to prevent simultaneous
    * updates from overwriting each other.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * File system shares on the instance. For this version, only a single file
    * share is supported.
    */
  var fileShares: js.UndefOr[js.Array[SchemaFileShareConfig]] = js.native
  
  /**
    * Resource labels to represent user provided metadata.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Output only. The resource name of the instance, in the format
    * projects/{project_id}/locations/{location_id}/instances/{instance_id}.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * VPC networks to which the instance is connected. For this version, only a
    * single network is supported.
    */
  var networks: js.UndefOr[js.Array[SchemaNetworkConfig]] = js.native
  
  /**
    * Output only. The instance state.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Output only. Additional information about the instance state, if
    * available.
    */
  var statusMessage: js.UndefOr[String] = js.native
  
  /**
    * The service tier of the instance.
    */
  var tier: js.UndefOr[String] = js.native
}
object SchemaInstance {
  
  @scala.inline
  def apply(): SchemaInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstance]
  }
  
  @scala.inline
  implicit class SchemaInstanceMutableBuilder[Self <: SchemaInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setFileShares(value: js.Array[SchemaFileShareConfig]): Self = StObject.set(x, "fileShares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSharesUndefined: Self = StObject.set(x, "fileShares", js.undefined)
    
    @scala.inline
    def setFileSharesVarargs(value: SchemaFileShareConfig*): Self = StObject.set(x, "fileShares", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetworks(value: js.Array[SchemaNetworkConfig]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    
    @scala.inline
    def setNetworksVarargs(value: SchemaNetworkConfig*): Self = StObject.set(x, "networks", js.Array(value :_*))
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
