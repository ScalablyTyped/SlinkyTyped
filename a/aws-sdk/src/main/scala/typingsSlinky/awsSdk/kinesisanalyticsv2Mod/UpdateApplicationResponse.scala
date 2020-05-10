package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationResponse extends js.Object {
  /**
    * Describes application updates.
    */
  var ApplicationDetail: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationDetail = js.native
}

object UpdateApplicationResponse {
  @scala.inline
  def apply(ApplicationDetail: ApplicationDetail): UpdateApplicationResponse = {
    val __obj = js.Dynamic.literal(ApplicationDetail = ApplicationDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationResponse]
  }
  @scala.inline
  implicit class UpdateApplicationResponseOps[Self <: UpdateApplicationResponse] (val x: Self) extends AnyVal {
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

