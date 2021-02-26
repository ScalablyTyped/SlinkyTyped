package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Destination extends StObject {
  
  /**
    * The recipients to place on the BCC: line of the message.
    */
  var BccAddresses: js.UndefOr[AddressList] = js.native
  
  /**
    * The recipients to place on the CC: line of the message.
    */
  var CcAddresses: js.UndefOr[AddressList] = js.native
  
  /**
    * The recipients to place on the To: line of the message.
    */
  var ToAddresses: js.UndefOr[AddressList] = js.native
}
object Destination {
  
  @scala.inline
  def apply(): Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destination]
  }
  
  @scala.inline
  implicit class DestinationMutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBccAddresses(value: AddressList): Self = StObject.set(x, "BccAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBccAddressesUndefined: Self = StObject.set(x, "BccAddresses", js.undefined)
    
    @scala.inline
    def setBccAddressesVarargs(value: Address*): Self = StObject.set(x, "BccAddresses", js.Array(value :_*))
    
    @scala.inline
    def setCcAddresses(value: AddressList): Self = StObject.set(x, "CcAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcAddressesUndefined: Self = StObject.set(x, "CcAddresses", js.undefined)
    
    @scala.inline
    def setCcAddressesVarargs(value: Address*): Self = StObject.set(x, "CcAddresses", js.Array(value :_*))
    
    @scala.inline
    def setToAddresses(value: AddressList): Self = StObject.set(x, "ToAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToAddressesUndefined: Self = StObject.set(x, "ToAddresses", js.undefined)
    
    @scala.inline
    def setToAddressesVarargs(value: Address*): Self = StObject.set(x, "ToAddresses", js.Array(value :_*))
  }
}
