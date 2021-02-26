package typingsSlinky.pkcs11js.Pkcs11Js

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mechanism extends StObject {
  
  var mechanism: Double = js.native
  
  var parameter: js.UndefOr[Buffer | IParams] = js.native
}
object Mechanism {
  
  @scala.inline
  def apply(mechanism: Double): Mechanism = {
    val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mechanism]
  }
  
  @scala.inline
  implicit class MechanismMutableBuilder[Self <: Mechanism] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMechanism(value: Double): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameter(value: Buffer | IParams): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
  }
}
