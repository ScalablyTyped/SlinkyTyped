package typingsSlinky.markdownIt.parserInlineMod

import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.markdownIt.libMod.MarkdownIt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserInline extends js.Object {
  var State: Instantiable4[
    /* src */ String, 
    /* md */ MarkdownIt, 
    /* env */ js.Any, 
    /* outTokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], 
    typingsSlinky.markdownIt.stateInlineMod.^
  ]
  /**
    * [[Ruler]] instance. Keep configuration of inline rules.
    */
  var ruler: typingsSlinky.markdownIt.rulerMod.^[RuleInline]
  /**
    * [[Ruler]] instance. Second ruler used for post-processing
    * (e.g. in emphasis-like rules).
    */
  var ruler2: typingsSlinky.markdownIt.rulerMod.^[RuleInline2]
  /**
    * Process input string and push inline tokens into `outTokens`
    */
  def parse(str: String, md: MarkdownIt, env: js.Any, outTokens: js.Array[typingsSlinky.markdownIt.tokenMod.^]): Unit
  /**
    * Skip single token by running all rules in validation mode;
    * returns `true` if any rule reported success
    */
  def skipToken(state: typingsSlinky.markdownIt.stateInlineMod.^): Unit
  /**
    * Generate tokens for input range
    */
  def tokenize(state: typingsSlinky.markdownIt.stateInlineMod.^): Unit
}

object ParserInline {
  @scala.inline
  def apply(
    State: Instantiable4[
      /* src */ String, 
      /* md */ MarkdownIt, 
      /* env */ js.Any, 
      /* outTokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], 
      typingsSlinky.markdownIt.stateInlineMod.^
    ],
    parse: (String, MarkdownIt, js.Any, js.Array[typingsSlinky.markdownIt.tokenMod.^]) => Unit,
    ruler: typingsSlinky.markdownIt.rulerMod.^[RuleInline],
    ruler2: typingsSlinky.markdownIt.rulerMod.^[RuleInline2],
    skipToken: typingsSlinky.markdownIt.stateInlineMod.^ => Unit,
    tokenize: typingsSlinky.markdownIt.stateInlineMod.^ => Unit
  ): ParserInline = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = js.Any.fromFunction4(parse), ruler = ruler.asInstanceOf[js.Any], ruler2 = ruler2.asInstanceOf[js.Any], skipToken = js.Any.fromFunction1(skipToken), tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[ParserInline]
  }
}

