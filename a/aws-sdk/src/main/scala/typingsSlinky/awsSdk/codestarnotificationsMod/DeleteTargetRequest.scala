package typingsSlinky.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTargetRequest extends StObject {
  
  /**
    * A Boolean value that can be used to delete all associations with this SNS topic. The default value is FALSE. If set to TRUE, all associations between that target and every notification rule in your AWS account are deleted.
    */
  var ForceUnsubscribeAll: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.ForceUnsubscribeAll] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the SNS topic to delete.
    */
  var TargetAddress: typingsSlinky.awsSdk.codestarnotificationsMod.TargetAddress = js.native
}
object DeleteTargetRequest {
  
  @scala.inline
  def apply(TargetAddress: TargetAddress): DeleteTargetRequest = {
    val __obj = js.Dynamic.literal(TargetAddress = TargetAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTargetRequest]
  }
  
  @scala.inline
  implicit class DeleteTargetRequestMutableBuilder[Self <: DeleteTargetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceUnsubscribeAll(value: ForceUnsubscribeAll): Self = StObject.set(x, "ForceUnsubscribeAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUnsubscribeAllUndefined: Self = StObject.set(x, "ForceUnsubscribeAll", js.undefined)
    
    @scala.inline
    def setTargetAddress(value: TargetAddress): Self = StObject.set(x, "TargetAddress", value.asInstanceOf[js.Any])
  }
}
