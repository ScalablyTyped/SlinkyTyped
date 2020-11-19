package typingsSlinky.markdownIt.parserBlockMod

import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.markdownIt.libMod.MarkdownIt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParserBlock extends js.Object {
  
  var State: Instantiable4[
    /* src */ String, 
    /* md */ MarkdownIt, 
    /* env */ js.Any, 
    /* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], 
    typingsSlinky.markdownIt.stateBlockMod.^
  ] = js.native
  
  /**
    * Process input string and push block tokens into `outTokens`
    */
  def parse(str: String, md: MarkdownIt, env: js.Any, outTokens: js.Array[typingsSlinky.markdownIt.tokenMod.^]): Unit = js.native
  
  /**
    * [[Ruler]] instance. Keep configuration of block rules.
    */
  var ruler: typingsSlinky.markdownIt.rulerMod.^[RuleBlock] = js.native
  
  /**
    * Generate tokens for input range
    */
  def tokenize(state: typingsSlinky.markdownIt.stateBlockMod.^, startLine: Double, endLine: Double): Unit = js.native
}
object ParserBlock {
  
  @scala.inline
  def apply(
    State: Instantiable4[
      /* src */ String, 
      /* md */ MarkdownIt, 
      /* env */ js.Any, 
      /* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], 
      typingsSlinky.markdownIt.stateBlockMod.^
    ],
    parse: (String, MarkdownIt, js.Any, js.Array[typingsSlinky.markdownIt.tokenMod.^]) => Unit,
    ruler: typingsSlinky.markdownIt.rulerMod.^[RuleBlock],
    tokenize: (typingsSlinky.markdownIt.stateBlockMod.^, Double, Double) => Unit
  ): ParserBlock = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = js.Any.fromFunction4(parse), ruler = ruler.asInstanceOf[js.Any], tokenize = js.Any.fromFunction3(tokenize))
    __obj.asInstanceOf[ParserBlock]
  }
  
  @scala.inline
  implicit class ParserBlockOps[Self <: ParserBlock] (val x: Self) extends AnyVal {
    
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
          /* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], 
          typingsSlinky.markdownIt.stateBlockMod.^
        ]
    ): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: (String, MarkdownIt, js.Any, js.Array[typingsSlinky.markdownIt.tokenMod.^]) => Unit): Self = this.set("parse", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRuler(value: typingsSlinky.markdownIt.rulerMod.^[RuleBlock]): Self = this.set("ruler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenize(value: (typingsSlinky.markdownIt.stateBlockMod.^, Double, Double) => Unit): Self = this.set("tokenize", js.Any.fromFunction3(value))
  }
}
