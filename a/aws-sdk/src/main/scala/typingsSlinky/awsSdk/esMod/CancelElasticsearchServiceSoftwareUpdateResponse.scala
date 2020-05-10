package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelElasticsearchServiceSoftwareUpdateResponse extends js.Object {
  /**
    * The current status of the Elasticsearch service software update.
    */
  var ServiceSoftwareOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.ServiceSoftwareOptions] = js.native
}

object CancelElasticsearchServiceSoftwareUpdateResponse {
  @scala.inline
  def apply(): CancelElasticsearchServiceSoftwareUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelElasticsearchServiceSoftwareUpdateResponse]
  }
  @scala.inline
  implicit class CancelElasticsearchServiceSoftwareUpdateResponseOps[Self <: CancelElasticsearchServiceSoftwareUpdateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceSoftwareOptions(value: ServiceSoftwareOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceSoftwareOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceSoftwareOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceSoftwareOptions")(js.undefined)
        ret
    }
  }
  
}

