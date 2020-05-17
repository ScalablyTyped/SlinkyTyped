package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaycastResult extends js.Object {
  var body: Body = js.native
  var distance: Double = js.native
  var hasHit: Boolean = js.native
  var hitNormalWorld: Vec3 = js.native
  var hitPointWorld: Vec3 = js.native
  var rayFromWorld: Vec3 = js.native
  var rayToWorld: Vec3 = js.native
  var shape: Shape = js.native
  def reset(): Unit = js.native
  def set(
    rayFromWorld: Vec3,
    rayToWorld: Vec3,
    hitNormalWorld: Vec3,
    hitPointWorld: Vec3,
    shape: Shape,
    body: Body,
    distance: Double
  ): Unit = js.native
}

object RaycastResult {
  @scala.inline
  def apply(
    body: Body,
    distance: Double,
    hasHit: Boolean,
    hitNormalWorld: Vec3,
    hitPointWorld: Vec3,
    rayFromWorld: Vec3,
    rayToWorld: Vec3,
    reset: () => Unit,
    set: (Vec3, Vec3, Vec3, Vec3, Shape, Body, Double) => Unit,
    shape: Shape
  ): RaycastResult = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], hasHit = hasHit.asInstanceOf[js.Any], hitNormalWorld = hitNormalWorld.asInstanceOf[js.Any], hitPointWorld = hitPointWorld.asInstanceOf[js.Any], rayFromWorld = rayFromWorld.asInstanceOf[js.Any], rayToWorld = rayToWorld.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction7(set), shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaycastResult]
  }
  @scala.inline
  implicit class RaycastResultOps[Self <: RaycastResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasHit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasHit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitNormalWorld(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitNormalWorld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitPointWorld(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitPointWorld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRayFromWorld(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rayFromWorld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRayToWorld(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rayToWorld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: (Vec3, Vec3, Vec3, Vec3, Shape, Body, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withShape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

