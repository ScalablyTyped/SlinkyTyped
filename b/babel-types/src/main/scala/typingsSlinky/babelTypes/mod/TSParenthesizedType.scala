package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSParenthesizedType
  extends Node
     with TSType {
  
  var typeAnnotation: TSType = js.native
  
  @JSName("type")
  var type_TSParenthesizedType: typingsSlinky.babelTypes.babelTypesStrings.TSParenthesizedType = js.native
}
@JSImport("babel-types", "TSParenthesizedType")
@js.native
object TSParenthesizedType extends js.Object {
  
  def apply(typeAnnotation: TSType): TSParenthesizedType = js.native
}
