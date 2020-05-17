package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.ImportSpecifier
  - typingsSlinky.estree.mod.ImportDefaultSpecifier
  - typingsSlinky.estree.mod.ImportNamespaceSpecifier
  - typingsSlinky.estree.mod.ExportSpecifier
*/
trait ModuleSpecifier extends Node

object ModuleSpecifier {
  @scala.inline
  implicit def apply(value: ExportSpecifier): ModuleSpecifier = value.asInstanceOf[ModuleSpecifier]
  @scala.inline
  implicit def apply(value: ImportDefaultSpecifier): ModuleSpecifier = value.asInstanceOf[ModuleSpecifier]
  @scala.inline
  implicit def apply(value: ImportNamespaceSpecifier): ModuleSpecifier = value.asInstanceOf[ModuleSpecifier]
  @scala.inline
  implicit def apply(value: ImportSpecifier): ModuleSpecifier = value.asInstanceOf[ModuleSpecifier]
}

