package typingsSlinky.reactNativeMaps.mod

import typingsSlinky.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapWMSTileProps extends ViewProps {
  var maximumZ: js.UndefOr[Double] = js.native
  var minimumZ: js.UndefOr[Double] = js.native
  var opacity: Double = js.native
  var tileSize: Double = js.native
  var urlTemplate: String = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object MapWMSTileProps {
  @scala.inline
  def apply(opacity: Double, tileSize: Double, urlTemplate: String): MapWMSTileProps = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any], urlTemplate = urlTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapWMSTileProps]
  }
  @scala.inline
  implicit class MapWMSTilePropsOps[Self <: MapWMSTileProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumZ")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumZ")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

