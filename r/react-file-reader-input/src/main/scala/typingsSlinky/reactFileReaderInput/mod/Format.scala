package typingsSlinky.reactFileReaderInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactFileReaderInput.reactFileReaderInputStrings.buffer
  - typingsSlinky.reactFileReaderInput.reactFileReaderInputStrings.binary
  - typingsSlinky.reactFileReaderInput.reactFileReaderInputStrings.url
  - typingsSlinky.reactFileReaderInput.reactFileReaderInputStrings.text
*/
trait Format extends js.Object

object Format {
  @scala.inline
  def binary: typingsSlinky.reactFileReaderInput.reactFileReaderInputStrings.binary = this.cast("binary")
  @scala.inline
  def buffer: typingsSlinky.reactFileReaderInput.reactFileReaderInputStrings.buffer = this.cast("buffer")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def text: typingsSlinky.reactFileReaderInput.reactFileReaderInputStrings.text = this.cast("text")
  @scala.inline
  def url: typingsSlinky.reactFileReaderInput.reactFileReaderInputStrings.url = this.cast("url")
}

