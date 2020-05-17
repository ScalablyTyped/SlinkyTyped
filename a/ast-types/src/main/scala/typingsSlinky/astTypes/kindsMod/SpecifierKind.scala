package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier
*/
trait SpecifierKind extends js.Object

object SpecifierKind {
  @scala.inline
  implicit def apply(value: ExportBatchSpecifier): SpecifierKind = value.asInstanceOf[SpecifierKind]
  @scala.inline
  implicit def apply(value: ExportDefaultSpecifier): SpecifierKind = value.asInstanceOf[SpecifierKind]
  @scala.inline
  implicit def apply(value: ExportNamespaceSpecifier): SpecifierKind = value.asInstanceOf[SpecifierKind]
  @scala.inline
  implicit def apply(value: ExportSpecifier): SpecifierKind = value.asInstanceOf[SpecifierKind]
  @scala.inline
  implicit def apply(value: ImportDefaultSpecifier): SpecifierKind = value.asInstanceOf[SpecifierKind]
  @scala.inline
  implicit def apply(value: ImportNamespaceSpecifier): SpecifierKind = value.asInstanceOf[SpecifierKind]
  @scala.inline
  implicit def apply(value: ImportSpecifier): SpecifierKind = value.asInstanceOf[SpecifierKind]
}

