package typingsSlinky.markdownIt.parserInlineMod

import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.markdownIt.libMod.MarkdownIt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Process input string and push inline tokens into `outTokens`
    */
  def parse(str: String, md: MarkdownIt, env: js.Any, outTokens: js.Array[typingsSlinky.markdownIt.tokenMod.^]): Unit = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setState(
      value: Instantiable4[
          /* src */ String, 
          /* md */ MarkdownIt, 
          /* env */ js.Any, 
          /* outTokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], 
          typingsSlinky.markdownIt.stateInlineMod.^
        ]
    ): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: (String, MarkdownIt, js.Any, js.Array[typingsSlinky.markdownIt.tokenMod.^]) => Unit): Self = this.set("parse", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRuler(value: typingsSlinky.markdownIt.rulerMod.^[RuleInline]): Self = this.set("ruler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuler2(value: typingsSlinky.markdownIt.rulerMod.^[RuleInline2]): Self = this.set("ruler2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipToken(value: typingsSlinky.markdownIt.stateInlineMod.^ => Unit): Self = this.set("skipToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTokenize(value: typingsSlinky.markdownIt.stateInlineMod.^ => Unit): Self = this.set("tokenize", js.Any.fromFunction1(value))
  }
}
