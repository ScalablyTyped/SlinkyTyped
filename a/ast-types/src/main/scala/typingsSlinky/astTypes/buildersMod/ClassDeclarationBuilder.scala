package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonImplements
import typingsSlinky.astTypes.kindsMod.ClassBodyKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassDeclarationBuilder extends js.Object {
  def apply(id: Null, body: ClassBodyKind): ClassDeclaration = js.native
  def apply(id: Null, body: ClassBodyKind, superClass: ExpressionKind): ClassDeclaration = js.native
  def apply(id: IdentifierKind, body: ClassBodyKind): ClassDeclaration = js.native
  def apply(id: IdentifierKind, body: ClassBodyKind, superClass: ExpressionKind): ClassDeclaration = js.native
  def from(params: AnonImplements): ClassDeclaration = js.native
}

