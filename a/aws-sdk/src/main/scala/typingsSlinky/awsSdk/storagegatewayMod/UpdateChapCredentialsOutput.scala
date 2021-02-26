package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateChapCredentialsOutput extends StObject {
  
  /**
    * The iSCSI initiator that connects to the target. This is the same initiator name specified in the request.
    */
  var InitiatorName: js.UndefOr[IqnName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the target. This is the same target specified in the request.
    */
  var TargetARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TargetARN] = js.native
}
object UpdateChapCredentialsOutput {
  
  @scala.inline
  def apply(): UpdateChapCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChapCredentialsOutput]
  }
  
  @scala.inline
  implicit class UpdateChapCredentialsOutputMutableBuilder[Self <: UpdateChapCredentialsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitiatorName(value: IqnName): Self = StObject.set(x, "InitiatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiatorNameUndefined: Self = StObject.set(x, "InitiatorName", js.undefined)
    
    @scala.inline
    def setTargetARN(value: TargetARN): Self = StObject.set(x, "TargetARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetARNUndefined: Self = StObject.set(x, "TargetARN", js.undefined)
  }
}
