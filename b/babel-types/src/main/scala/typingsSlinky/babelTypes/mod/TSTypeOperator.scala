package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeOperator
  extends Node
     with TSType {
  var operator: String | Null = js.native
  var typeAnnotation: TSType = js.native
  @JSName("type")
  var type_TSTypeOperator: typingsSlinky.babelTypes.babelTypesStrings.TSTypeOperator = js.native
}

@JSImport("babel-types", "TSTypeOperator")
@js.native
object TSTypeOperator extends js.Object {
  def apply(typeAnnotation: TSType): TSTypeOperator = js.native
}

