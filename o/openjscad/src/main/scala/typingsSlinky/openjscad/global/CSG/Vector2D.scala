package typingsSlinky.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CSG.Vector2D")
@js.native
class Vector2D protected ()
  extends typingsSlinky.openjscad.CSG.Vector2D {
  def this(x: js.Array[Double]) = this()
  def this(x: typingsSlinky.openjscad.CSG.Vector2D) = this()
  def this(x: Double, y: Double) = this()
}
/* static members */
@JSGlobal("CSG.Vector2D")
@js.native
object Vector2D extends js.Object {
  
  def Create(x: Double, y: Double): typingsSlinky.openjscad.CSG.Vector2D = js.native
  
  def fromAngle(radians: Double): typingsSlinky.openjscad.CSG.Vector2D = js.native
  
  def fromAngleDegrees(degrees: Double): typingsSlinky.openjscad.CSG.Vector2D = js.native
  
  def fromAngleRadians(radians: Double): typingsSlinky.openjscad.CSG.Vector2D = js.native
}
