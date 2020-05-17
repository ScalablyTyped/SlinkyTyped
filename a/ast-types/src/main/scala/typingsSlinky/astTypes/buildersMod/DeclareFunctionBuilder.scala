package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsIdLoc
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareFunctionBuilder extends js.Object {
  def apply(id: IdentifierKind): DeclareFunction = js.native
  def from(params: CommentsIdLoc): DeclareFunction = js.native
}

