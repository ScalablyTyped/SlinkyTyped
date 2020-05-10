package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapControls extends js.Object {
  var attribution: js.UndefOr[Boolean | MapControlsAttribution] = js.native
  var navigator: js.UndefOr[Boolean | MapControlsNavigator] = js.native
  var zoom: js.UndefOr[Boolean | MapControlsZoom] = js.native
}

object MapControls {
  @scala.inline
  def apply(): MapControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapControls]
  }
  @scala.inline
  implicit class MapControlsOps[Self <: MapControls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribution(value: Boolean | MapControlsAttribution): Self = {
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
    def withNavigator(value: Boolean | MapControlsNavigator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigator")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Boolean | MapControlsZoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

