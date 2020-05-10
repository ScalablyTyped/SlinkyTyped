package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilityAnnounceNewDataOptions extends js.Object {
  var newDataAnnounce: js.UndefOr[String] = js.native
  var newPointAnnounceMultiple: js.UndefOr[String] = js.native
  var newPointAnnounceSingle: js.UndefOr[String] = js.native
  var newSeriesAnnounceMultiple: js.UndefOr[String] = js.native
  var newSeriesAnnounceSingle: js.UndefOr[String] = js.native
}

object LangAccessibilityAnnounceNewDataOptions {
  @scala.inline
  def apply(): LangAccessibilityAnnounceNewDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityAnnounceNewDataOptions]
  }
  @scala.inline
  implicit class LangAccessibilityAnnounceNewDataOptionsOps[Self <: LangAccessibilityAnnounceNewDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewDataAnnounce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDataAnnounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewDataAnnounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDataAnnounce")(js.undefined)
        ret
    }
    @scala.inline
    def withNewPointAnnounceMultiple(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPointAnnounceMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewPointAnnounceMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPointAnnounceMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withNewPointAnnounceSingle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPointAnnounceSingle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewPointAnnounceSingle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPointAnnounceSingle")(js.undefined)
        ret
    }
    @scala.inline
    def withNewSeriesAnnounceMultiple(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSeriesAnnounceMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewSeriesAnnounceMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSeriesAnnounceMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withNewSeriesAnnounceSingle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSeriesAnnounceSingle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewSeriesAnnounceSingle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSeriesAnnounceSingle")(js.undefined)
        ret
    }
  }
  
}

