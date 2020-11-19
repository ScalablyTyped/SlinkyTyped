package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSEnumMember extends Node {
  
  var id: Identifier_ | StringLiteral_ = js.native
  
  var initializer: Expression | Null = js.native
  
  @JSName("type")
  var type_TSEnumMember: typingsSlinky.babelTypes.babelTypesStrings.TSEnumMember = js.native
}
@JSImport("babel-types", "TSEnumMember")
@js.native
object TSEnumMember extends js.Object {
  
  def apply(id: Identifier_): TSEnumMember = js.native
  def apply(id: Identifier_, initializer: Expression): TSEnumMember = js.native
  def apply(id: StringLiteral_): TSEnumMember = js.native
  def apply(id: StringLiteral_, initializer: Expression): TSEnumMember = js.native
}
