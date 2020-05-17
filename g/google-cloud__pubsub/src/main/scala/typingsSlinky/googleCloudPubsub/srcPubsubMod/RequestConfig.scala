package typingsSlinky.googleCloudPubsub.srcPubsubMod

import typingsSlinky.googleCloudPubsub.googleCloudPubsubStrings.PublisherClient
import typingsSlinky.googleCloudPubsub.googleCloudPubsubStrings.SubscriberClient
import typingsSlinky.googleGax.gaxMod.CallOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestConfig extends GetClientConfig {
  var gaxOpts: js.UndefOr[CallOptions] = js.native
  var method: String = js.native
  var reqOpts: js.UndefOr[js.Object] = js.native
}

object RequestConfig {
  @scala.inline
  def apply(client: PublisherClient | SubscriberClient, method: String): RequestConfig = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestConfig]
  }
  @scala.inline
  implicit class RequestConfigOps[Self <: RequestConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGaxOpts(value: CallOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaxOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaxOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaxOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withReqOpts(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReqOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqOpts")(js.undefined)
        ret
    }
  }
  
}

