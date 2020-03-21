package typingsSlinky.relayCompiler

import typingsSlinky.relayCompiler.schemaMod.Argument
import typingsSlinky.relayCompiler.schemaMod.TypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var args: js.Array[Argument]
  var `type`: TypeID
}

object AnonArgs {
  @scala.inline
  def apply(args: js.Array[Argument], `type`: TypeID): AnonArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgs]
  }
}

