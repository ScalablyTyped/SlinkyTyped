package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeLiteral
  extends Node
     with TSType {
  
  var members: js.Array[TSTypeElement] = js.native
  
  @JSName("type")
  var type_TSTypeLiteral: typingsSlinky.babelTypes.babelTypesStrings.TSTypeLiteral = js.native
}
@JSImport("babel-types", "TSTypeLiteral")
@js.native
object TSTypeLiteral extends js.Object {
  
  def apply(members: js.Array[TSTypeElement]): TSTypeLiteral = js.native
}
