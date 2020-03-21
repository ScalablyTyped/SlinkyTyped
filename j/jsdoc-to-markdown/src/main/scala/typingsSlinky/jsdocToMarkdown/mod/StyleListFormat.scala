package typingsSlinky.jsdocToMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsdocToMarkdown.jsdocToMarkdownStrings.none
  - typingsSlinky.jsdocToMarkdown.jsdocToMarkdownStrings.grouped
  - typingsSlinky.jsdocToMarkdown.jsdocToMarkdownStrings.table
  - typingsSlinky.jsdocToMarkdown.jsdocToMarkdownStrings.dl
*/
trait StyleListFormat extends js.Object

object StyleListFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dl: typingsSlinky.jsdocToMarkdown.jsdocToMarkdownStrings.dl = this.cast("dl")
  @scala.inline
  def grouped: typingsSlinky.jsdocToMarkdown.jsdocToMarkdownStrings.grouped = this.cast("grouped")
  @scala.inline
  def none: typingsSlinky.jsdocToMarkdown.jsdocToMarkdownStrings.none = this.cast("none")
  @scala.inline
  def table: typingsSlinky.jsdocToMarkdown.jsdocToMarkdownStrings.table = this.cast("table")
}

