package typingsSlinky.babelTypes.ts36Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeAssertion
  extends Node
     with Expression {
  
  var expression: Expression = js.native
  
  var typeAnnotation: TSType = js.native
  
  @JSName("type")
  var type_TSTypeAssertion: typingsSlinky.babelTypes.babelTypesStrings.TSTypeAssertion = js.native
}
@JSImport("babel-types/ts3.6", "TSTypeAssertion")
@js.native
object TSTypeAssertion extends js.Object {
  
  def apply(typeAnnotation: TSType, expression: Expression): TSTypeAssertion = js.native
}
