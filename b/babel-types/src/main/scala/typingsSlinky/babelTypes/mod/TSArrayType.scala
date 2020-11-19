package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSArrayType
  extends Node
     with TSType {
  
  var elementType: TSType = js.native
  
  @JSName("type")
  var type_TSArrayType: typingsSlinky.babelTypes.babelTypesStrings.TSArrayType = js.native
}
@JSImport("babel-types", "TSArrayType")
@js.native
object TSArrayType extends js.Object {
  
  def apply(elementType: TSType): TSArrayType = js.native
}
