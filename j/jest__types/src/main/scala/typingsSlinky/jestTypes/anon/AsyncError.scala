package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.BlockMode
import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.jestTypesStrings.start_describe_definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncError extends Event {
  var asyncError: js.Error
  var blockName: typingsSlinky.jestTypes.circusMod.BlockName
  var mode: BlockMode
  var name: start_describe_definition
}

object AsyncError {
  @scala.inline
  def apply(
    asyncError: js.Error,
    blockName: typingsSlinky.jestTypes.circusMod.BlockName,
    mode: BlockMode,
    name: start_describe_definition
  ): AsyncError = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncError]
  }
}

