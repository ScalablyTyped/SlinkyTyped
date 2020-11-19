package typingsSlinky.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.ConvexPolyhedron")
@js.native
class ConvexPolyhedron ()
  extends typingsSlinky.cannon.CANNON.ConvexPolyhedron {
  def this(points: js.Array[typingsSlinky.cannon.CANNON.Vec3]) = this()
  def this(points: js.UndefOr[scala.Nothing], faces: js.Array[Double]) = this()
  def this(points: js.Array[typingsSlinky.cannon.CANNON.Vec3], faces: js.Array[Double]) = this()
}
/* static members */
@JSGlobal("CANNON.ConvexPolyhedron")
@js.native
object ConvexPolyhedron extends js.Object {
  
  def computeNormal(
    va: typingsSlinky.cannon.CANNON.Vec3,
    vb: typingsSlinky.cannon.CANNON.Vec3,
    vc: typingsSlinky.cannon.CANNON.Vec3,
    target: typingsSlinky.cannon.CANNON.Vec3
  ): Unit = js.native
  
  def project(
    hull: typingsSlinky.cannon.CANNON.ConvexPolyhedron,
    axis: typingsSlinky.cannon.CANNON.Vec3,
    pos: typingsSlinky.cannon.CANNON.Vec3,
    quat: typingsSlinky.cannon.CANNON.Quaternion,
    result: js.Array[Double]
  ): Unit = js.native
}
