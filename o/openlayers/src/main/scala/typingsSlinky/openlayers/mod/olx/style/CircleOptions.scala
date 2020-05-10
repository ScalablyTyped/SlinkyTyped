package typingsSlinky.openlayers.mod.olx.style

import typingsSlinky.openlayers.mod.style.AtlasManager
import typingsSlinky.openlayers.mod.style.Fill
import typingsSlinky.openlayers.mod.style.Stroke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircleOptions extends js.Object {
  var atlasManager: js.UndefOr[AtlasManager] = js.native
  var fill: js.UndefOr[Fill] = js.native
  var radius: Double = js.native
  var snapToPixel: js.UndefOr[Boolean] = js.native
  var stroke: js.UndefOr[Stroke] = js.native
}

object CircleOptions {
  @scala.inline
  def apply(radius: Double): CircleOptions = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleOptions]
  }
  @scala.inline
  implicit class CircleOptionsOps[Self <: CircleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAtlasManager(value: AtlasManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atlasManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtlasManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atlasManager")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: Fill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapToPixel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapToPixel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapToPixel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapToPixel")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: Stroke): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
  }
  
}

