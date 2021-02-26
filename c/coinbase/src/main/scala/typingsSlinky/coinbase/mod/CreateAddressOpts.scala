package typingsSlinky.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAddressOpts extends StObject {
  
  /**
    * Address label
    */
  var name: js.UndefOr[String] = js.native
}
object CreateAddressOpts {
  
  @scala.inline
  def apply(): CreateAddressOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAddressOpts]
  }
  
  @scala.inline
  implicit class CreateAddressOptsMutableBuilder[Self <: CreateAddressOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
