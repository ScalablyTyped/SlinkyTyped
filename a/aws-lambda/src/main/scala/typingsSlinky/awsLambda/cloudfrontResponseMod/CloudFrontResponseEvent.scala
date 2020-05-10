package typingsSlinky.awsLambda.cloudfrontResponseMod

import typingsSlinky.awsLambda.AnonCfCloudFrontEventreadonlyre
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFrontResponseEvent extends js.Object {
  var Records: js.Array[AnonCfCloudFrontEventreadonlyre] = js.native
}

object CloudFrontResponseEvent {
  @scala.inline
  def apply(Records: js.Array[AnonCfCloudFrontEventreadonlyre]): CloudFrontResponseEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontResponseEvent]
  }
  @scala.inline
  implicit class CloudFrontResponseEventOps[Self <: CloudFrontResponseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecords(value: js.Array[AnonCfCloudFrontEventreadonlyre]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

