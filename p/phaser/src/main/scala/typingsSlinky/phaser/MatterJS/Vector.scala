package typingsSlinky.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Vector` module contains methods for creating and manipulating vectors.
  * Vectors are the basis of all the geometry related operations in the engine.
  * A `Matter.Vector` object is of the form `{ x: 0, y: 0 }`.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class Vector
  */
@js.native
trait Vector extends StObject {
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Vector {
  
  @scala.inline
  def apply(x: Double, y: Double): Vector = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vector]
  }
  
  @scala.inline
  implicit class VectorMutableBuilder[Self <: Vector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
