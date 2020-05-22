package typingsSlinky.primereact.anon

import org.scalajs.dom.raw.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormData extends js.Object {
  var formData: js.Any
  var xhr: XMLHttpRequest
}

object FormData {
  @scala.inline
  def apply(formData: js.Any, xhr: XMLHttpRequest): FormData = {
    val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormData]
  }
}

