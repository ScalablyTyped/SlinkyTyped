package typingsSlinky.markdownIt.parserBlockMod

import typingsSlinky.markdownIt.libMod.MarkdownIt
import typingsSlinky.markdownIt.libMod.RulerBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserBlock extends js.Object {
  var ruler: RulerBlock
  def parse(src: String, md: MarkdownIt, env: js.Any, outTokens: js.Array[typingsSlinky.markdownIt.tokenMod.^]): Unit
}

object ParserBlock {
  @scala.inline
  def apply(
    parse: (String, MarkdownIt, js.Any, js.Array[typingsSlinky.markdownIt.tokenMod.^]) => Unit,
    ruler: RulerBlock
  ): ParserBlock = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction4(parse), ruler = ruler.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParserBlock]
  }
}

