package typingsSlinky.samchon.protocolMod

import typingsSlinky.sxml.sxmlMod.XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol", "IEntity")
@js.native
object IEntity extends js.Object {
  def construct(
    entity: typingsSlinky.samchon.protocolEntityIEntityMod.IEntity,
    xml: XML,
    prohibited_names: String*
  ): Unit = js.native
  def toXML(entity: typingsSlinky.samchon.protocolEntityIEntityMod.IEntity, prohibited_names: String*): XML = js.native
}

