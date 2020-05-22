package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new SingleContactResult.
  * @property a - The first entity involved in the contact.
  * @property b - The second entity involved in the contact.
  * @property localPointA - The point on Entity A where the contact occurred, relative to A.
  * @property localPointB - The point on Entity B where the contact occurred, relative to B.
  * @property pointA - The point on Entity A where the contact occurred, in world space.
  * @property pointB - The point on Entity B where the contact occurred, in world space.
  * @property normal - The normal vector of the contact on Entity B, in world space.
  * @param a - The first entity involved in the contact.
  * @param b - The second entity involved in the contact.
  * @param contactPoint - The contact point between the two entities.
  */
@JSGlobal("pc.SingleContactResult")
@js.native
class SingleContactResult protected ()
  extends typingsSlinky.playcanvas.pc.SingleContactResult {
  def this(
    a: typingsSlinky.playcanvas.pc.Entity,
    b: typingsSlinky.playcanvas.pc.Entity,
    contactPoint: typingsSlinky.playcanvas.pc.ContactPoint
  ) = this()
  /**
    * The first entity involved in the contact.
    */
  /* CompleteClass */
  override var a: typingsSlinky.playcanvas.pc.Entity = js.native
  /**
    * The second entity involved in the contact.
    */
  /* CompleteClass */
  override var b: typingsSlinky.playcanvas.pc.Entity = js.native
  /**
    * The point on Entity A where the contact occurred, relative to A.
    */
  /* CompleteClass */
  override var localPointA: typingsSlinky.playcanvas.pc.Vec3 = js.native
  /**
    * The point on Entity B where the contact occurred, relative to B.
    */
  /* CompleteClass */
  override var localPointB: typingsSlinky.playcanvas.pc.Vec3 = js.native
  /**
    * The normal vector of the contact on Entity B, in world space.
    */
  /* CompleteClass */
  override var normal: typingsSlinky.playcanvas.pc.Vec3 = js.native
  /**
    * The point on Entity A where the contact occurred, in world space.
    */
  /* CompleteClass */
  override var pointA: typingsSlinky.playcanvas.pc.Vec3 = js.native
  /**
    * The point on Entity B where the contact occurred, in world space.
    */
  /* CompleteClass */
  override var pointB: typingsSlinky.playcanvas.pc.Vec3 = js.native
}

