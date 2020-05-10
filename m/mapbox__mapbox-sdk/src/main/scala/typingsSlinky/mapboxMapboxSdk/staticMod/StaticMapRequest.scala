package typingsSlinky.mapboxMapboxSdk.staticMod

import typingsSlinky.mapboxMapboxSdk.AnonBearing
import typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticMapRequest extends js.Object {
  var attribution: js.UndefOr[Boolean] = js.native
  var height: Double = js.native
  var highRes: js.UndefOr[Boolean] = js.native
  var insertOverlayBeforeLayer: js.UndefOr[String] = js.native
  var logo: js.UndefOr[Boolean] = js.native
  var overlays: js.UndefOr[js.Array[CustomMarkerOverlay | GeoJsonOverlay | PathOverlay]] = js.native
  var ownerId: String = js.native
  var position: AnonBearing | auto = js.native
  var styleId: String = js.native
  var width: Double = js.native
}

object StaticMapRequest {
  @scala.inline
  def apply(height: Double, ownerId: String, position: AnonBearing | auto, styleId: String, width: Double): StaticMapRequest = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticMapRequest]
  }
  @scala.inline
  implicit class StaticMapRequestOps[Self <: StaticMapRequest] (val x: Self) extends AnyVal {
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
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: AnonBearing | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttribution(value: Boolean): Self = {
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
    @scala.inline
    def withHighRes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highRes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighRes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highRes")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertOverlayBeforeLayer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertOverlayBeforeLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertOverlayBeforeLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertOverlayBeforeLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withLogo(value: Boolean): Self = {
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
    def withOverlays(value: js.Array[CustomMarkerOverlay | GeoJsonOverlay | PathOverlay]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlays")(js.undefined)
        ret
    }
  }
  
}

