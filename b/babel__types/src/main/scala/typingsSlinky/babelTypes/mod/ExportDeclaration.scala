package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.ExportAllDeclaration_
  - typingsSlinky.babelTypes.mod.ExportDefaultDeclaration_
  - typingsSlinky.babelTypes.mod.ExportNamedDeclaration_
*/
trait ExportDeclaration extends Node

object ExportDeclaration {
  @scala.inline
  implicit def apply(value: ExportAllDeclaration_): ExportDeclaration = value.asInstanceOf[ExportDeclaration]
  @scala.inline
  implicit def apply(value: ExportDefaultDeclaration_): ExportDeclaration = value.asInstanceOf[ExportDeclaration]
  @scala.inline
  implicit def apply(value: ExportNamedDeclaration_): ExportDeclaration = value.asInstanceOf[ExportDeclaration]
}

