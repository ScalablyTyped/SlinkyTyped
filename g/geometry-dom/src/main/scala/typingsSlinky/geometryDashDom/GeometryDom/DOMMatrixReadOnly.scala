package typingsSlinky.geometryDashDom.GeometryDom

import typingsSlinky.geometryDashDom.DOMPointInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMMatrixReadOnly extends js.Object {
  /**
    * These attributes are simple aliases for certain elements of the 4x4 matrix
    */
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var e: Double = js.native
  var f: Double = js.native
  var is2D: Boolean = js.native
  var isIdentity: Boolean = js.native
  var m11: Double = js.native
  var m12: Double = js.native
  var m13: Double = js.native
  var m14: Double = js.native
  var m21: Double = js.native
  var m22: Double = js.native
  var m23: Double = js.native
  var m24: Double = js.native
  var m31: Double = js.native
  var m32: Double = js.native
  var m33: Double = js.native
  var m34: Double = js.native
  var m41: Double = js.native
  var m42: Double = js.native
  var m43: Double = js.native
  var m44: Double = js.native
  def flipX(): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def flipY(): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def inverse(): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def multiply(other: typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def rotate(angle: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def rotate(angle: Double, originX: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def rotate(angle: Double, originX: Double, originY: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def rotateAxisAngle(x: Double, y: Double, z: Double, angle: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def rotateFromVector(x: Double, y: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scale(scale: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scale(scale: Double, originX: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scale(scale: Double, originX: Double, originY: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scale3d(scale: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scale3d(scale: Double, originX: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scale3d(scale: Double, originX: Double, originY: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scale3d(scale: Double, originX: Double, originY: Double, originZ: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleNonUniform(
    scale: Double,
    scaleX: Double,
    scaleY: Double,
    scaleZ: Double,
    originX: Double,
    originY: Double,
    originZ: Double
  ): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def skewX(sx: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def skewY(sx: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def toFloat32Array(): js.Array[Double] = js.native
  def toFloat64Array(): js.Array[Double] = js.native
  def transformPoint(): typingsSlinky.geometryDashDom.GeometryDom.DOMPoint = js.native
  def transformPoint(point: DOMPointInit): typingsSlinky.geometryDashDom.GeometryDom.DOMPoint = js.native
  def translate(tx: Double, ty: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def translate(tx: Double, ty: Double, tz: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
}

