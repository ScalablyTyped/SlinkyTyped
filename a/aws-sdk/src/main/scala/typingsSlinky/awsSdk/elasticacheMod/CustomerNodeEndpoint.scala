package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerNodeEndpoint extends StObject {
  
  /**
    * The address of the node endpoint
    */
  var Address: js.UndefOr[String] = js.native
  
  /**
    * The port of the node endpoint
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
}
object CustomerNodeEndpoint {
  
  @scala.inline
  def apply(): CustomerNodeEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerNodeEndpoint]
  }
  
  @scala.inline
  implicit class CustomerNodeEndpointMutableBuilder[Self <: CustomerNodeEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
