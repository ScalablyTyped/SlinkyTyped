package typingsSlinky.atJestTypes

import typingsSlinky.atJestTypes.atJestTypesStrings.start_describe_definition
import typingsSlinky.atJestTypes.buildCircusMod.BlockMode
import typingsSlinky.atJestTypes.buildCircusMod.BlockName
import typingsSlinky.atJestTypes.buildCircusMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsyncError extends Event {
  var asyncError: js.Error
  var blockName: BlockName
  var mode: BlockMode
  var name: start_describe_definition
}

object Anon_AsyncError {
  @scala.inline
  def apply(asyncError: js.Error, blockName: BlockName, mode: BlockMode, name: start_describe_definition): Anon_AsyncError = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AsyncError]
  }
}

