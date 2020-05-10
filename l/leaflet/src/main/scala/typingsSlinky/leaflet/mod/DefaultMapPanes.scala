package typingsSlinky.leaflet.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultMapPanes extends js.Object {
  var mapPane: HTMLElement = js.native
  var markerPane: HTMLElement = js.native
  var overlayPane: HTMLElement = js.native
  var popupPane: HTMLElement = js.native
  var shadowPane: HTMLElement = js.native
  var tilePane: HTMLElement = js.native
  var tooltipPane: HTMLElement = js.native
}

object DefaultMapPanes {
  @scala.inline
  def apply(
    mapPane: HTMLElement,
    markerPane: HTMLElement,
    overlayPane: HTMLElement,
    popupPane: HTMLElement,
    shadowPane: HTMLElement,
    tilePane: HTMLElement,
    tooltipPane: HTMLElement
  ): DefaultMapPanes = {
    val __obj = js.Dynamic.literal(mapPane = mapPane.asInstanceOf[js.Any], markerPane = markerPane.asInstanceOf[js.Any], overlayPane = overlayPane.asInstanceOf[js.Any], popupPane = popupPane.asInstanceOf[js.Any], shadowPane = shadowPane.asInstanceOf[js.Any], tilePane = tilePane.asInstanceOf[js.Any], tooltipPane = tooltipPane.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultMapPanes]
  }
  @scala.inline
  implicit class DefaultMapPanesOps[Self <: DefaultMapPanes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMapPane(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerPane(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlayPane(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopupPane(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowPane(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTilePane(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilePane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipPane(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPane")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

