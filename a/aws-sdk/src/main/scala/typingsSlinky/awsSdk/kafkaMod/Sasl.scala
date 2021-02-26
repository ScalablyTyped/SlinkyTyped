package typingsSlinky.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sasl extends StObject {
  
  /**
    * 
    Details for SASL/SCRAM client authentication.
    
    */
  var Scram: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.Scram] = js.native
}
object Sasl {
  
  @scala.inline
  def apply(): Sasl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sasl]
  }
  
  @scala.inline
  implicit class SaslMutableBuilder[Self <: Sasl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScram(value: Scram): Self = StObject.set(x, "Scram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScramUndefined: Self = StObject.set(x, "Scram", js.undefined)
  }
}
