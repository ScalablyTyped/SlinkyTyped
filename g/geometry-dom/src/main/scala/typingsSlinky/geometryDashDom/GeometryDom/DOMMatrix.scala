package typingsSlinky.geometryDashDom.GeometryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMMatrix
  extends typingsSlinky.geometryDashDom.GeometryDom.DOMMatrixReadOnly {
  def invertSelf(): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def multiplySelf(other: typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def preMultiplySelf(other: typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: Double, z: Double, angle: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def rotateFromVectorSelf(x: Double, y: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def rotateSelf(angle: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def rotateSelf(angle: Double, originX: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def rotateSelf(angle: Double, originX: Double, originY: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scale3dSelf(scale: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double, originY: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double, originY: Double, originZ: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: Double, scaleY: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double, originY: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double, originY: Double, originZ: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleSelf(scale: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleSelf(scale: Double, originX: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleSelf(scale: Double, originX: Double, originY: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def setMatrixValue(transformList: typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def skewXSelf(sx: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def skewYSelf(sy: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def translateSelf(tx: Double, ty: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def translateSelf(tx: Double, ty: Double, tz: Double): typingsSlinky.geometryDashDom.GeometryDom.DOMMatrix = js.native
}

