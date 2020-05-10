package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationResponse extends js.Object {
  /**
    * In response to your CreateApplication request, Kinesis Data Analytics returns a response with details of the application it created.
    */
  var ApplicationDetail: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationDetail = js.native
}

object CreateApplicationResponse {
  @scala.inline
  def apply(ApplicationDetail: ApplicationDetail): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal(ApplicationDetail = ApplicationDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationResponse]
  }
  @scala.inline
  implicit class CreateApplicationResponseOps[Self <: CreateApplicationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationDetail(value: ApplicationDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationDetail")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

