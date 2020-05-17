package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shape extends js.Object {
  var boundingSphereRadius: Double = js.native
  var collisionResponse: Boolean = js.native
  var `type`: Double = js.native
  def calculateLocalInertia(mass: Double, target: Vec3): Vec3 = js.native
  def updateBoundingSphereRadius(): Double = js.native
  def volume(): Double = js.native
}

object Shape {
  @scala.inline
  def apply(
    boundingSphereRadius: Double,
    calculateLocalInertia: (Double, Vec3) => Vec3,
    collisionResponse: Boolean,
    `type`: Double,
    updateBoundingSphereRadius: () => Double,
    volume: () => Double
  ): Shape = {
    val __obj = js.Dynamic.literal(boundingSphereRadius = boundingSphereRadius.asInstanceOf[js.Any], calculateLocalInertia = js.Any.fromFunction2(calculateLocalInertia), collisionResponse = collisionResponse.asInstanceOf[js.Any], updateBoundingSphereRadius = js.Any.fromFunction0(updateBoundingSphereRadius), volume = js.Any.fromFunction0(volume))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  implicit class ShapeOps[Self <: Shape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingSphereRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingSphereRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalculateLocalInertia(value: (Double, Vec3) => Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateLocalInertia")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCollisionResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateBoundingSphereRadius(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBoundingSphereRadius")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVolume(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

