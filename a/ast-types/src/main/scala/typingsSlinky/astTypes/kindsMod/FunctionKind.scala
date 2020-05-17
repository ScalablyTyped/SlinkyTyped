package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectMethod
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
*/
trait FunctionKind extends js.Object

object FunctionKind {
  @scala.inline
  implicit def apply(value: ArrowFunctionExpression): FunctionKind = value.asInstanceOf[FunctionKind]
  @scala.inline
  implicit def apply(value: ClassMethod): FunctionKind = value.asInstanceOf[FunctionKind]
  @scala.inline
  implicit def apply(value: ClassPrivateMethod): FunctionKind = value.asInstanceOf[FunctionKind]
  @scala.inline
  implicit def apply(value: FunctionDeclaration): FunctionKind = value.asInstanceOf[FunctionKind]
  @scala.inline
  implicit def apply(value: FunctionExpression): FunctionKind = value.asInstanceOf[FunctionKind]
  @scala.inline
  implicit def apply(value: ObjectMethod): FunctionKind = value.asInstanceOf[FunctionKind]
}

