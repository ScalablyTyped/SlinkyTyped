package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ExportedLoc
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportAllDeclarationBuilder extends js.Object {
  def apply(exported: Null, source: LiteralKind): ExportAllDeclaration = js.native
  def apply(exported: IdentifierKind, source: LiteralKind): ExportAllDeclaration = js.native
  def from(params: ExportedLoc): ExportAllDeclaration = js.native
}

