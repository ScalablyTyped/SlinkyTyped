package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexSignature
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSPropertySignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexSignature
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSPropertySignature
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
*/
trait TSHasOptionalTypeAnnotationKind extends js.Object

object TSHasOptionalTypeAnnotationKind {
  @scala.inline
  implicit def apply(value: TSCallSignatureDeclaration): TSHasOptionalTypeAnnotationKind = value.asInstanceOf[TSHasOptionalTypeAnnotationKind]
  @scala.inline
  implicit def apply(value: TSConstructSignatureDeclaration): TSHasOptionalTypeAnnotationKind = value.asInstanceOf[TSHasOptionalTypeAnnotationKind]
  @scala.inline
  implicit def apply(value: TSConstructorType): TSHasOptionalTypeAnnotationKind = value.asInstanceOf[TSHasOptionalTypeAnnotationKind]
  @scala.inline
  implicit def apply(value: TSFunctionType): TSHasOptionalTypeAnnotationKind = value.asInstanceOf[TSHasOptionalTypeAnnotationKind]
  @scala.inline
  implicit def apply(value: TSIndexSignature): TSHasOptionalTypeAnnotationKind = value.asInstanceOf[TSHasOptionalTypeAnnotationKind]
  @scala.inline
  implicit def apply(value: TSMethodSignature): TSHasOptionalTypeAnnotationKind = value.asInstanceOf[TSHasOptionalTypeAnnotationKind]
  @scala.inline
  implicit def apply(value: TSPropertySignature): TSHasOptionalTypeAnnotationKind = value.asInstanceOf[TSHasOptionalTypeAnnotationKind]
}

