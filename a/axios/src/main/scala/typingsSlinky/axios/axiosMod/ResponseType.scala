package typingsSlinky.axios.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.axios.axiosStrings.arraybuffer
  - typings.axios.axiosStrings.blob
  - typings.axios.axiosStrings.document
  - typings.axios.axiosStrings.json
  - typings.axios.axiosStrings.text
  - typings.axios.axiosStrings.stream
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  def arraybuffer: typingsSlinky.axios.axiosStrings.arraybuffer = this.cast("arraybuffer")
  @scala.inline
  def blob: typingsSlinky.axios.axiosStrings.blob = this.cast("blob")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def document: typingsSlinky.axios.axiosStrings.document = this.cast("document")
  @scala.inline
  def json: typingsSlinky.axios.axiosStrings.json = this.cast("json")
  @scala.inline
  def stream: typingsSlinky.axios.axiosStrings.stream = this.cast("stream")
  @scala.inline
  def text: typingsSlinky.axios.axiosStrings.text = this.cast("text")
}

