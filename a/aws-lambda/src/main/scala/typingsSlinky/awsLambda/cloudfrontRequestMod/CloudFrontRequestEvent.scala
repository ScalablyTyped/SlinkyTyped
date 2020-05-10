package typingsSlinky.awsLambda.cloudfrontRequestMod

import typingsSlinky.awsLambda.AnonCf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFrontRequestEvent extends js.Object {
  var Records: js.Array[AnonCf] = js.native
}

object CloudFrontRequestEvent {
  @scala.inline
  def apply(Records: js.Array[AnonCf]): CloudFrontRequestEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontRequestEvent]
  }
  @scala.inline
  implicit class CloudFrontRequestEventOps[Self <: CloudFrontRequestEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecords(value: js.Array[AnonCf]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

