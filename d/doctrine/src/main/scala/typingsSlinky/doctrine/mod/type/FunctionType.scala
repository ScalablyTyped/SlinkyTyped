package typingsSlinky.doctrine.mod.`type`

import typingsSlinky.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionType extends Type_ {
  var `new`: Type_
  var params: js.Array[Type_]
  var result: js.Array[Type_]
  var `this`: Type_
  var `type`: typingsSlinky.doctrine.doctrineStrings.FunctionType
}

object FunctionType {
  @scala.inline
  def apply(
    `new`: Type_,
    params: js.Array[Type_],
    result: js.Array[Type_],
    `this`: Type_,
    `type`: typingsSlinky.doctrine.doctrineStrings.FunctionType
  ): FunctionType = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionType]
  }
}

