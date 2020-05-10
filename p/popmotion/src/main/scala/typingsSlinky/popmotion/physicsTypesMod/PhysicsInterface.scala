package typingsSlinky.popmotion.physicsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicsInterface extends js.Object {
  def set(v: Double): PhysicsInterface = js.native
  def setAcceleration(v: Double): PhysicsInterface = js.native
  def setFriction(v: Double): PhysicsInterface = js.native
  def setSpringStrength(v: Double): PhysicsInterface = js.native
  def setSpringTarget(v: Double): PhysicsInterface = js.native
  def setVelocity(v: Double): PhysicsInterface = js.native
  def stop(): Unit = js.native
}

object PhysicsInterface {
  @scala.inline
  def apply(
    set: Double => PhysicsInterface,
    setAcceleration: Double => PhysicsInterface,
    setFriction: Double => PhysicsInterface,
    setSpringStrength: Double => PhysicsInterface,
    setSpringTarget: Double => PhysicsInterface,
    setVelocity: Double => PhysicsInterface,
    stop: () => Unit
  ): PhysicsInterface = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set), setAcceleration = js.Any.fromFunction1(setAcceleration), setFriction = js.Any.fromFunction1(setFriction), setSpringStrength = js.Any.fromFunction1(setSpringStrength), setSpringTarget = js.Any.fromFunction1(setSpringTarget), setVelocity = js.Any.fromFunction1(setVelocity), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[PhysicsInterface]
  }
  @scala.inline
  implicit class PhysicsInterfaceOps[Self <: PhysicsInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSet(value: Double => PhysicsInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAcceleration(value: Double => PhysicsInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAcceleration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFriction(value: Double => PhysicsInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFriction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSpringStrength(value: Double => PhysicsInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSpringStrength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSpringTarget(value: Double => PhysicsInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSpringTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVelocity(value: Double => PhysicsInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVelocity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

