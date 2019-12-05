package typingsSlinky.hapi.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapi.hapiStrings.data
  - typings.hapi.hapiStrings.stream
  - typings.hapi.hapiStrings.file
*/
trait PayloadOutput extends js.Object

object PayloadOutput {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def data: typingsSlinky.hapi.hapiStrings.data = this.cast("data")
  @scala.inline
  def file: typingsSlinky.hapi.hapiStrings.file = this.cast("file")
  @scala.inline
  def stream: typingsSlinky.hapi.hapiStrings.stream = this.cast("stream")
}

