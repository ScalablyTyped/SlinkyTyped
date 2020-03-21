package typingsSlinky.markJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.markJs.markJsStrings.partially
  - typingsSlinky.markJs.markJsStrings.complementary
  - typingsSlinky.markJs.markJsStrings.exactly
*/
trait MarkAccuracy extends js.Object

object MarkAccuracy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complementary: typingsSlinky.markJs.markJsStrings.complementary = this.cast("complementary")
  @scala.inline
  def exactly: typingsSlinky.markJs.markJsStrings.exactly = this.cast("exactly")
  @scala.inline
  def partially: typingsSlinky.markJs.markJsStrings.partially = this.cast("partially")
}

