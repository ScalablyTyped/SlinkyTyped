package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientYoutube.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoAbuseReportReasonsResource extends js.Object {
  /** Returns a list of abuse reasons that can be used for reporting abusive videos. */
  def list(request: UserIp): Request[VideoAbuseReportReasonListResponse] = js.native
}

object VideoAbuseReportReasonsResource {
  @scala.inline
  def apply(list: UserIp => Request[VideoAbuseReportReasonListResponse]): VideoAbuseReportReasonsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[VideoAbuseReportReasonsResource]
  }
  @scala.inline
  implicit class VideoAbuseReportReasonsResourceOps[Self <: VideoAbuseReportReasonsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: UserIp => Request[VideoAbuseReportReasonListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

