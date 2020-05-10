package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** Controls *****/
/** Options for the rendering of the map type control. */
@js.native
trait MapTypeControlOptions extends js.Object {
  /** IDs of map types to show in the control. */
  var mapTypeIds: js.UndefOr[js.Array[MapTypeId | String]] = js.native
  /**
    * Position id. Used to specify the position of the control on the map.
    * The default position is TOP_RIGHT.
    */
  var position: js.UndefOr[ControlPosition] = js.native
  /** Style id. Used to select what style of map type control to display. */
  var style: js.UndefOr[MapTypeControlStyle] = js.native
}

object MapTypeControlOptions {
  @scala.inline
  def apply(): MapTypeControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTypeControlOptions]
  }
  @scala.inline
  implicit class MapTypeControlOptionsOps[Self <: MapTypeControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMapTypeIds(value: js.Array[MapTypeId | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapTypeIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeIds")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: ControlPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: MapTypeControlStyle): Self = {
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
  }
  
}

