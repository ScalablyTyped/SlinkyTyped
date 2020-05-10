package typingsSlinky.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialReferenceWkid extends SpatialReference {
  var latestVcsWkid: js.UndefOr[Double] = js.native
  var latestWkid: js.UndefOr[Double] = js.native
  var vcsWkid: js.UndefOr[Double] = js.native
  var wkid: js.UndefOr[Double] = js.native
}

object SpatialReferenceWkid {
  @scala.inline
  def apply(): SpatialReferenceWkid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpatialReferenceWkid]
  }
  @scala.inline
  implicit class SpatialReferenceWkidOps[Self <: SpatialReferenceWkid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatestVcsWkid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestVcsWkid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestVcsWkid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestVcsWkid")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestWkid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestWkid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestWkid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestWkid")(js.undefined)
        ret
    }
    @scala.inline
    def withVcsWkid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcsWkid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVcsWkid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcsWkid")(js.undefined)
        ret
    }
    @scala.inline
    def withWkid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wkid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWkid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wkid")(js.undefined)
        ret
    }
  }
  
}

