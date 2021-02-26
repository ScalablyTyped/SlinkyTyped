package typingsSlinky.overwatchApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Endorsement extends StObject {
  
  var rate: Double = js.native
  
  var value: Double = js.native
}
object Endorsement {
  
  @scala.inline
  def apply(rate: Double, value: Double): Endorsement = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endorsement]
  }
  
  @scala.inline
  implicit class EndorsementMutableBuilder[Self <: Endorsement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
