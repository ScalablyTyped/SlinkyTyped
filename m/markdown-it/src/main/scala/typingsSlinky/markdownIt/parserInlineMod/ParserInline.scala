package typingsSlinky.markdownIt.parserInlineMod

import typingsSlinky.markdownIt.libMod.MarkdownIt
import typingsSlinky.markdownIt.libMod.RulerInline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserInline extends js.Object {
  var ruler: RulerInline
  var ruler2: RulerInline
  def parse(src: String, md: MarkdownIt, env: js.Any, outTokens: js.Array[typingsSlinky.markdownIt.tokenMod.^]): Unit
  def skipToken(state: typingsSlinky.markdownIt.stateCoreMod.^): Unit
  def tokenize(state: typingsSlinky.markdownIt.stateCoreMod.^): Unit
}

object ParserInline {
  @scala.inline
  def apply(
    parse: (String, MarkdownIt, js.Any, js.Array[typingsSlinky.markdownIt.tokenMod.^]) => Unit,
    ruler: RulerInline,
    ruler2: RulerInline,
    skipToken: typingsSlinky.markdownIt.stateCoreMod.^ => Unit,
    tokenize: typingsSlinky.markdownIt.stateCoreMod.^ => Unit
  ): ParserInline = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction4(parse), ruler = ruler.asInstanceOf[js.Any], ruler2 = ruler2.asInstanceOf[js.Any], skipToken = js.Any.fromFunction1(skipToken), tokenize = js.Any.fromFunction1(tokenize))
  
    __obj.asInstanceOf[ParserInline]
  }
}

