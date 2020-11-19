package typingsSlinky.popmotionPopcorn.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.popmotionPopcorn.typesMod.Point2D
  - typingsSlinky.popmotionPopcorn.typesMod.Point3D
*/
trait Point extends js.Object
object Point {
  
  @scala.inline
  def Point2D(x: Double, y: Double): Point = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  def Point3D(x: Double, y: Double, z: Double): Point = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}
