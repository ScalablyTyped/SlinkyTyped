package typingsSlinky.reactLeaflet.mod.LayersControl

import slinky.core.facade.ReactElement
import typingsSlinky.leaflet.mod.Layer
import typingsSlinky.reactLeaflet.mod.AddLayerHandler
import typingsSlinky.reactLeaflet.mod.Children
import typingsSlinky.reactLeaflet.mod.LeafletContext
import typingsSlinky.reactLeaflet.mod.RemoveLayerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlledLayerProps extends js.Object {
  var addBaseLayer: js.UndefOr[AddLayerHandler] = js.native
  var addOverlay: js.UndefOr[AddLayerHandler] = js.native
  var checked: js.UndefOr[Boolean] = js.native
  var children: Children = js.native
  var leaflet: js.UndefOr[LeafletContext] = js.native
  var name: String = js.native
  var removeLayer: js.UndefOr[RemoveLayerHandler] = js.native
  var removeLayerControl: js.UndefOr[RemoveLayerHandler] = js.native
}

object ControlledLayerProps {
  @scala.inline
  def apply(name: String): ControlledLayerProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlledLayerProps]
  }
  @scala.inline
  implicit class ControlledLayerPropsOps[Self <: ControlledLayerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddBaseLayer(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBaseLayer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAddBaseLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBaseLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withAddOverlay(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOverlay")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAddOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: Children): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
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
    def withRemoveLayer(value: /* layer */ Layer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLayer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveLayerControl(value: /* layer */ Layer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLayerControl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveLayerControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLayerControl")(js.undefined)
        ret
    }
  }
  
}

