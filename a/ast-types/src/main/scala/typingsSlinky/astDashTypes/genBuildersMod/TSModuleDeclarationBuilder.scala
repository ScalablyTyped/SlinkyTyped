package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_BodyCommentsDeclare
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.StringLiteralKind
import typingsSlinky.astDashTypes.genKindsMod.TSModuleBlockKind
import typingsSlinky.astDashTypes.genKindsMod.TSModuleDeclarationKind
import typingsSlinky.astDashTypes.genKindsMod.TSQualifiedNameKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSModuleDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSModuleDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind): TSModuleDeclaration = js.native
  def apply(id: IdentifierKind, body: TSModuleBlockKind): TSModuleDeclaration = js.native
  def apply(id: IdentifierKind, body: TSModuleDeclarationKind): TSModuleDeclaration = js.native
  def apply(id: StringLiteralKind): TSModuleDeclaration = js.native
  def apply(id: StringLiteralKind, body: TSModuleBlockKind): TSModuleDeclaration = js.native
  def apply(id: StringLiteralKind, body: TSModuleDeclarationKind): TSModuleDeclaration = js.native
  def apply(id: TSQualifiedNameKind): TSModuleDeclaration = js.native
  def apply(id: TSQualifiedNameKind, body: TSModuleBlockKind): TSModuleDeclaration = js.native
  def apply(id: TSQualifiedNameKind, body: TSModuleDeclarationKind): TSModuleDeclaration = js.native
  def from(params: Anon_BodyCommentsDeclare): TSModuleDeclaration = js.native
}

