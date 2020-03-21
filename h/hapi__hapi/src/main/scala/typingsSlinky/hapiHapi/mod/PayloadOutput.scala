package typingsSlinky.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hapiHapi.hapiHapiStrings.data
  - typingsSlinky.hapiHapi.hapiHapiStrings.stream
  - typingsSlinky.hapiHapi.hapiHapiStrings.file
*/
trait PayloadOutput extends js.Object

object PayloadOutput {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def data: typingsSlinky.hapiHapi.hapiHapiStrings.data = this.cast("data")
  @scala.inline
  def file: typingsSlinky.hapiHapi.hapiHapiStrings.file = this.cast("file")
  @scala.inline
  def stream: typingsSlinky.hapiHapi.hapiHapiStrings.stream = this.cast("stream")
}

