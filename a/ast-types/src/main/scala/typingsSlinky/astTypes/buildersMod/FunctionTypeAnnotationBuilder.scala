package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonRest
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.FunctionTypeParamKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionTypeAnnotationBuilder extends js.Object {
  def apply(params: js.Array[FunctionTypeParamKind], returnType: FlowTypeKind): FunctionTypeAnnotation = js.native
  def apply(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    rest: Null,
    typeParameters: TypeParameterDeclarationKind
  ): FunctionTypeAnnotation = js.native
  def apply(params: js.Array[FunctionTypeParamKind], returnType: FlowTypeKind, rest: FunctionTypeParamKind): FunctionTypeAnnotation = js.native
  def apply(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    rest: FunctionTypeParamKind,
    typeParameters: TypeParameterDeclarationKind
  ): FunctionTypeAnnotation = js.native
  def from(params: AnonRest): FunctionTypeAnnotation = js.native
}

