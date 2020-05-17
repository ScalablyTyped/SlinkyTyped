package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.SingleContactResult
  * @classdesc Object holding the result of a contact between two rigid bodies.
  * @description Create a new SingleContactResult.
  * @param {pc.Entity} a - The first entity involved in the contact.
  * @param {pc.Entity} b - The second entity involved in the contact.
  * @param {pc.ContactPoint} contactPoint - The contact point between the two entities.
  * @property {pc.Entity} a The first entity involved in the contact.
  * @property {pc.Entity} b The second entity involved in the contact.
  * @property {pc.Vec3} localPointA The point on Entity A where the contact occurred, relative to A.
  * @property {pc.Vec3} localPointB The point on Entity B where the contact occurred, relative to B.
  * @property {pc.Vec3} pointA The point on Entity A where the contact occurred, in world space.
  * @property {pc.Vec3} pointB The point on Entity B where the contact occurred, in world space.
  * @property {pc.Vec3} normal The normal vector of the contact on Entity B, in world space.
  */
@js.native
trait SingleContactResult extends js.Object {
  /**
    * The first entity involved in the contact.
    */
  var a: Entity = js.native
  /**
    * The second entity involved in the contact.
    */
  var b: Entity = js.native
  /**
    * The point on Entity A where the contact occurred, relative to A.
    */
  var localPointA: Vec3 = js.native
  /**
    * The point on Entity B where the contact occurred, relative to B.
    */
  var localPointB: Vec3 = js.native
  /**
    * The normal vector of the contact on Entity B, in world space.
    */
  var normal: Vec3 = js.native
  /**
    * The point on Entity A where the contact occurred, in world space.
    */
  var pointA: Vec3 = js.native
  /**
    * The point on Entity B where the contact occurred, in world space.
    */
  var pointB: Vec3 = js.native
}

object SingleContactResult {
  @scala.inline
  def apply(
    a: Entity,
    b: Entity,
    localPointA: Vec3,
    localPointB: Vec3,
    normal: Vec3,
    pointA: Vec3,
    pointB: Vec3
  ): SingleContactResult = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], localPointA = localPointA.asInstanceOf[js.Any], localPointB = localPointB.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], pointA = pointA.asInstanceOf[js.Any], pointB = pointB.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleContactResult]
  }
  @scala.inline
  implicit class SingleContactResultOps[Self <: SingleContactResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withB(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalPointA(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPointA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalPointB(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPointB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormal(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointA(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointB(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointB")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

