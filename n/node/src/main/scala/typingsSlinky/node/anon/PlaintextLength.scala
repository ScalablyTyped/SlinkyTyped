package typingsSlinky.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaintextLength extends StObject {
  
  var plaintextLength: Double = js.native
}
object PlaintextLength {
  
  @scala.inline
  def apply(plaintextLength: Double): PlaintextLength = {
    val __obj = js.Dynamic.literal(plaintextLength = plaintextLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaintextLength]
  }
  
  @scala.inline
  implicit class PlaintextLengthMutableBuilder[Self <: PlaintextLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaintextLength(value: Double): Self = StObject.set(x, "plaintextLength", value.asInstanceOf[js.Any])
  }
}
