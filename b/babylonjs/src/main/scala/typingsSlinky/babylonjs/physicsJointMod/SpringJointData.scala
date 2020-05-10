package typingsSlinky.babylonjs.physicsJointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpringJointData extends PhysicsJointData {
  /**
    * Damping of the spring
    */
  var damping: Double = js.native
  /**
    * Length of the spring
    */
  var length: Double = js.native
  /**
    * Stiffness of the spring
    */
  var stiffness: Double = js.native
  /** this callback will be called when applying the force to the impostors. */
  def forceApplicationCallback(): Unit = js.native
}

object SpringJointData {
  @scala.inline
  def apply(damping: Double, forceApplicationCallback: () => Unit, length: Double, stiffness: Double): SpringJointData = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], forceApplicationCallback = js.Any.fromFunction0(forceApplicationCallback), length = length.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringJointData]
  }
  @scala.inline
  implicit class SpringJointDataOps[Self <: SpringJointData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDamping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceApplicationCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceApplicationCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stiffness")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

