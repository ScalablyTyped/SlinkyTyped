package typingsSlinky.markdownIt.parserCoreMod

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.markdownIt.libMod.MarkdownIt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it/lib/parser_core", JSImport.Namespace)
@js.native
class ^ () extends Core {
  /* CompleteClass */
  override var State: Instantiable3[
    /* src */ String, 
    /* md */ MarkdownIt, 
    /* env */ js.Any, 
    typingsSlinky.markdownIt.stateCoreMod.^
  ] = js.native
  /* CompleteClass */
  override var ruler: typingsSlinky.markdownIt.rulerMod.^[RuleCore] = js.native
  /**
    * Executes core chain rules.
    */
  /* CompleteClass */
  override def process(state: typingsSlinky.markdownIt.stateCoreMod.^): Unit = js.native
}

