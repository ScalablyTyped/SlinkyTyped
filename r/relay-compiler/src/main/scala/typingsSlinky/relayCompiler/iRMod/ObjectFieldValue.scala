package typingsSlinky.relayCompiler.iRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectFieldValue extends IR {
  var kind: typingsSlinky.relayCompiler.relayCompilerStrings.ObjectFieldValue
  var loc: Location
  var name: String
  var value: ArgumentValue
}

object ObjectFieldValue {
  @scala.inline
  def apply(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.ObjectFieldValue,
    loc: Location,
    name: String,
    value: ArgumentValue
  ): ObjectFieldValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObjectFieldValue]
  }
}

