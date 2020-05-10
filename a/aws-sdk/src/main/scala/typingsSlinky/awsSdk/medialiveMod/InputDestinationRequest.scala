package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDestinationRequest extends js.Object {
  /**
    * A unique name for the location the RTMP stream is being pushed
  to.
    */
  var StreamName: js.UndefOr[string] = js.native
}

object InputDestinationRequest {
  @scala.inline
  def apply(): InputDestinationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDestinationRequest]
  }
  @scala.inline
  implicit class InputDestinationRequestOps[Self <: InputDestinationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStreamName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(js.undefined)
        ret
    }
  }
  
}

