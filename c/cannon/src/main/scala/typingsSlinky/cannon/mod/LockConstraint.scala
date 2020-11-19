package typingsSlinky.cannon.mod

import typingsSlinky.cannon.CANNON.ILockConstraintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "LockConstraint")
@js.native
class LockConstraint protected ()
  extends typingsSlinky.cannon.CANNON.Constraint {
  def this(bodyA: typingsSlinky.cannon.CANNON.Body, bodyB: typingsSlinky.cannon.CANNON.Body) = this()
  def this(
    bodyA: typingsSlinky.cannon.CANNON.Body,
    bodyB: typingsSlinky.cannon.CANNON.Body,
    options: ILockConstraintOptions
  ) = this()
}
