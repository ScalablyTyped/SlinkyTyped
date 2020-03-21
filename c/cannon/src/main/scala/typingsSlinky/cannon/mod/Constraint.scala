package typingsSlinky.cannon.mod

import typingsSlinky.cannon.CANNON.IConstraintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Constraint")
@js.native
class Constraint protected ()
  extends typingsSlinky.cannon.CANNON.Constraint {
  def this(bodyA: typingsSlinky.cannon.CANNON.Body, bodyB: typingsSlinky.cannon.CANNON.Body) = this()
  def this(
    bodyA: typingsSlinky.cannon.CANNON.Body,
    bodyB: typingsSlinky.cannon.CANNON.Body,
    options: IConstraintOptions
  ) = this()
}

