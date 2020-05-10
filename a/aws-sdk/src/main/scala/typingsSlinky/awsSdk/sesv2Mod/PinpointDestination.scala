package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PinpointDestination extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon Pinpoint project that you want to send email events to.
    */
  var ApplicationArn: js.UndefOr[AmazonResourceName] = js.native
}

object PinpointDestination {
  @scala.inline
  def apply(): PinpointDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinpointDestination]
  }
  @scala.inline
  implicit class PinpointDestinationOps[Self <: PinpointDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationArn")(js.undefined)
        ret
    }
  }
  
}

