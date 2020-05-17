package typingsSlinky.primereact.anon

import org.scalajs.dom.raw.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormData extends js.Object {
  var formData: js.Any = js.native
  var xhr: XMLHttpRequest = js.native
}

object FormData {
  @scala.inline
  def apply(formData: js.Any, xhr: XMLHttpRequest): FormData = {
    val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormData]
  }
  @scala.inline
  implicit class FormDataOps[Self <: FormData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXhr(value: XMLHttpRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

