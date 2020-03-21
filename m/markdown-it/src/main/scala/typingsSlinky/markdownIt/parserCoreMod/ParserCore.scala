package typingsSlinky.markdownIt.parserCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserCore extends js.Object {
  var State: typingsSlinky.markdownIt.stateCoreMod.^
  var ruler: typingsSlinky.markdownIt.rulerMod.^[typingsSlinky.markdownIt.stateCoreMod.^]
  def process(state: js.Any): Unit
}

object ParserCore {
  @scala.inline
  def apply(
    State: typingsSlinky.markdownIt.stateCoreMod.^,
    process: js.Any => Unit,
    ruler: typingsSlinky.markdownIt.rulerMod.^[typingsSlinky.markdownIt.stateCoreMod.^]
  ): ParserCore = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], process = js.Any.fromFunction1(process), ruler = ruler.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParserCore]
  }
}

