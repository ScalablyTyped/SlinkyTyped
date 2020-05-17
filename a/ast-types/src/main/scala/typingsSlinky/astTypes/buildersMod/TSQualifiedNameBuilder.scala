package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsLeftLoc
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSQualifiedName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSQualifiedNameBuilder extends js.Object {
  def apply(left: IdentifierKind, right: IdentifierKind): TSQualifiedName = js.native
  def apply(left: IdentifierKind, right: TSQualifiedNameKind): TSQualifiedName = js.native
  def apply(left: TSQualifiedNameKind, right: IdentifierKind): TSQualifiedName = js.native
  def apply(left: TSQualifiedNameKind, right: TSQualifiedNameKind): TSQualifiedName = js.native
  def from(params: CommentsLeftLoc): TSQualifiedName = js.native
}

