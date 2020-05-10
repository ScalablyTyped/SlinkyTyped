package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceConnectorTerminationHealthResponse extends js.Object {
  /**
    * The termination health details.
    */
  var TerminationHealth: js.UndefOr[typingsSlinky.awsSdk.chimeMod.TerminationHealth] = js.native
}

object GetVoiceConnectorTerminationHealthResponse {
  @scala.inline
  def apply(): GetVoiceConnectorTerminationHealthResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorTerminationHealthResponse]
  }
  @scala.inline
  implicit class GetVoiceConnectorTerminationHealthResponseOps[Self <: GetVoiceConnectorTerminationHealthResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTerminationHealth(value: TerminationHealth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminationHealth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminationHealth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminationHealth")(js.undefined)
        ret
    }
  }
  
}

