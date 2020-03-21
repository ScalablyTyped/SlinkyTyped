package typingsSlinky.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "PointToPointConstraint")
@js.native
class PointToPointConstraint protected ()
  extends typingsSlinky.cannon.CANNON.PointToPointConstraint {
  def this(
    bodyA: typingsSlinky.cannon.CANNON.Body,
    pivotA: typingsSlinky.cannon.CANNON.Vec3,
    bodyB: typingsSlinky.cannon.CANNON.Body,
    pivotB: typingsSlinky.cannon.CANNON.Vec3
  ) = this()
  def this(
    bodyA: typingsSlinky.cannon.CANNON.Body,
    pivotA: typingsSlinky.cannon.CANNON.Vec3,
    bodyB: typingsSlinky.cannon.CANNON.Body,
    pivotB: typingsSlinky.cannon.CANNON.Vec3,
    maxForce: Double
  ) = this()
}

