package typingsSlinky.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gravity extends StObject {
  
  var gravity: js.Array[Double] = js.native
}
object Gravity {
  
  @scala.inline
  def apply(gravity: js.Array[Double]): Gravity = {
    val __obj = js.Dynamic.literal(gravity = gravity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gravity]
  }
  
  @scala.inline
  implicit class GravityMutableBuilder[Self <: Gravity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGravity(value: js.Array[Double]): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravityVarargs(value: Double*): Self = StObject.set(x, "gravity", js.Array(value :_*))
  }
}
