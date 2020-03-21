package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonDefault
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.ExportBatchSpecifierKind
import typingsSlinky.astTypes.kindsMod.ExportSpecifierKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportDeclarationBuilder extends js.Object {
  def apply(defaultParam: Boolean): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): ExportDeclaration = js.native
  def apply(defaultParam: Boolean, declaration: DeclarationKind): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: DeclarationKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: DeclarationKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): ExportDeclaration = js.native
  def apply(defaultParam: Boolean, declaration: ExpressionKind): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: ExpressionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: ExpressionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): ExportDeclaration = js.native
  def from(params: AnonDefault): ExportDeclaration = js.native
}

