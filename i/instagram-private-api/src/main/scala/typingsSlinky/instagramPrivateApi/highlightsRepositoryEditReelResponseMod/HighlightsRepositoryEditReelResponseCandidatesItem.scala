package typingsSlinky.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightsRepositoryEditReelResponseCandidatesItem extends js.Object {
  var estimated_scans_sizes: js.Array[Double] = js.native
  var height: Double = js.native
  var url: String = js.native
  var width: Double = js.native
}

object HighlightsRepositoryEditReelResponseCandidatesItem {
  @scala.inline
  def apply(estimated_scans_sizes: js.Array[Double], height: Double, url: String, width: Double): HighlightsRepositoryEditReelResponseCandidatesItem = {
    val __obj = js.Dynamic.literal(estimated_scans_sizes = estimated_scans_sizes.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseCandidatesItem]
  }
  @scala.inline
  implicit class HighlightsRepositoryEditReelResponseCandidatesItemOps[Self <: HighlightsRepositoryEditReelResponseCandidatesItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEstimated_scans_sizes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimated_scans_sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

