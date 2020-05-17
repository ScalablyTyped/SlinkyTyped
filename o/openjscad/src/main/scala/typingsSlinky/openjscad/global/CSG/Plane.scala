package typingsSlinky.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Plane")
@js.native
class Plane protected ()
  extends typingsSlinky.openjscad.CSG.Plane {
  def this(normal: typingsSlinky.openjscad.CSG.Vector3D, w: Double) = this()
}

/* static members */
@JSGlobal("CSG.Plane")
@js.native
object Plane extends js.Object {
  var EPSILON: Double = js.native
  def anyPlaneFromVector3Ds(
    a: typingsSlinky.openjscad.CSG.Vector3D,
    b: typingsSlinky.openjscad.CSG.Vector3D,
    c: typingsSlinky.openjscad.CSG.Vector3D
  ): typingsSlinky.openjscad.CSG.Plane = js.native
  def fromNormalAndPoint(normal: js.Array[Double], point: js.Array[Double]): typingsSlinky.openjscad.CSG.Plane = js.native
  def fromNormalAndPoint(normal: typingsSlinky.openjscad.CSG.Vector3D, point: typingsSlinky.openjscad.CSG.Vector3D): typingsSlinky.openjscad.CSG.Plane = js.native
  def fromObject(obj: js.Any): typingsSlinky.openjscad.CSG.Plane = js.native
  def fromPoints(
    a: typingsSlinky.openjscad.CSG.Vector3D,
    b: typingsSlinky.openjscad.CSG.Vector3D,
    c: typingsSlinky.openjscad.CSG.Vector3D
  ): typingsSlinky.openjscad.CSG.Plane = js.native
  def fromVector3Ds(
    a: typingsSlinky.openjscad.CSG.Vector3D,
    b: typingsSlinky.openjscad.CSG.Vector3D,
    c: typingsSlinky.openjscad.CSG.Vector3D
  ): typingsSlinky.openjscad.CSG.Plane = js.native
}

