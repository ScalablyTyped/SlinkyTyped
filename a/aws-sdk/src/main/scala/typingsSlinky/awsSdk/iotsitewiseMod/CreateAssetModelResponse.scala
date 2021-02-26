package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAssetModelResponse extends StObject {
  
  /**
    * The ARN of the asset model, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId} 
    */
  var assetModelArn: ARN = js.native
  
  /**
    * The ID of the asset model. You can use this ID when you call other AWS IoT SiteWise APIs.
    */
  var assetModelId: ID = js.native
  
  /**
    * The status of the asset model, which contains a state (CREATING after successfully calling this operation) and any error message.
    */
  var assetModelStatus: AssetModelStatus = js.native
}
object CreateAssetModelResponse {
  
  @scala.inline
  def apply(assetModelArn: ARN, assetModelId: ID, assetModelStatus: AssetModelStatus): CreateAssetModelResponse = {
    val __obj = js.Dynamic.literal(assetModelArn = assetModelArn.asInstanceOf[js.Any], assetModelId = assetModelId.asInstanceOf[js.Any], assetModelStatus = assetModelStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssetModelResponse]
  }
  
  @scala.inline
  implicit class CreateAssetModelResponseMutableBuilder[Self <: CreateAssetModelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetModelArn(value: ARN): Self = StObject.set(x, "assetModelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetModelId(value: ID): Self = StObject.set(x, "assetModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetModelStatus(value: AssetModelStatus): Self = StObject.set(x, "assetModelStatus", value.asInstanceOf[js.Any])
  }
}
