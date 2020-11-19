package typingsSlinky.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CSG.Vector3D")
@js.native
class Vector3D protected ()
  extends typingsSlinky.openjscad.CSG.Vector3D {
  def this(v2: js.Array[Double]) = this()
  def this(v2: typingsSlinky.openjscad.CSG.Vector2D) = this()
  def this(v3: typingsSlinky.openjscad.CSG.Vector3D) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
}
/* static members */
@JSGlobal("CSG.Vector3D")
@js.native
object Vector3D extends js.Object {
  
  def Create(x: Double, y: Double, z: Double): typingsSlinky.openjscad.CSG.Vector3D = js.native
}
