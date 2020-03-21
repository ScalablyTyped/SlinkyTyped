package typingsSlinky.broFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.broFs.broFsStrings.Text
  - typingsSlinky.broFs.broFsStrings.BinaryString
  - typingsSlinky.broFs.broFsStrings.DataURL
*/
trait TextType extends js.Object

object TextType {
  @scala.inline
  def BinaryString: typingsSlinky.broFs.broFsStrings.BinaryString = this.cast("BinaryString")
  @scala.inline
  def DataURL: typingsSlinky.broFs.broFsStrings.DataURL = this.cast("DataURL")
  @scala.inline
  def Text: typingsSlinky.broFs.broFsStrings.Text = this.cast("Text")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

