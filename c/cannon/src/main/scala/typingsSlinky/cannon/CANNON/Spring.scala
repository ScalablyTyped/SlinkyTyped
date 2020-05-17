package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spring extends js.Object {
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var damping: Double = js.native
  var localAnchorA: Vec3 = js.native
  var localAnchorB: Vec3 = js.native
  var restLength: Double = js.native
  var stffness: Double = js.native
  def applyForce(): Unit = js.native
  def getWorldAnchorA(result: Vec3): Unit = js.native
  def getWorldAnchorB(result: Vec3): Unit = js.native
  def setWorldAnchorA(worldAnchorA: Vec3): Unit = js.native
  def setWorldAnchorB(worldAnchorB: Vec3): Unit = js.native
}

object Spring {
  @scala.inline
  def apply(
    applyForce: () => Unit,
    bodyA: Body,
    bodyB: Body,
    damping: Double,
    getWorldAnchorA: Vec3 => Unit,
    getWorldAnchorB: Vec3 => Unit,
    localAnchorA: Vec3,
    localAnchorB: Vec3,
    restLength: Double,
    setWorldAnchorA: Vec3 => Unit,
    setWorldAnchorB: Vec3 => Unit,
    stffness: Double
  ): Spring = {
    val __obj = js.Dynamic.literal(applyForce = js.Any.fromFunction0(applyForce), bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], damping = damping.asInstanceOf[js.Any], getWorldAnchorA = js.Any.fromFunction1(getWorldAnchorA), getWorldAnchorB = js.Any.fromFunction1(getWorldAnchorB), localAnchorA = localAnchorA.asInstanceOf[js.Any], localAnchorB = localAnchorB.asInstanceOf[js.Any], restLength = restLength.asInstanceOf[js.Any], setWorldAnchorA = js.Any.fromFunction1(setWorldAnchorA), setWorldAnchorB = js.Any.fromFunction1(setWorldAnchorB), stffness = stffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spring]
  }
  @scala.inline
  implicit class SpringOps[Self <: Spring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyForce(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyForce")(js.Any.fromFunction0(value))
        ret
    }
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
    def withDamping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetWorldAnchorA(value: Vec3 => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorldAnchorA")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWorldAnchorB(value: Vec3 => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorldAnchorB")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocalAnchorA(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAnchorA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalAnchorB(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAnchorB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetWorldAnchorA(value: Vec3 => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWorldAnchorA")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWorldAnchorB(value: Vec3 => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWorldAnchorB")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stffness")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

