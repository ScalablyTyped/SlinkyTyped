package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSUnionType
  extends Node
     with TSType {
  
  @JSName("type")
  var type_TSUnionType: typingsSlinky.babelTypes.babelTypesStrings.TSUnionType = js.native
  
  var types: js.Array[TSType] = js.native
}
@JSImport("babel-types", "TSUnionType")
@js.native
object TSUnionType extends js.Object {
  
  def apply(types: js.Array[TSType]): TSUnionType = js.native
}
