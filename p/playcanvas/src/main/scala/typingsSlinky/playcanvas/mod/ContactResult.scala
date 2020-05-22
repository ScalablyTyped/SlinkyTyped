package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new ContactResult.
  * @property other - The entity that was involved in the contact with this entity.
  * @property contacts - An array of ContactPoints with the other entity.
  * @param other - The entity that was involved in the contact with this entity.
  * @param contacts - An array of ContactPoints with the other entity.
  */
@JSImport("playcanvas", "ContactResult")
@js.native
class ContactResult protected ()
  extends typingsSlinky.playcanvas.pc.ContactResult {
  def this(
    other: typingsSlinky.playcanvas.pc.Entity,
    contacts: js.Array[typingsSlinky.playcanvas.pc.ContactPoint]
  ) = this()
  /**
    * An array of ContactPoints with the other entity.
    */
  /* CompleteClass */
  override var contacts: js.Array[typingsSlinky.playcanvas.pc.ContactPoint] = js.native
  /**
    * The entity that was involved in the contact with this entity.
    */
  /* CompleteClass */
  override var other: typingsSlinky.playcanvas.pc.Entity = js.native
}

