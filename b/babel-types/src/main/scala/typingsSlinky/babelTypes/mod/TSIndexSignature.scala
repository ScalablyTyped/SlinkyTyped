package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSIndexSignature
  extends Node
     with TSTypeElement {
  
  var parameters: js.Array[Identifier_] = js.native
  
  var readonly: Boolean | Null = js.native
  
  var typeAnnotation: TSTypeAnnotation | Null = js.native
  
  @JSName("type")
  var type_TSIndexSignature: typingsSlinky.babelTypes.babelTypesStrings.TSIndexSignature = js.native
}
@JSImport("babel-types", "TSIndexSignature")
@js.native
object TSIndexSignature extends js.Object {
  
  def apply(parameters: js.Array[Identifier_]): TSIndexSignature = js.native
  def apply(parameters: js.Array[Identifier_], typeAnnotation: TSTypeAnnotation): TSIndexSignature = js.native
}
