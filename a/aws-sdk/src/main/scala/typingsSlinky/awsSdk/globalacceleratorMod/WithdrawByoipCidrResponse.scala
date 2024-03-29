package typingsSlinky.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithdrawByoipCidrResponse extends StObject {
  
  /**
    * Information about the address pool.
    */
  var ByoipCidr: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.ByoipCidr] = js.native
}
object WithdrawByoipCidrResponse {
  
  @scala.inline
  def apply(): WithdrawByoipCidrResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithdrawByoipCidrResponse]
  }
  
  @scala.inline
  implicit class WithdrawByoipCidrResponseMutableBuilder[Self <: WithdrawByoipCidrResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByoipCidr(value: ByoipCidr): Self = StObject.set(x, "ByoipCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByoipCidrUndefined: Self = StObject.set(x, "ByoipCidr", js.undefined)
  }
}
