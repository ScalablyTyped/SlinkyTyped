package typingsSlinky.graphqlPlaygroundHtml.renderPlaygroundPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlPlaygroundHtml.graphqlPlaygroundHtmlStrings.line
  - typingsSlinky.graphqlPlaygroundHtml.graphqlPlaygroundHtmlStrings.block
  - typingsSlinky.graphqlPlaygroundHtml.graphqlPlaygroundHtmlStrings.underline
*/
trait CursorShape extends js.Object

object CursorShape {
  @scala.inline
  def block: typingsSlinky.graphqlPlaygroundHtml.graphqlPlaygroundHtmlStrings.block = this.cast("block")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def line: typingsSlinky.graphqlPlaygroundHtml.graphqlPlaygroundHtmlStrings.line = this.cast("line")
  @scala.inline
  def underline: typingsSlinky.graphqlPlaygroundHtml.graphqlPlaygroundHtmlStrings.underline = this.cast("underline")
}

