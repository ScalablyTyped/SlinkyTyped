package typingsSlinky.angularCore.mod

import typingsSlinky.angularCore.angularCoreStrings.document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCore.angularCoreStrings.document_
  - typingsSlinky.angularCore.angularCoreStrings.window
  - typingsSlinky.angularCore.angularCoreStrings.body
*/
trait GlobalTargetName extends js.Object

object GlobalTargetName {
  @scala.inline
  def body: typingsSlinky.angularCore.angularCoreStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def document: document_ = this.cast("document")
  @scala.inline
  def window: typingsSlinky.angularCore.angularCoreStrings.window = this.cast("window")
}

