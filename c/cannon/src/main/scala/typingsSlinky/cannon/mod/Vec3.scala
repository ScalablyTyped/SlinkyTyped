package typingsSlinky.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Vec3")
@js.native
class Vec3 ()
  extends typingsSlinky.cannon.CANNON.Vec3 {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
}

/* static members */
@JSImport("cannon", "Vec3")
@js.native
object Vec3 extends js.Object {
  var ZERO: typingsSlinky.cannon.CANNON.Vec3 = js.native
}

