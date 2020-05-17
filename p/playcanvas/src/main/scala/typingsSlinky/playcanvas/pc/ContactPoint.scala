package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ContactPoint
  * @classdesc Object holding the result of a contact between two Entities.
  * @description Create a new ContactPoint.
  * @param {pc.Vec3} localPoint - The point on the entity where the contact occurred, relative to the entity.
  * @param {pc.Vec3} localPointOther - The point on the other entity where the contact occurred, relative to the other entity.
  * @param {pc.Vec3} point - The point on the entity where the contact occurred, in world space.
  * @param {pc.Vec3} pointOther - The point on the other entity where the contact occurred, in world space.
  * @param {pc.Vec3} normal - The normal vector of the contact on the other entity, in world space.
  * @property {pc.Vec3} localPoint The point on the entity where the contact occurred, relative to the entity.
  * @property {pc.Vec3} localPointOther The point on the other entity where the contact occurred, relative to the other entity.
  * @property {pc.Vec3} point The point on the entity where the contact occurred, in world space.
  * @property {pc.Vec3} pointOther The point on the other entity where the contact occurred, in world space.
  * @property {pc.Vec3} normal The normal vector of the contact on the other entity, in world space.
  */
@js.native
trait ContactPoint extends js.Object {
  /**
    * The point on the entity where the contact occurred, relative to the entity.
    */
  var localPoint: Vec3 = js.native
  /**
    * The point on the other entity where the contact occurred, relative to the other entity.
    */
  var localPointOther: Vec3 = js.native
  /**
    * The normal vector of the contact on the other entity, in world space.
    */
  var normal: Vec3 = js.native
  /**
    * The point on the entity where the contact occurred, in world space.
    */
  var point: Vec3 = js.native
  /**
    * The point on the other entity where the contact occurred, in world space.
    */
  var pointOther: Vec3 = js.native
}

object ContactPoint {
  @scala.inline
  def apply(localPoint: Vec3, localPointOther: Vec3, normal: Vec3, point: Vec3, pointOther: Vec3): ContactPoint = {
    val __obj = js.Dynamic.literal(localPoint = localPoint.asInstanceOf[js.Any], localPointOther = localPointOther.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], pointOther = pointOther.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactPoint]
  }
  @scala.inline
  implicit class ContactPointOps[Self <: ContactPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalPoint(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalPointOther(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPointOther")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormal(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointOther(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointOther")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

