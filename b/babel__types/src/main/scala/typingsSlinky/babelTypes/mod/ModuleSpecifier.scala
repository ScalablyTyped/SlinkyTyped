package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.ExportSpecifier_
  - typingsSlinky.babelTypes.mod.ImportDefaultSpecifier_
  - typingsSlinky.babelTypes.mod.ImportNamespaceSpecifier_
  - typingsSlinky.babelTypes.mod.ImportSpecifier_
  - typingsSlinky.babelTypes.mod.ExportDefaultSpecifier_
  - typingsSlinky.babelTypes.mod.ExportNamespaceSpecifier_
*/
trait ModuleSpecifier extends Node

object ModuleSpecifier {
  @scala.inline
  implicit def apply(value: ExportDefaultSpecifier_): ModuleSpecifier = value.asInstanceOf[ModuleSpecifier]
  @scala.inline
  implicit def apply(value: ExportNamespaceSpecifier_): ModuleSpecifier = value.asInstanceOf[ModuleSpecifier]
  @scala.inline
  implicit def apply(value: ExportSpecifier_): ModuleSpecifier = value.asInstanceOf[ModuleSpecifier]
  @scala.inline
  implicit def apply(value: ImportDefaultSpecifier_): ModuleSpecifier = value.asInstanceOf[ModuleSpecifier]
  @scala.inline
  implicit def apply(value: ImportNamespaceSpecifier_): ModuleSpecifier = value.asInstanceOf[ModuleSpecifier]
  @scala.inline
  implicit def apply(value: ImportSpecifier_): ModuleSpecifier = value.asInstanceOf[ModuleSpecifier]
}

