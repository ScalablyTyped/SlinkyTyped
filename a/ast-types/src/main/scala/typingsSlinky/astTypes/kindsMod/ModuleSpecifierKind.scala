package typingsSlinky.astTypes.kindsMod

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
*/
trait ModuleSpecifierKind extends js.Object

object ModuleSpecifierKind {
  @scala.inline
  implicit def apply(value: ExportSpecifier): ModuleSpecifierKind = value.asInstanceOf[ModuleSpecifierKind]
  @scala.inline
  implicit def apply(value: ImportDefaultSpecifier): ModuleSpecifierKind = value.asInstanceOf[ModuleSpecifierKind]
  @scala.inline
  implicit def apply(value: ImportNamespaceSpecifier): ModuleSpecifierKind = value.asInstanceOf[ModuleSpecifierKind]
  @scala.inline
  implicit def apply(value: ImportSpecifier): ModuleSpecifierKind = value.asInstanceOf[ModuleSpecifierKind]
}

