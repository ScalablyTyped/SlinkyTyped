package typingsSlinky.reactResponsive

import typingsSlinky.reactResponsive.mod.MediaQueryType
import typingsSlinky.reactResponsive.reactResponsiveStrings.interlace
import typingsSlinky.reactResponsive.reactResponsiveStrings.landscape
import typingsSlinky.reactResponsive.reactResponsiveStrings.portrait
import typingsSlinky.reactResponsive.reactResponsiveStrings.progressive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-responsive.react-responsive.MediaQueryAllQueryable> */
@js.native
trait PartialMediaQueryAllQuery extends js.Object {
  var all: js.UndefOr[Boolean] = js.native
  var aspectRatio: js.UndefOr[String] = js.native
  var aural: js.UndefOr[Boolean] = js.native
  var braille: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[Boolean] = js.native
  var colorIndex: js.UndefOr[Boolean] = js.native
  var deviceAspectRatio: js.UndefOr[String] = js.native
  var deviceHeight: js.UndefOr[Double | String] = js.native
  var deviceWidth: js.UndefOr[Double | String] = js.native
  var embossed: js.UndefOr[Boolean] = js.native
  var grid: js.UndefOr[Boolean] = js.native
  var handheld: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var maxAspectRatio: js.UndefOr[String] = js.native
  var maxColor: js.UndefOr[Double] = js.native
  var maxColorIndex: js.UndefOr[Double] = js.native
  var maxDeviceAspectRatio: js.UndefOr[String] = js.native
  var maxDeviceHeight: js.UndefOr[Double | String] = js.native
  var maxDeviceWidth: js.UndefOr[Double | String] = js.native
  var maxHeight: js.UndefOr[Double | String] = js.native
  var maxMonochrome: js.UndefOr[Double] = js.native
  var maxResolution: js.UndefOr[Double | String] = js.native
  var maxWidth: js.UndefOr[Double | String] = js.native
  var minAspectRatio: js.UndefOr[String] = js.native
  var minColor: js.UndefOr[Double] = js.native
  var minColorIndex: js.UndefOr[Double] = js.native
  var minDeviceAspectRatio: js.UndefOr[String] = js.native
  var minDeviceHeight: js.UndefOr[Double | String] = js.native
  var minDeviceWidth: js.UndefOr[Double | String] = js.native
  var minHeight: js.UndefOr[Double | String] = js.native
  var minMonochrome: js.UndefOr[Double] = js.native
  var minResolution: js.UndefOr[Double | String] = js.native
  var minWidth: js.UndefOr[Double | String] = js.native
  var monochrome: js.UndefOr[Boolean] = js.native
  var orientation: js.UndefOr[portrait | landscape] = js.native
  var print: js.UndefOr[Boolean] = js.native
  var projection: js.UndefOr[Boolean] = js.native
  var resolution: js.UndefOr[Double | String] = js.native
  var scan: js.UndefOr[progressive | interlace] = js.native
  var screen: js.UndefOr[Boolean] = js.native
  var tty: js.UndefOr[Boolean] = js.native
  var tv: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[MediaQueryType] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object PartialMediaQueryAllQuery {
  @scala.inline
  def apply(): PartialMediaQueryAllQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMediaQueryAllQuery]
  }
  @scala.inline
  implicit class PartialMediaQueryAllQueryOps[Self <: PartialMediaQueryAllQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
    @scala.inline
    def withAspectRatio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withAural(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAural: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aural")(js.undefined)
        ret
    }
    @scala.inline
    def withBraille(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("braille")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBraille: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("braille")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColorIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceAspectRatio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbossed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embossed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbossed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embossed")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withHandheld(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handheld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandheld: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handheld")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAspectRatio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxColorIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxColorIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColorIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDeviceAspectRatio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeviceAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDeviceAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeviceAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDeviceHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeviceHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDeviceHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeviceHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDeviceWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeviceWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDeviceWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeviceWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMonochrome(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMonochrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMonochrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMonochrome")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResolution(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinAspectRatio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withMinColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMinColorIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinColorIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColorIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDeviceAspectRatio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeviceAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDeviceAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeviceAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDeviceHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeviceHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDeviceHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeviceHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDeviceWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeviceWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDeviceWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeviceWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinMonochrome(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMonochrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinMonochrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMonochrome")(js.undefined)
        ret
    }
    @scala.inline
    def withMinResolution(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMonochrome(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monochrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonochrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monochrome")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: portrait | landscape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: Boolean): Self = {
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
    def withResolution(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
    @scala.inline
    def withScan(value: progressive | interlace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scan")(js.undefined)
        ret
    }
    @scala.inline
    def withScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(js.undefined)
        ret
    }
    @scala.inline
    def withTty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tty")(js.undefined)
        ret
    }
    @scala.inline
    def withTv(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tv")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: MediaQueryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

