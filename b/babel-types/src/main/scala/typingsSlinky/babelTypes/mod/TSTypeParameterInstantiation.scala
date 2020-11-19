package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeParameterInstantiation extends Node {
  
  var params: js.Array[TSType] = js.native
  
  @JSName("type")
  var type_TSTypeParameterInstantiation: typingsSlinky.babelTypes.babelTypesStrings.TSTypeParameterInstantiation = js.native
}
@JSImport("babel-types", "TSTypeParameterInstantiation")
@js.native
object TSTypeParameterInstantiation extends js.Object {
  
  def apply(params: js.Array[TSType]): TSTypeParameterInstantiation = js.native
}
