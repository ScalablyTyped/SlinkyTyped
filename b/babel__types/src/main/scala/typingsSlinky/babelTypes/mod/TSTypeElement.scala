package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.TSCallSignatureDeclaration_
  - typingsSlinky.babelTypes.mod.TSConstructSignatureDeclaration_
  - typingsSlinky.babelTypes.mod.TSPropertySignature_
  - typingsSlinky.babelTypes.mod.TSMethodSignature_
  - typingsSlinky.babelTypes.mod.TSIndexSignature_
*/
trait TSTypeElement extends Node

object TSTypeElement {
  @scala.inline
  implicit def apply(value: TSCallSignatureDeclaration_): TSTypeElement = value.asInstanceOf[TSTypeElement]
  @scala.inline
  implicit def apply(value: TSConstructSignatureDeclaration_): TSTypeElement = value.asInstanceOf[TSTypeElement]
  @scala.inline
  implicit def apply(value: TSIndexSignature_): TSTypeElement = value.asInstanceOf[TSTypeElement]
  @scala.inline
  implicit def apply(value: TSMethodSignature_): TSTypeElement = value.asInstanceOf[TSTypeElement]
  @scala.inline
  implicit def apply(value: TSPropertySignature_): TSTypeElement = value.asInstanceOf[TSTypeElement]
}

