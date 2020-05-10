package typingsSlinky.ol.bingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  var imageHeight: Double = js.native
  var imageUrl: String = js.native
  var imageUrlSubdomains: js.Array[String] = js.native
  var imageWidth: Double = js.native
  var imageryProviders: js.UndefOr[js.Array[ImageryProvider]] = js.native
  var zoomMax: Double = js.native
  var zoomMin: Double = js.native
}

object Resource {
  @scala.inline
  def apply(
    imageHeight: Double,
    imageUrl: String,
    imageUrlSubdomains: js.Array[String],
    imageWidth: Double,
    zoomMax: Double,
    zoomMin: Double
  ): Resource = {
    val __obj = js.Dynamic.literal(imageHeight = imageHeight.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], imageUrlSubdomains = imageUrlSubdomains.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], zoomMax = zoomMax.asInstanceOf[js.Any], zoomMin = zoomMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  implicit class ResourceOps[Self <: Resource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageUrlSubdomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrlSubdomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageryProviders(value: js.Array[ImageryProvider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageryProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageryProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageryProviders")(js.undefined)
        ret
    }
  }
  
}

