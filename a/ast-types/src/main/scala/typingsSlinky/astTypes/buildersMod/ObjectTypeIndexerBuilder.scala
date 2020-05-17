package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsId
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypeIndexerBuilder extends js.Object {
  def apply(id: IdentifierKind, key: FlowTypeKind, value: FlowTypeKind): ObjectTypeIndexer = js.native
  def from(params: CommentsId): ObjectTypeIndexer = js.native
}

