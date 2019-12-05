package typingsSlinky.markdownDashIt.libParserUnderscoreBlockMod

import typingsSlinky.markdownDashIt.libMod.MarkdownIt
import typingsSlinky.markdownDashIt.libMod.RulerBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserBlock extends js.Object {
  var ruler: RulerBlock
  def parse(
    src: String,
    md: MarkdownIt,
    env: js.Any,
    outTokens: js.Array[typingsSlinky.markdownDashIt.libTokenMod.^]
  ): Unit
}

object ParserBlock {
  @scala.inline
  def apply(
    parse: (String, MarkdownIt, js.Any, js.Array[typingsSlinky.markdownDashIt.libTokenMod.^]) => Unit,
    ruler: RulerBlock
  ): ParserBlock = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction4(parse), ruler = ruler.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParserBlock]
  }
}

