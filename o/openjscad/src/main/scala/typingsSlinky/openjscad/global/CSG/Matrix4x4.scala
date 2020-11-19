package typingsSlinky.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CSG.Matrix4x4")
@js.native
class Matrix4x4 ()
  extends typingsSlinky.openjscad.CSG.Matrix4x4 {
  def this(elements: js.Array[Double]) = this()
}
/* static members */
@JSGlobal("CSG.Matrix4x4")
@js.native
object Matrix4x4 extends js.Object {
  
  def mirroring(plane: typingsSlinky.openjscad.CSG.Plane): typingsSlinky.openjscad.CSG.Matrix4x4 = js.native
  
  def rotation(
    rotationCenter: typingsSlinky.openjscad.CSG.Vector3D,
    rotationAxis: typingsSlinky.openjscad.CSG.Vector3D,
    degrees: Double
  ): typingsSlinky.openjscad.CSG.Matrix4x4 = js.native
  
  def rotationX(degrees: Double): typingsSlinky.openjscad.CSG.Matrix4x4 = js.native
  
  def rotationY(degrees: Double): typingsSlinky.openjscad.CSG.Matrix4x4 = js.native
  
  def rotationZ(degrees: Double): typingsSlinky.openjscad.CSG.Matrix4x4 = js.native
  
  def scaling(v: js.Array[Double]): typingsSlinky.openjscad.CSG.Matrix4x4 = js.native
  def scaling(v: typingsSlinky.openjscad.CSG.Vector3D): typingsSlinky.openjscad.CSG.Matrix4x4 = js.native
  
  def translation(v: js.Array[Double]): typingsSlinky.openjscad.CSG.Matrix4x4 = js.native
  def translation(v: typingsSlinky.openjscad.CSG.Vector3D): typingsSlinky.openjscad.CSG.Matrix4x4 = js.native
  
  def unity(): typingsSlinky.openjscad.CSG.Matrix4x4 = js.native
}
