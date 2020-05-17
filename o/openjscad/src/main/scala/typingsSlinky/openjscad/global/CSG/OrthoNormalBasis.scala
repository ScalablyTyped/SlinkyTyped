package typingsSlinky.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.OrthoNormalBasis")
@js.native
class OrthoNormalBasis protected ()
  extends typingsSlinky.openjscad.CSG.OrthoNormalBasis {
  def this(plane: typingsSlinky.openjscad.CSG.Plane) = this()
  def this(plane: typingsSlinky.openjscad.CSG.Plane, rightvector: typingsSlinky.openjscad.CSG.Vector3D) = this()
}

/* static members */
@JSGlobal("CSG.OrthoNormalBasis")
@js.native
object OrthoNormalBasis extends js.Object {
  def GetCartesian(xaxisid: String, yaxisid: String): typingsSlinky.openjscad.CSG.OrthoNormalBasis = js.native
  def Z0Plane(): typingsSlinky.openjscad.CSG.OrthoNormalBasis = js.native
}

