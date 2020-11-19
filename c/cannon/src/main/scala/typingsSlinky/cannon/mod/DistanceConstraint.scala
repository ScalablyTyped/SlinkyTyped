package typingsSlinky.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "DistanceConstraint")
@js.native
class DistanceConstraint protected ()
  extends typingsSlinky.cannon.CANNON.Constraint {
  def this(bodyA: typingsSlinky.cannon.CANNON.Body, bodyB: typingsSlinky.cannon.CANNON.Body, distance: Double) = this()
  def this(
    bodyA: typingsSlinky.cannon.CANNON.Body,
    bodyB: typingsSlinky.cannon.CANNON.Body,
    distance: Double,
    maxForce: Double
  ) = this()
}
