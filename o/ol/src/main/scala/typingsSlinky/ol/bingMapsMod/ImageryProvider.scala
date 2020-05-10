package typingsSlinky.ol.bingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageryProvider extends js.Object {
  var attribution: js.UndefOr[String] = js.native
  var coverageAreas: js.Array[CoverageArea] = js.native
}

object ImageryProvider {
  @scala.inline
  def apply(coverageAreas: js.Array[CoverageArea]): ImageryProvider = {
    val __obj = js.Dynamic.literal(coverageAreas = coverageAreas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageryProvider]
  }
  @scala.inline
  implicit class ImageryProviderOps[Self <: ImageryProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverageAreas(value: js.Array[CoverageArea]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageAreas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttribution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribution")(js.undefined)
        ret
    }
  }
  
}

