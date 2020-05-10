package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitConfigSourceResponse extends js.Object {
  /** The generated service configuration. */
  var serviceConfig: js.UndefOr[Service] = js.native
}

object SubmitConfigSourceResponse {
  @scala.inline
  def apply(): SubmitConfigSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitConfigSourceResponse]
  }
  @scala.inline
  implicit class SubmitConfigSourceResponseOps[Self <: SubmitConfigSourceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceConfig(value: Service): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceConfig")(js.undefined)
        ret
    }
  }
  
}

