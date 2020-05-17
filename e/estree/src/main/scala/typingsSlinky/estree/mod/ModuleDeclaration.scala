package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.ImportDeclaration
  - typingsSlinky.estree.mod.ExportNamedDeclaration
  - typingsSlinky.estree.mod.ExportDefaultDeclaration
  - typingsSlinky.estree.mod.ExportAllDeclaration
*/
trait ModuleDeclaration extends Node

object ModuleDeclaration {
  @scala.inline
  implicit def apply(value: ExportAllDeclaration): ModuleDeclaration = value.asInstanceOf[ModuleDeclaration]
  @scala.inline
  implicit def apply(value: ExportDefaultDeclaration): ModuleDeclaration = value.asInstanceOf[ModuleDeclaration]
  @scala.inline
  implicit def apply(value: ExportNamedDeclaration): ModuleDeclaration = value.asInstanceOf[ModuleDeclaration]
  @scala.inline
  implicit def apply(value: ImportDeclaration): ModuleDeclaration = value.asInstanceOf[ModuleDeclaration]
}

