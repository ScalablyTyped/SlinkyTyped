package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate
*/
trait TSTypeAnnotationKind extends js.Object

object TSTypeAnnotationKind {
  @scala.inline
  implicit def apply(value: TSTypeAnnotation): TSTypeAnnotationKind = value.asInstanceOf[TSTypeAnnotationKind]
  @scala.inline
  implicit def apply(value: TSTypePredicate): TSTypeAnnotationKind = value.asInstanceOf[TSTypeAnnotationKind]
}

