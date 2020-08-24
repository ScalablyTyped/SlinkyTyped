package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new ContactPoint.
  * @property localPoint - The point on the entity where the contact occurred, relative to the entity.
  * @property localPointOther - The point on the other entity where the contact occurred, relative to the other entity.
  * @property point - The point on the entity where the contact occurred, in world space.
  * @property pointOther - The point on the other entity where the contact occurred, in world space.
  * @property normal - The normal vector of the contact on the other entity, in world space.
  * @param localPoint - The point on the entity where the contact occurred, relative to the entity.
  * @param localPointOther - The point on the other entity where the contact occurred, relative to the other entity.
  * @param point - The point on the entity where the contact occurred, in world space.
  * @param pointOther - The point on the other entity where the contact occurred, in world space.
  * @param normal - The normal vector of the contact on the other entity, in world space.
  */
@JSGlobal("pc.ContactPoint")
@js.native
class ContactPoint protected ()
  extends typingsSlinky.playcanvas.pc.ContactPoint {
  def this(
    localPoint: typingsSlinky.playcanvas.pc.Vec3,
    localPointOther: typingsSlinky.playcanvas.pc.Vec3,
    point: typingsSlinky.playcanvas.pc.Vec3,
    pointOther: typingsSlinky.playcanvas.pc.Vec3,
    normal: typingsSlinky.playcanvas.pc.Vec3
  ) = this()
}

