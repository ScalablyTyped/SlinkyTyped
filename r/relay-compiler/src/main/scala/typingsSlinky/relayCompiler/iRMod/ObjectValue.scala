package typingsSlinky.relayCompiler.iRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectValue
  extends ArgumentValue
     with IR {
  var fields: js.Array[ObjectFieldValue]
  var kind: typingsSlinky.relayCompiler.relayCompilerStrings.ObjectValue
  var loc: Location
}

object ObjectValue {
  @scala.inline
  def apply(
    fields: js.Array[ObjectFieldValue],
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.ObjectValue,
    loc: Location
  ): ObjectValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectValue]
  }
}

