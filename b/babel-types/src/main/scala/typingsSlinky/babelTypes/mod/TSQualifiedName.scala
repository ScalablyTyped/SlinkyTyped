package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSQualifiedName
  extends Node
     with TSEntityName {
  
  var left: TSEntityName = js.native
  
  var right: Identifier_ = js.native
  
  @JSName("type")
  var type_TSQualifiedName: typingsSlinky.babelTypes.babelTypesStrings.TSQualifiedName = js.native
}
@JSImport("babel-types", "TSQualifiedName")
@js.native
object TSQualifiedName extends js.Object {
  
  def apply(left: TSEntityName, right: Identifier_): TSQualifiedName = js.native
}
