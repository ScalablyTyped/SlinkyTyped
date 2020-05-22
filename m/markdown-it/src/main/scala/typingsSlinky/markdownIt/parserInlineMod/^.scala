package typingsSlinky.markdownIt.parserInlineMod

import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.markdownIt.libMod.MarkdownIt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it/lib/parser_inline", JSImport.Namespace)
@js.native
class ^ () extends ParserInline {
  /* CompleteClass */
  override var State: Instantiable4[
    /* src */ String, 
    /* md */ MarkdownIt, 
    /* env */ js.Any, 
    /* outTokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], 
    typingsSlinky.markdownIt.stateInlineMod.^
  ] = js.native
  /**
    * [[Ruler]] instance. Keep configuration of inline rules.
    */
  /* CompleteClass */
  override var ruler: typingsSlinky.markdownIt.rulerMod.^[RuleInline] = js.native
  /**
    * [[Ruler]] instance. Second ruler used for post-processing
    * (e.g. in emphasis-like rules).
    */
  /* CompleteClass */
  override var ruler2: typingsSlinky.markdownIt.rulerMod.^[RuleInline2] = js.native
  /**
    * Process input string and push inline tokens into `outTokens`
    */
  /* CompleteClass */
  override def parse(str: String, md: MarkdownIt, env: js.Any, outTokens: js.Array[typingsSlinky.markdownIt.tokenMod.^]): Unit = js.native
  /**
    * Skip single token by running all rules in validation mode;
    * returns `true` if any rule reported success
    */
  /* CompleteClass */
  override def skipToken(state: typingsSlinky.markdownIt.stateInlineMod.^): Unit = js.native
  /**
    * Generate tokens for input range
    */
  /* CompleteClass */
  override def tokenize(state: typingsSlinky.markdownIt.stateInlineMod.^): Unit = js.native
}

