package typingsSlinky.plugapi.mod.Event

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vote extends StObject {
  
  var i: Double = js.native
  
  var v: Double = js.native
}
object Vote {
  
  @scala.inline
  def apply(i: Double, v: Double): Vote = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vote]
  }
  
  @scala.inline
  implicit class VoteMutableBuilder[Self <: Vote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
