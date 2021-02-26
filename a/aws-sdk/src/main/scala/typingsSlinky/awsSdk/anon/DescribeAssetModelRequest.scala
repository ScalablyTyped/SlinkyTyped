package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.iotsitewiseMod.ID
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/iotsitewise.DescribeAssetModelRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeAssetModelRequest extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  
  /**
    * The ID of the asset model.
    */
  var assetModelId: ID = js.native
}
object DescribeAssetModelRequest {
  
  @scala.inline
  def apply(assetModelId: ID): DescribeAssetModelRequest = {
    val __obj = js.Dynamic.literal(assetModelId = assetModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetModelRequest]
  }
  
  @scala.inline
  implicit class DescribeAssetModelRequestMutableBuilder[Self <: DescribeAssetModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setAssetModelId(value: ID): Self = StObject.set(x, "assetModelId", value.asInstanceOf[js.Any])
  }
}
