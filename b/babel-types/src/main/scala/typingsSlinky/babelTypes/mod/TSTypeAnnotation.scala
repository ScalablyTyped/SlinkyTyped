package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeAnnotation extends Node {
  
  var typeAnnotation: TSType = js.native
  
  @JSName("type")
  var type_TSTypeAnnotation: typingsSlinky.babelTypes.babelTypesStrings.TSTypeAnnotation = js.native
}
@JSImport("babel-types", "TSTypeAnnotation")
@js.native
object TSTypeAnnotation extends js.Object {
  
  def apply(typeAnnotation: TSType): TSTypeAnnotation = js.native
}
