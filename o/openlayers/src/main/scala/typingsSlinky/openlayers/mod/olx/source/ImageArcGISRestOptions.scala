package typingsSlinky.openlayers.mod.olx.source

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.openlayers.mod.Attribution
import typingsSlinky.openlayers.mod.Image
import typingsSlinky.openlayers.mod.ImageLoadFunctionType
import typingsSlinky.openlayers.mod.ProjectionLike
import typingsSlinky.openlayers.mod.olx.LogoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageArcGISRestOptions extends js.Object {
  var attributions: js.UndefOr[js.Array[Attribution]] = js.native
  var crossOrigin: js.UndefOr[String] = js.native
  var hidpi: js.UndefOr[Boolean] = js.native
  var imageLoadFunction: js.UndefOr[ImageLoadFunctionType] = js.native
  var logo: js.UndefOr[String | LogoOptions] = js.native
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  var projection: ProjectionLike = js.native
  var ratio: js.UndefOr[Double] = js.native
  var resolutions: js.UndefOr[js.Array[Double]] = js.native
  var url: js.UndefOr[String] = js.native
}

object ImageArcGISRestOptions {
  @scala.inline
  def apply(): ImageArcGISRestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageArcGISRestOptions]
  }
  @scala.inline
  implicit class ImageArcGISRestOptionsOps[Self <: ImageArcGISRestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributions(value: js.Array[Attribution]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributions")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withHidpi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidpi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidpi")(js.undefined)
        ret
    }
    @scala.inline
    def withImageLoadFunction(value: (/* image */ Image, /* url */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLoadFunction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutImageLoadFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLoadFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withLogo(value: String | LogoOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: ProjectionLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(js.undefined)
        ret
    }
    @scala.inline
    def withResolutions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutions")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

