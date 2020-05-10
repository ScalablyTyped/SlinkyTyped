package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutVoiceConnectorTerminationResponse extends js.Object {
  /**
    * The updated termination setting details.
    */
  var Termination: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Termination] = js.native
}

object PutVoiceConnectorTerminationResponse {
  @scala.inline
  def apply(): PutVoiceConnectorTerminationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutVoiceConnectorTerminationResponse]
  }
  @scala.inline
  implicit class PutVoiceConnectorTerminationResponseOps[Self <: PutVoiceConnectorTerminationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTermination(value: Termination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Termination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTermination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Termination")(js.undefined)
        ret
    }
  }
  
}

