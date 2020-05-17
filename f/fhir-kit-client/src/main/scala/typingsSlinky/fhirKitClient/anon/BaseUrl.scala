package typingsSlinky.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseUrl extends js.Object {
  var baseUrl: String = js.native
  var customHeaders: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
}

object BaseUrl {
  @scala.inline
  def apply(baseUrl: String): BaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUrl]
  }
  @scala.inline
  implicit class BaseUrlOps[Self <: BaseUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomHeaders(value: typingsSlinky.request.mod.Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(js.undefined)
        ret
    }
  }
  
}

