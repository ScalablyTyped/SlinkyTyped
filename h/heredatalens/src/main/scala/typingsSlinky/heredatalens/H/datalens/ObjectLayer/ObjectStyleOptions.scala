package typingsSlinky.heredatalens.H.datalens.ObjectLayer

import typingsSlinky.heremaps.H.map.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output from the rowToStyle callback.
  * Defines the styles or the icon that is applied to the map object.
  */
@js.native
trait ObjectStyleOptions extends js.Object {
  /** Style of arrows to render along a polyline */
  var arrows: js.UndefOr[typingsSlinky.heremaps.H.map.ArrowStyle.Options] = js.native
  /** Marker icon */
  var icon: Icon = js.native
  /** Spatial style */
  var style: js.UndefOr[typingsSlinky.heremaps.H.map.SpatialStyle.Options] = js.native
  /** The z-index value of the map object, default is 0 */
  var zIndex: js.UndefOr[Double] = js.native
}

object ObjectStyleOptions {
  @scala.inline
  def apply(icon: Icon): ObjectStyleOptions = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectStyleOptions]
  }
  @scala.inline
  implicit class ObjectStyleOptionsOps[Self <: ObjectStyleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcon(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrows(value: typingsSlinky.heremaps.H.map.ArrowStyle.Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: typingsSlinky.heremaps.H.map.SpatialStyle.Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
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

