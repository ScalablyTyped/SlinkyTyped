package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.RaycastResult
  * @classdesc Object holding the result of a successful raycast hit.
  * @description Create a new RaycastResult.
  * @param {pc.Entity} entity - The entity that was hit.
  * @param {pc.Vec3} point - The point at which the ray hit the entity in world space.
  * @param {pc.Vec3} normal - The normal vector of the surface where the ray hit in world space.
  * @property {pc.Entity} entity The entity that was hit.
  * @property {pc.Vec3} point The point at which the ray hit the entity in world space.
  * @property {pc.Vec3} normal The normal vector of the surface where the ray hit in world space.
  */
@js.native
trait RaycastResult extends js.Object {
  /**
    * The entity that was hit.
    */
  var entity: Entity = js.native
  /**
    * The normal vector of the surface where the ray hit in world space.
    */
  var normal: Vec3 = js.native
  /**
    * The point at which the ray hit the entity in world space.
    */
  var point: Vec3 = js.native
}

object RaycastResult {
  @scala.inline
  def apply(entity: Entity, normal: Vec3, point: Vec3): RaycastResult = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaycastResult]
  }
  @scala.inline
  implicit class RaycastResultOps[Self <: RaycastResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntity(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
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
  }
  
}

