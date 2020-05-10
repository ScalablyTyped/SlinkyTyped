package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlMapsValidateRequest extends js.Object {
  /** Content of the UrlMap to be validated. */
  var resource: js.UndefOr[UrlMap] = js.native
}

object UrlMapsValidateRequest {
  @scala.inline
  def apply(): UrlMapsValidateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlMapsValidateRequest]
  }
  @scala.inline
  implicit class UrlMapsValidateRequestOps[Self <: UrlMapsValidateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResource(value: UrlMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
  }
  
}

