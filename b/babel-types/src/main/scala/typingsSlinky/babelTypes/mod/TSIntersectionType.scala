package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSIntersectionType
  extends Node
     with TSType {
  
  @JSName("type")
  var type_TSIntersectionType: typingsSlinky.babelTypes.babelTypesStrings.TSIntersectionType = js.native
  
  var types: js.Array[TSType] = js.native
}
@JSImport("babel-types", "TSIntersectionType")
@js.native
object TSIntersectionType extends js.Object {
  
  def apply(types: js.Array[TSType]): TSIntersectionType = js.native
}
