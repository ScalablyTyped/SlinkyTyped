package typingsSlinky.jsonFormData.mod

import typingsSlinky.jsonFormData.FnCall
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialFormData extends js.Object {
  @JSName("append")
  var append_Original: FnCall = js.native
  def append(name: String, value: String): Unit = js.native
  def append(name: String, value: String, fileName: String): Unit = js.native
  def append(name: String, value: Blob): Unit = js.native
  def append(name: String, value: Blob, fileName: String): Unit = js.native
}

