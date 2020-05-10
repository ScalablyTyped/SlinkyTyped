package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightActivityPublisherDynamicTag extends js.Object {
  var clickThrough: js.UndefOr[Boolean] = js.native
  var directorySiteId: js.UndefOr[String] = js.native
  var dynamicTag: js.UndefOr[FloodlightActivityDynamicTag] = js.native
  var siteId: js.UndefOr[String] = js.native
  var siteIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  var viewThrough: js.UndefOr[Boolean] = js.native
}

object FloodlightActivityPublisherDynamicTag {
  @scala.inline
  def apply(): FloodlightActivityPublisherDynamicTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivityPublisherDynamicTag]
  }
  @scala.inline
  implicit class FloodlightActivityPublisherDynamicTagOps[Self <: FloodlightActivityPublisherDynamicTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickThrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectorySiteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directorySiteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectorySiteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directorySiteId")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicTag(value: FloodlightActivityDynamicTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTag")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteId")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteIdDimensionValue(value: DimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteIdDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteIdDimensionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withViewThrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewThrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewThrough")(js.undefined)
        ret
    }
  }
  
}

