package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonMeta
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MetaProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaPropertyBuilder extends js.Object {
  def apply(meta: IdentifierKind, property: IdentifierKind): MetaProperty = js.native
  def from(params: AnonMeta): MetaProperty = js.native
}

