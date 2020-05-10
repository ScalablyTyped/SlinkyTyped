package typingsSlinky.instagramPrivateApi.locationRepositoryStoryResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationRepositoryStoryResponseCandidatesItem extends js.Object {
  var estimated_scans_sizes: js.UndefOr[js.Array[Double]] = js.native
  var height: Double = js.native
  var url: String = js.native
  var width: Double = js.native
}

object LocationRepositoryStoryResponseCandidatesItem {
  @scala.inline
  def apply(height: Double, url: String, width: Double): LocationRepositoryStoryResponseCandidatesItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRepositoryStoryResponseCandidatesItem]
  }
  @scala.inline
  implicit class LocationRepositoryStoryResponseCandidatesItemOps[Self <: LocationRepositoryStoryResponseCandidatesItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withEstimated_scans_sizes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimated_scans_sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimated_scans_sizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimated_scans_sizes")(js.undefined)
        ret
    }
  }
  
}

