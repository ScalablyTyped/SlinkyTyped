package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constraint extends js.Object {
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var collideConnected: Boolean = js.native
  var equations: js.Array[_] = js.native
  var id: Double = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def update(): Unit = js.native
}

object Constraint {
  @scala.inline
  def apply(
    bodyA: Body,
    bodyB: Body,
    collideConnected: Boolean,
    disable: () => Unit,
    enable: () => Unit,
    equations: js.Array[_],
    id: Double,
    update: () => Unit
  ): Constraint = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), equations = equations.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Constraint]
  }
  @scala.inline
  implicit class ConstraintOps[Self <: Constraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyA(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyB(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollideConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collideConnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEquations(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

