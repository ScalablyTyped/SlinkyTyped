package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ByoipCidr extends StObject {
  
  /**
    * The address range, in CIDR notation.
    */
  var Cidr: js.UndefOr[String] = js.native
  
  /**
    * The description of the address range.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The state of the address pool.
    */
  var State: js.UndefOr[ByoipCidrState] = js.native
  
  /**
    * Upon success, contains the ID of the address pool. Otherwise, contains an error message.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}
object ByoipCidr {
  
  @scala.inline
  def apply(): ByoipCidr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByoipCidr]
  }
  
  @scala.inline
  implicit class ByoipCidrMutableBuilder[Self <: ByoipCidr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setState(value: ByoipCidrState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}
