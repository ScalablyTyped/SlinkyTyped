package typingsSlinky.applicationinsightsJs.AI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageViewData extends EventData {
  var duration: String = js.native
  var referrer: String = js.native
  var referrerData: String = js.native
  var url: String = js.native
}

object PageViewData {
  @scala.inline
  def apply(
    duration: String,
    measurements: js.Any,
    name: String,
    properties: js.Any,
    referrer: String,
    referrerData: String,
    url: String,
    ver: Double
  ): PageViewData = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], measurements = measurements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], referrerData = referrerData.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageViewData]
  }
  @scala.inline
  implicit class PageViewDataOps[Self <: PageViewData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferrer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferrerData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

