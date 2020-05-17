package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsExtends
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareClassBuilder extends js.Object {
  def apply(id: IdentifierKind): DeclareClass = js.native
  def from(params: CommentsExtends): DeclareClass = js.native
}

