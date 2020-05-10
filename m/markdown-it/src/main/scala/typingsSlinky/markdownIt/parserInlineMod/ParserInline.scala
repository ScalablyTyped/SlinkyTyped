package typingsSlinky.markdownIt.parserInlineMod

import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.markdownIt.libMod.MarkdownIt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserInline extends js.Object {
  var State: Instantiable4[
    /* src */ String, 
    /* md */ MarkdownIt, 
    /* env */ js.Any, 
    /* outTokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], 
    typingsSlinky.markdownIt.stateInlineMod.^
  ] = js.native
  /**
    * [[Ruler]] instance. Keep configuration of inline rules.
    */
  var ruler: typingsSlinky.markdownIt.rulerMod.^[RuleInline] = js.native
  /**
    * [[Ruler]] instance. Second ruler used for post-processing
    * (e.g. in emphasis-like rules).
    */
  var ruler2: typingsSlinky.markdownIt.rulerMod.^[RuleInline2] = js.native
  /**
    * Process input string and push inline tokens into `outTokens`
    */
  def parse(str: String, md: MarkdownIt, env: js.Any, outTokens: js.Array[typingsSlinky.markdownIt.tokenMod.^]): Unit = js.native
  /**
    * Skip single token by running all rules in validation mode;
    * returns `true` if any rule reported success
    */
  def skipToken(state: typingsSlinky.markdownIt.stateInlineMod.^): Unit = js.native
  /**
    * Generate tokens for input range
    */
  def tokenize(state: typingsSlinky.markdownIt.stateInlineMod.^): Unit = js.native
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
  @scala.inline
  implicit class ParserInlineOps[Self <: ParserInline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(
      value: Instantiable4[
          /* src */ String, 
          /* md */ MarkdownIt, 
          /* env */ js.Any, 
          /* outTokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], 
          typingsSlinky.markdownIt.stateInlineMod.^
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParse(value: (String, MarkdownIt, js.Any, js.Array[typingsSlinky.markdownIt.tokenMod.^]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withRuler(value: typingsSlinky.markdownIt.rulerMod.^[RuleInline]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuler2(value: typingsSlinky.markdownIt.rulerMod.^[RuleInline2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruler2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipToken(value: typingsSlinky.markdownIt.stateInlineMod.^ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTokenize(value: typingsSlinky.markdownIt.stateInlineMod.^ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

