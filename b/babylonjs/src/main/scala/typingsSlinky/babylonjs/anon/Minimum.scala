package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Minimum extends StObject {
  
  var maximum: Vector3 = js.native
  
  var minimum: Vector3 = js.native
}
object Minimum {
  
  @scala.inline
  def apply(maximum: Vector3, minimum: Vector3): Minimum = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Minimum]
  }
  
  @scala.inline
  implicit class MinimumMutableBuilder[Self <: Minimum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximum(value: Vector3): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum(value: Vector3): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
  }
}
