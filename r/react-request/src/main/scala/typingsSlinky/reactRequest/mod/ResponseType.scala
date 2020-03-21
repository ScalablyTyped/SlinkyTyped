package typingsSlinky.reactRequest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactRequest.reactRequestStrings.arrayBuffer
  - typingsSlinky.reactRequest.reactRequestStrings.blob
  - typingsSlinky.reactRequest.reactRequestStrings.formData
  - typingsSlinky.reactRequest.reactRequestStrings.json
  - typingsSlinky.reactRequest.reactRequestStrings.text
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  def arrayBuffer: typingsSlinky.reactRequest.reactRequestStrings.arrayBuffer = this.cast("arrayBuffer")
  @scala.inline
  def blob: typingsSlinky.reactRequest.reactRequestStrings.blob = this.cast("blob")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def formData: typingsSlinky.reactRequest.reactRequestStrings.formData = this.cast("formData")
  @scala.inline
  def json: typingsSlinky.reactRequest.reactRequestStrings.json = this.cast("json")
  @scala.inline
  def text: typingsSlinky.reactRequest.reactRequestStrings.text = this.cast("text")
}

