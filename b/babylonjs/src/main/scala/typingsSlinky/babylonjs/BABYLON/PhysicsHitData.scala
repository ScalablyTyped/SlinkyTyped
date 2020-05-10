package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicsHitData extends js.Object {
  /**
    * The contact point
    */
  var contactPoint: Vector3 = js.native
  /**
    * The distance from the origin to the contact point
    */
  var distanceFromOrigin: Double = js.native
  /**
    * The force applied at the contact point
    */
  var force: Vector3 = js.native
}

object PhysicsHitData {
  @scala.inline
  def apply(contactPoint: Vector3, distanceFromOrigin: Double, force: Vector3): PhysicsHitData = {
    val __obj = js.Dynamic.literal(contactPoint = contactPoint.asInstanceOf[js.Any], distanceFromOrigin = distanceFromOrigin.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsHitData]
  }
  @scala.inline
  implicit class PhysicsHitDataOps[Self <: PhysicsHitData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactPoint(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceFromOrigin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceFromOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForce(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

