package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SampleChannelDataResponse extends js.Object {
  /**
    * The list of message samples. Each sample message is returned as a base64-encoded string.
    */
  var payloads: js.UndefOr[MessagePayloads] = js.native
}

object SampleChannelDataResponse {
  @scala.inline
  def apply(): SampleChannelDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SampleChannelDataResponse]
  }
  @scala.inline
  implicit class SampleChannelDataResponseOps[Self <: SampleChannelDataResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayloads(value: MessagePayloads): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloads")(js.undefined)
        ret
    }
  }
  
}

