package typingsSlinky.jsonFormData.mod

import org.scalajs.dom.raw.Blob
import typingsSlinky.jsonFormData.anon.FnCall
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

