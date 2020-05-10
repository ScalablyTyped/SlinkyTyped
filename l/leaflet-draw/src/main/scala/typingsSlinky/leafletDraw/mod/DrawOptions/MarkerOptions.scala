package typingsSlinky.leafletDraw.mod.DrawOptions

import typingsSlinky.leaflet.mod.DivIcon_
import typingsSlinky.leaflet.mod.IconOptions
import typingsSlinky.leaflet.mod.Icon_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerOptions extends js.Object {
  /**
    * The icon displayed when drawing a marker.
    *
    * @default L.Icon.Default()
    */
  var icon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
  /**
    * Determines if the draw tool remains enabled after drawing a shape.
    *
    * @default false
    */
  var repeatMode: js.UndefOr[Boolean] = js.native
  /**
    * This should be a high number to ensure that you can draw over all other layers on the map.
    *
    * @default 2000
    */
  var zIndexOffset: js.UndefOr[Double] = js.native
}

object MarkerOptions {
  @scala.inline
  def apply(): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerOptions]
  }
  @scala.inline
  implicit class MarkerOptionsOps[Self <: MarkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcon(value: Icon_[IconOptions] | DivIcon_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatMode")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndexOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndexOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexOffset")(js.undefined)
        ret
    }
  }
  
}

