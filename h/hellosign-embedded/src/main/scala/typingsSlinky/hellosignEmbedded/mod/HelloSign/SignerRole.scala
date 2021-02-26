package typingsSlinky.hellosignEmbedded.mod.HelloSign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignerRole extends StObject {
  
  var name: String = js.native
  
  var order: js.UndefOr[Double] = js.native
}
object SignerRole {
  
  @scala.inline
  def apply(name: String): SignerRole = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerRole]
  }
  
  @scala.inline
  implicit class SignerRoleMutableBuilder[Self <: SignerRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
