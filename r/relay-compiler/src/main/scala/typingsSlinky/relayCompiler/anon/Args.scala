package typingsSlinky.relayCompiler.anon

import typingsSlinky.relayCompiler.schemaMod.TypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var args: js.Array[typingsSlinky.relayCompiler.schemaMod.Argument]
  var `type`: TypeID
}

object Args {
  @scala.inline
  def apply(args: js.Array[typingsSlinky.relayCompiler.schemaMod.Argument], `type`: TypeID): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

