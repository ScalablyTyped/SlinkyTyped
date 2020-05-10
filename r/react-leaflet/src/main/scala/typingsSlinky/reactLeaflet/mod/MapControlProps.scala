package typingsSlinky.reactLeaflet.mod

import typingsSlinky.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  leaflet ? :react-leaflet.react-leaflet.LeafletContext} & leaflet.leaflet.ControlOptions */
@js.native
trait MapControlProps extends js.Object {
  var leaflet: js.UndefOr[LeafletContext] = js.native
  var position: js.UndefOr[ControlPosition] = js.native
}

object MapControlProps {
  @scala.inline
  def apply(): MapControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapControlProps]
  }
  @scala.inline
  implicit class MapControlPropsOps[Self <: MapControlProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeaflet(value: LeafletContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaflet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaflet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaflet")(js.undefined)
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
  }
  
}

