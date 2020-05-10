package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoContentDetailsRegionRestriction extends js.Object {
  var allowed: js.UndefOr[js.Array[String]] = js.native
  var blocked: js.UndefOr[js.Array[String]] = js.native
}

object VideoContentDetailsRegionRestriction {
  @scala.inline
  def apply(): VideoContentDetailsRegionRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoContentDetailsRegionRestriction]
  }
  @scala.inline
  implicit class VideoContentDetailsRegionRestrictionOps[Self <: VideoContentDetailsRegionRestriction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowed(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed")(js.undefined)
        ret
    }
    @scala.inline
    def withBlocked(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked")(js.undefined)
        ret
    }
  }
  
}

