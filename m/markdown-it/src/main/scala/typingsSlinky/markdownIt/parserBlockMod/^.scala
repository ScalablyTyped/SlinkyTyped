package typingsSlinky.markdownIt.parserBlockMod

import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.markdownIt.libMod.MarkdownIt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it/lib/parser_block", JSImport.Namespace)
@js.native
class ^ () extends ParserBlock {
  /* CompleteClass */
  override var State: Instantiable4[
    /* src */ String, 
    /* md */ MarkdownIt, 
    /* env */ js.Any, 
    /* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], 
    typingsSlinky.markdownIt.stateBlockMod.^
  ] = js.native
  /**
    * [[Ruler]] instance. Keep configuration of block rules.
    */
  /* CompleteClass */
  override var ruler: typingsSlinky.markdownIt.rulerMod.^[RuleBlock] = js.native
  /**
    * Process input string and push block tokens into `outTokens`
    */
  /* CompleteClass */
  override def parse(str: String, md: MarkdownIt, env: js.Any, outTokens: js.Array[typingsSlinky.markdownIt.tokenMod.^]): Unit = js.native
  /**
    * Generate tokens for input range
    */
  /* CompleteClass */
  override def tokenize(state: typingsSlinky.markdownIt.stateBlockMod.^, startLine: Double, endLine: Double): Unit = js.native
}

