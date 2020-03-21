package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonVariance
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypePropertyBuilder extends js.Object {
  def apply(key: IdentifierKind, value: FlowTypeKind, optional: Boolean): ObjectTypeProperty = js.native
  def apply(key: LiteralKind, value: FlowTypeKind, optional: Boolean): ObjectTypeProperty = js.native
  def from(params: AnonVariance): ObjectTypeProperty = js.native
}

