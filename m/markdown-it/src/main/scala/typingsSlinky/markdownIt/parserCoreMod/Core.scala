package typingsSlinky.markdownIt.parserCoreMod

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.markdownIt.libMod.MarkdownIt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Core extends js.Object {
  var State: Instantiable3[
    /* src */ String, 
    /* md */ MarkdownIt, 
    /* env */ js.Any, 
    typingsSlinky.markdownIt.stateCoreMod.^
  ]
  var ruler: typingsSlinky.markdownIt.rulerMod.^[RuleCore]
  /**
    * Executes core chain rules.
    */
  def process(state: typingsSlinky.markdownIt.stateCoreMod.^): Unit
}

object Core {
  @scala.inline
  def apply(
    State: Instantiable3[
      /* src */ String, 
      /* md */ MarkdownIt, 
      /* env */ js.Any, 
      typingsSlinky.markdownIt.stateCoreMod.^
    ],
    process: typingsSlinky.markdownIt.stateCoreMod.^ => Unit,
    ruler: typingsSlinky.markdownIt.rulerMod.^[RuleCore]
  ): Core = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], process = js.Any.fromFunction1(process), ruler = ruler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Core]
  }
}

