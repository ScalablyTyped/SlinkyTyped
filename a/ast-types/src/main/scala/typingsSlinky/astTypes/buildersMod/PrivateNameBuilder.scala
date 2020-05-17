package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsIdLoc
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateNameBuilder extends js.Object {
  def apply(id: IdentifierKind): PrivateName = js.native
  def from(params: CommentsIdLoc): PrivateName = js.native
}

