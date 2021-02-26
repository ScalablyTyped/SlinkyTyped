package typingsSlinky.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.World` module contains methods for creating and manipulating the world composite.
  * A `Matter.World` is a `Matter.Composite` body, which is a collection of `Matter.Body`, `Matter.Constraint` and other `Matter.Composite`.
  * A `Matter.World` has a few additional properties including `gravity` and `bounds`.
  * It is important to use the functions in the `Matter.Composite` module to modify the world composite, rather than directly modifying its properties.
  * There are also a few methods here that alias those in `Matter.Composite` for easier readability.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class World
  * @extends Composite
  */
@js.native
trait World extends StObject {
  
  var bounds: Bounds = js.native
  
  var gravity: Gravity = js.native
}
object World {
  
  @scala.inline
  def apply(bounds: Bounds, gravity: Gravity): World = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any])
    __obj.asInstanceOf[World]
  }
  
  @scala.inline
  implicit class WorldMutableBuilder[Self <: World] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravity(value: Gravity): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
  }
}
