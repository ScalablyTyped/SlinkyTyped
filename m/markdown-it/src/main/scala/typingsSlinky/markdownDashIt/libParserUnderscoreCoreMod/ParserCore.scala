package typingsSlinky.markdownDashIt.libParserUnderscoreCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserCore extends js.Object {
  var State: typingsSlinky.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod.^
  var ruler: typingsSlinky.markdownDashIt.libRulerMod.^[typingsSlinky.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod.^]
  def process(state: js.Any): Unit
}

object ParserCore {
  @scala.inline
  def apply(
    State: typingsSlinky.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod.^,
    process: js.Any => Unit,
    ruler: typingsSlinky.markdownDashIt.libRulerMod.^[typingsSlinky.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod.^]
  ): ParserCore = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], process = js.Any.fromFunction1(process), ruler = ruler.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParserCore]
  }
}

