package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteChapCredentialsOutput extends StObject {
  
  /**
    * The iSCSI initiator that connects to the target.
    */
  var InitiatorName: js.UndefOr[IqnName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the target.
    */
  var TargetARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TargetARN] = js.native
}
object DeleteChapCredentialsOutput {
  
  @scala.inline
  def apply(): DeleteChapCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteChapCredentialsOutput]
  }
  
  @scala.inline
  implicit class DeleteChapCredentialsOutputMutableBuilder[Self <: DeleteChapCredentialsOutput] (val x: Self) extends AnyVal {
    
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
