package typingsSlinky.iotaLibJs.anon

import typingsSlinky.iotaLibJs.mod.InputObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Balance extends StObject {
  
  var addresses: js.Array[String] = js.native
  
  var balance: Double = js.native
  
  var inputs: js.Array[InputObject] = js.native
  
  var latestAddress: String = js.native
  
  var transfers: js.Array[String] = js.native
}
object Balance {
  
  @scala.inline
  def apply(
    addresses: js.Array[String],
    balance: Double,
    inputs: js.Array[InputObject],
    latestAddress: String,
    transfers: js.Array[String]
  ): Balance = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], latestAddress = latestAddress.asInstanceOf[js.Any], transfers = transfers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Balance]
  }
  
  @scala.inline
  implicit class BalanceMutableBuilder[Self <: Balance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: js.Array[InputObject]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: InputObject*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setLatestAddress(value: String): Self = StObject.set(x, "latestAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfers(value: js.Array[String]): Self = StObject.set(x, "transfers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfersVarargs(value: String*): Self = StObject.set(x, "transfers", js.Array(value :_*))
  }
}
