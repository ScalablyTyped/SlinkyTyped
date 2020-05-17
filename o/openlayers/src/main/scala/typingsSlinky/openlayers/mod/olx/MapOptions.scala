package typingsSlinky.openlayers.mod.olx

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import typingsSlinky.openlayers.mod.Collection
import typingsSlinky.openlayers.mod.Overlay
import typingsSlinky.openlayers.mod.RendererType
import typingsSlinky.openlayers.mod.View
import typingsSlinky.openlayers.mod.control.Control
import typingsSlinky.openlayers.mod.interaction.Interaction
import typingsSlinky.openlayers.mod.layer.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with config options for the map.
  */
@js.native
trait MapOptions extends js.Object {
  var controls: js.UndefOr[Collection[Control] | js.Array[Control]] = js.native
  var interactions: js.UndefOr[Collection[Interaction] | js.Array[Interaction]] = js.native
  var keyboardEventTarget: js.UndefOr[Element | Document | String] = js.native
  var layers: js.UndefOr[js.Array[Base] | Collection[Base]] = js.native
  var loadTilesWhileAnimating: js.UndefOr[Boolean] = js.native
  var loadTilesWhileInteracting: js.UndefOr[Boolean] = js.native
  var logo: js.UndefOr[Boolean | String | LogoOptions | Element] = js.native
  var moveTolerance: js.UndefOr[Double] = js.native
  var overlays: js.UndefOr[Collection[Overlay] | js.Array[Overlay]] = js.native
  var pixelRatio: js.UndefOr[Double] = js.native
  var renderer: js.UndefOr[RendererType | (js.Array[RendererType | String]) | String] = js.native
  var target: js.UndefOr[Element | String] = js.native
  var view: js.UndefOr[View] = js.native
}

object MapOptions {
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControls(value: Collection[Control] | js.Array[Control]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractions(value: Collection[Interaction] | js.Array[Interaction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactions")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardEventTargetDocument(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEventTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardEventTargetElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEventTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardEventTarget(value: Element | Document | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEventTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardEventTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEventTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[Base] | Collection[Base]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadTilesWhileAnimating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTilesWhileAnimating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadTilesWhileAnimating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTilesWhileAnimating")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadTilesWhileInteracting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTilesWhileInteracting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadTilesWhileInteracting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTilesWhileInteracting")(js.undefined)
        ret
    }
    @scala.inline
    def withLogoElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogo(value: Boolean | String | LogoOptions | Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlays(value: Collection[Overlay] | js.Array[Overlay]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlays")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: RendererType | (js.Array[RendererType | String]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Element | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

