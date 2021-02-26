package typingsSlinky.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAddressResult extends StObject {
  
  /**
    * The automatically generated ID for a specific address. You'll use this ID when you create a job to specify which address you want the Snow device for that job shipped to.
    */
  var AddressId: js.UndefOr[String] = js.native
}
object CreateAddressResult {
  
  @scala.inline
  def apply(): CreateAddressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAddressResult]
  }
  
  @scala.inline
  implicit class CreateAddressResultMutableBuilder[Self <: CreateAddressResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressId(value: String): Self = StObject.set(x, "AddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressIdUndefined: Self = StObject.set(x, "AddressId", js.undefined)
  }
}
