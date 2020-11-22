package typingsSlinky.babelTypes.ts36Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSConstructSignatureDeclaration
  extends Node
     with TSTypeElement {
  
  var parameters: (js.Array[Identifier_ | RestElement_]) | Null = js.native
  
  var typeAnnotation: TSTypeAnnotation | Null = js.native
  
  var typeParameters: TypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_TSConstructSignatureDeclaration: typingsSlinky.babelTypes.babelTypesStrings.TSConstructSignatureDeclaration = js.native
}
@JSImport("babel-types/ts3.6", "TSConstructSignatureDeclaration")
@js.native
object TSConstructSignatureDeclaration extends js.Object {
  
  def apply(): TSTypeElement = js.native
  def apply(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    typeAnnotation: TSTypeAnnotation
  ): TSTypeElement = js.native
  def apply(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[Identifier_ | RestElement_]): TSTypeElement = js.native
  def apply(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[Identifier_ | RestElement_],
    typeAnnotation: TSTypeAnnotation
  ): TSTypeElement = js.native
  def apply(typeParameters: TypeParameterDeclaration_): TSTypeElement = js.native
  def apply(
    typeParameters: TypeParameterDeclaration_,
    parameters: js.UndefOr[scala.Nothing],
    typeAnnotation: TSTypeAnnotation
  ): TSTypeElement = js.native
  def apply(typeParameters: TypeParameterDeclaration_, parameters: js.Array[Identifier_ | RestElement_]): TSTypeElement = js.native
  def apply(
    typeParameters: TypeParameterDeclaration_,
    parameters: js.Array[Identifier_ | RestElement_],
    typeAnnotation: TSTypeAnnotation
  ): TSTypeElement = js.native
}
