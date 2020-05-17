package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ParameterName
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TSThisTypeKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypePredicateBuilder extends js.Object {
  def apply(parameterName: IdentifierKind, typeAnnotation: TSTypeAnnotationKind): TSTypePredicate = js.native
  def apply(parameterName: TSThisTypeKind, typeAnnotation: TSTypeAnnotationKind): TSTypePredicate = js.native
  def from(params: ParameterName): TSTypePredicate = js.native
}

