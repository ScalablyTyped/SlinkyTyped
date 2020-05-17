package typingsSlinky.reactLeaflet.anon

import typingsSlinky.leaflet.mod.Layer
import typingsSlinky.reactLeaflet.mod.AddLayerHandler
import typingsSlinky.reactLeaflet.mod.RemoveLayerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddBaseLayer extends js.Object {
  var addBaseLayer: AddLayerHandler = js.native
  var addOverlay: AddLayerHandler = js.native
  var removeLayer: RemoveLayerHandler = js.native
  var removeLayerControl: RemoveLayerHandler = js.native
}

object AddBaseLayer {
  @scala.inline
  def apply(
    addBaseLayer: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit,
    addOverlay: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit,
    removeLayer: /* layer */ Layer => Unit,
    removeLayerControl: /* layer */ Layer => Unit
  ): AddBaseLayer = {
    val __obj = js.Dynamic.literal(addBaseLayer = js.Any.fromFunction3(addBaseLayer), addOverlay = js.Any.fromFunction3(addOverlay), removeLayer = js.Any.fromFunction1(removeLayer), removeLayerControl = js.Any.fromFunction1(removeLayerControl))
    __obj.asInstanceOf[AddBaseLayer]
  }
  @scala.inline
  implicit class AddBaseLayerOps[Self <: AddBaseLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddBaseLayer(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBaseLayer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAddOverlay(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOverlay")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRemoveLayer(value: /* layer */ Layer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLayer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveLayerControl(value: /* layer */ Layer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLayerControl")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

