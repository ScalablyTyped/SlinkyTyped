package typingsSlinky.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Matrix4x4")
@js.native
class Matrix4x4 ()
  extends typingsSlinky.openjscad.CSG.Matrix4x4 {
  def this(elements: js.Array[Double]) = this()
  /* CompleteClass */
  override var elements: js.Array[Double] = js.native
  /* CompleteClass */
  override def isMirroring(): Boolean = js.native
  /* CompleteClass */
  override def leftMultiply1x2Vector(v: typingsSlinky.openjscad.CSG.Vector2D): typingsSlinky.openjscad.CSG.Vector2D = js.native
  /* CompleteClass */
  override def leftMultiply1x3Vector(v: typingsSlinky.openjscad.CSG.Vector3D): typingsSlinky.openjscad.CSG.Vector3D = js.native
  /* CompleteClass */
  override def minus(m: typingsSlinky.openjscad.CSG.Matrix4x4): typingsSlinky.openjscad.CSG.Matrix4x4 = js.native
  /* CompleteClass */
  override def multiply(m: typingsSlinky.openjscad.CSG.Matrix4x4): typingsSlinky.openjscad.CSG.Matrix4x4 = js.native
  /* CompleteClass */
  override def plus(m: typingsSlinky.openjscad.CSG.Matrix4x4): typingsSlinky.openjscad.CSG.Matrix4x4 = js.native
  /* CompleteClass */
  override def rightMultiply1x2Vector(v: typingsSlinky.openjscad.CSG.Vector2D): typingsSlinky.openjscad.CSG.Vector2D = js.native
  /* CompleteClass */
  override def rightMultiply1x3Vector(v: typingsSlinky.openjscad.CSG.Vector3D): typingsSlinky.openjscad.CSG.Vector3D = js.native
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

