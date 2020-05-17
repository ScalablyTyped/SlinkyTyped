package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.ExportAllDeclaration_
  - typingsSlinky.babelTypes.mod.ExportDefaultDeclaration_
  - typingsSlinky.babelTypes.mod.ExportNamedDeclaration_
  - typingsSlinky.babelTypes.mod.ImportDeclaration_
*/
trait ModuleDeclaration extends Node

object ModuleDeclaration {
  @scala.inline
  implicit def apply(value: ExportAllDeclaration_): ModuleDeclaration = value.asInstanceOf[ModuleDeclaration]
  @scala.inline
  implicit def apply(value: ExportDefaultDeclaration_): ModuleDeclaration = value.asInstanceOf[ModuleDeclaration]
  @scala.inline
  implicit def apply(value: ExportNamedDeclaration_): ModuleDeclaration = value.asInstanceOf[ModuleDeclaration]
  @scala.inline
  implicit def apply(value: ImportDeclaration_): ModuleDeclaration = value.asInstanceOf[ModuleDeclaration]
}

