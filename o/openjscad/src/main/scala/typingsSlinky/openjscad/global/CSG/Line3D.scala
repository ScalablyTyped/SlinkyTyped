package typingsSlinky.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Line3D")
@js.native
class Line3D protected ()
  extends typingsSlinky.openjscad.CSG.Line3D {
  def this(point: typingsSlinky.openjscad.CSG.Vector3D, direction: typingsSlinky.openjscad.CSG.Vector3D) = this()
}

/* static members */
@JSGlobal("CSG.Line3D")
@js.native
object Line3D extends js.Object {
  def fromPlanes(p1: typingsSlinky.openjscad.CSG.Plane, p2: typingsSlinky.openjscad.CSG.Plane): typingsSlinky.openjscad.CSG.Line3D = js.native
  def fromPoints(p1: typingsSlinky.openjscad.CSG.Vector3D, p2: typingsSlinky.openjscad.CSG.Vector3D): typingsSlinky.openjscad.CSG.Line3D = js.native
}

