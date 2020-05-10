package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoProcessingDetailsProcessingProgress extends js.Object {
  var partsProcessed: js.UndefOr[String] = js.native
  var partsTotal: js.UndefOr[String] = js.native
  var timeLeftMs: js.UndefOr[String] = js.native
}

object VideoProcessingDetailsProcessingProgress {
  @scala.inline
  def apply(): VideoProcessingDetailsProcessingProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoProcessingDetailsProcessingProgress]
  }
  @scala.inline
  implicit class VideoProcessingDetailsProcessingProgressOps[Self <: VideoProcessingDetailsProcessingProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartsProcessed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partsProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartsProcessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partsProcessed")(js.undefined)
        ret
    }
    @scala.inline
    def withPartsTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partsTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartsTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partsTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeLeftMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLeftMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeLeftMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLeftMs")(js.undefined)
        ret
    }
  }
  
}

