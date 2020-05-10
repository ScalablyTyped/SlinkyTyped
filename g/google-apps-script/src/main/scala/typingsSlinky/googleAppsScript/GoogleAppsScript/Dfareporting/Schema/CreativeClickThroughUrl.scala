package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeClickThroughUrl extends js.Object {
  var computedClickThroughUrl: js.UndefOr[String] = js.native
  var customClickThroughUrl: js.UndefOr[String] = js.native
  var landingPageId: js.UndefOr[String] = js.native
}

object CreativeClickThroughUrl {
  @scala.inline
  def apply(): CreativeClickThroughUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeClickThroughUrl]
  }
  @scala.inline
  implicit class CreativeClickThroughUrlOps[Self <: CreativeClickThroughUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputedClickThroughUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computedClickThroughUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputedClickThroughUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computedClickThroughUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomClickThroughUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClickThroughUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomClickThroughUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClickThroughUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLandingPageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landingPageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLandingPageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landingPageId")(js.undefined)
        ret
    }
  }
  
}

