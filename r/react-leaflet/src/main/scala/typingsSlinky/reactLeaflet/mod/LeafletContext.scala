package typingsSlinky.reactLeaflet.mod

import typingsSlinky.leaflet.mod.Layer
import typingsSlinky.leaflet.mod.Map_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeafletContext extends js.Object {
  var layerContainer: js.UndefOr[LayerContainer] = js.native
  var map: js.UndefOr[Map_] = js.native
  var pane: js.UndefOr[String] = js.native
  var popupContainer: js.UndefOr[Layer] = js.native
}

object LeafletContext {
  @scala.inline
  def apply(): LeafletContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeafletContext]
  }
  @scala.inline
  implicit class LeafletContextOps[Self <: LeafletContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayerContainer(value: LayerContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: Map_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withPane(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupContainer(value: Layer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupContainer")(js.undefined)
        ret
    }
  }
  
}

