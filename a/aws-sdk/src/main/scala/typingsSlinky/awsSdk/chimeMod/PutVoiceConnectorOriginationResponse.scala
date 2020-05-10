package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutVoiceConnectorOriginationResponse extends js.Object {
  /**
    * The updated origination setting details.
    */
  var Origination: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Origination] = js.native
}

object PutVoiceConnectorOriginationResponse {
  @scala.inline
  def apply(): PutVoiceConnectorOriginationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutVoiceConnectorOriginationResponse]
  }
  @scala.inline
  implicit class PutVoiceConnectorOriginationResponseOps[Self <: PutVoiceConnectorOriginationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrigination(value: Origination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Origination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Origination")(js.undefined)
        ret
    }
  }
  
}

