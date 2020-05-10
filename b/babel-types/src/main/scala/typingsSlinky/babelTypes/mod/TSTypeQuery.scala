package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeQuery
  extends Node
     with TSType {
  var exprName: TSEntityName = js.native
  @JSName("type")
  var type_TSTypeQuery: typingsSlinky.babelTypes.babelTypesStrings.TSTypeQuery = js.native
}

@JSImport("babel-types", "TSTypeQuery")
@js.native
object TSTypeQuery extends js.Object {
  def apply(exprName: TSEntityName): TSTypeQuery = js.native
}

