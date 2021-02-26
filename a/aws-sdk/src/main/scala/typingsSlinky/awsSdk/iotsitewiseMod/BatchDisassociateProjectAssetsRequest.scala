package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDisassociateProjectAssetsRequest extends StObject {
  
  /**
    * The IDs of the assets to be disassociated from the project.
    */
  var assetIds: IDs = js.native
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  
  /**
    * The ID of the project from which to disassociate the assets.
    */
  var projectId: ID = js.native
}
object BatchDisassociateProjectAssetsRequest {
  
  @scala.inline
  def apply(assetIds: IDs, projectId: ID): BatchDisassociateProjectAssetsRequest = {
    val __obj = js.Dynamic.literal(assetIds = assetIds.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisassociateProjectAssetsRequest]
  }
  
  @scala.inline
  implicit class BatchDisassociateProjectAssetsRequestMutableBuilder[Self <: BatchDisassociateProjectAssetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetIds(value: IDs): Self = StObject.set(x, "assetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetIdsVarargs(value: ID*): Self = StObject.set(x, "assetIds", js.Array(value :_*))
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setProjectId(value: ID): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
  }
}
