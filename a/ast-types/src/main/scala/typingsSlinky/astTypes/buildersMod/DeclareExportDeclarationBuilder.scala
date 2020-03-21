package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonDeclaration
import typingsSlinky.astTypes.kindsMod.DeclareClassKind
import typingsSlinky.astTypes.kindsMod.DeclareFunctionKind
import typingsSlinky.astTypes.kindsMod.DeclareVariableKind
import typingsSlinky.astTypes.kindsMod.ExportBatchSpecifierKind
import typingsSlinky.astTypes.kindsMod.ExportSpecifierKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareExportDeclarationBuilder extends js.Object {
  def apply(defaultParam: Boolean): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def apply(defaultParam: Boolean, declaration: DeclareClassKind): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: DeclareClassKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: DeclareClassKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def apply(defaultParam: Boolean, declaration: DeclareFunctionKind): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: DeclareFunctionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: DeclareFunctionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def apply(defaultParam: Boolean, declaration: DeclareVariableKind): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: DeclareVariableKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: DeclareVariableKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def apply(defaultParam: Boolean, declaration: FlowTypeKind): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: FlowTypeKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: FlowTypeKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def from(params: AnonDeclaration): DeclareExportDeclaration = js.native
}

