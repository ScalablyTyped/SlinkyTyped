package typingsSlinky.ipp.mod

import typingsSlinky.ipp.anon.Documenturi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendURIRequest extends js.Object {
  var `operation-attributes-tag`: Documenturi = js.native
}

object SendURIRequest {
  @scala.inline
  def apply(`operation-attributes-tag`: Documenturi): SendURIRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendURIRequest]
  }
  @scala.inline
  implicit class SendURIRequestOps[Self <: SendURIRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withOperation-attributes-tag`(value: Documenturi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation-attributes-tag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

