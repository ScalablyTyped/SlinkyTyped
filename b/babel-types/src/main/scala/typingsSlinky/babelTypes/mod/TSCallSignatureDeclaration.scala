package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSCallSignatureDeclaration
  extends Node
     with TSTypeElement {
  var parameters: (js.Array[Identifier_ | RestElement_]) | Null = js.native
  var typeAnnotation: TSTypeAnnotation | Null = js.native
  var typeParameters: TypeParameterDeclaration_ | Null = js.native
  @JSName("type")
  var type_TSCallSignatureDeclaration: typingsSlinky.babelTypes.babelTypesStrings.TSCallSignatureDeclaration = js.native
}

@JSImport("babel-types", "TSCallSignatureDeclaration")
@js.native
object TSCallSignatureDeclaration extends js.Object {
  def apply(): TSCallSignatureDeclaration = js.native
  def apply(typeParameters: TypeParameterDeclaration_): TSCallSignatureDeclaration = js.native
  def apply(typeParameters: TypeParameterDeclaration_, parameters: js.Array[Identifier_ | RestElement_]): TSCallSignatureDeclaration = js.native
  def apply(
    typeParameters: TypeParameterDeclaration_,
    parameters: js.Array[Identifier_ | RestElement_],
    typeAnnotation: TSTypeAnnotation
  ): TSCallSignatureDeclaration = js.native
}

