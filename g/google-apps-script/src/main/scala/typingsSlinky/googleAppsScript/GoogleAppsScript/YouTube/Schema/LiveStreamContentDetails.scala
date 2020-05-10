package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveStreamContentDetails extends js.Object {
  var closedCaptionsIngestionUrl: js.UndefOr[String] = js.native
  var isReusable: js.UndefOr[Boolean] = js.native
}

object LiveStreamContentDetails {
  @scala.inline
  def apply(): LiveStreamContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveStreamContentDetails]
  }
  @scala.inline
  implicit class LiveStreamContentDetailsOps[Self <: LiveStreamContentDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosedCaptionsIngestionUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedCaptionsIngestionUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosedCaptionsIngestionUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedCaptionsIngestionUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIsReusable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReusable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsReusable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReusable")(js.undefined)
        ret
    }
  }
  
}

