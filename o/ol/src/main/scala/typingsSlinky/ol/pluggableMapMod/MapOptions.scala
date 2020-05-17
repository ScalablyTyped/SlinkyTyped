package typingsSlinky.ol.pluggableMapMod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapOptions extends js.Object {
  var controls: js.UndefOr[
    typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.controlControlMod.default] | js.Array[typingsSlinky.ol.controlControlMod.default]
  ] = js.native
  var interactions: js.UndefOr[
    typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.interactionInteractionMod.default] | js.Array[typingsSlinky.ol.interactionInteractionMod.default]
  ] = js.native
  var keyboardEventTarget: js.UndefOr[HTMLElement | Document | String] = js.native
  var layers: js.UndefOr[
    js.Array[typingsSlinky.ol.baseMod.default] | typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.baseMod.default] | typingsSlinky.ol.groupMod.default
  ] = js.native
  var maxTilesLoading: js.UndefOr[Double] = js.native
  var moveTolerance: js.UndefOr[Double] = js.native
  var overlays: js.UndefOr[
    typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.overlayMod.default] | js.Array[typingsSlinky.ol.overlayMod.default]
  ] = js.native
  var pixelRatio: js.UndefOr[Double] = js.native
  var target: js.UndefOr[HTMLElement | String] = js.native
  var view: js.UndefOr[typingsSlinky.ol.viewMod.default] = js.native
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
    def withControls(
      value: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.controlControlMod.default] | js.Array[typingsSlinky.ol.controlControlMod.default]
    ): Self = {
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
    def withInteractions(
      value: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.interactionInteractionMod.default] | js.Array[typingsSlinky.ol.interactionInteractionMod.default]
    ): Self = {
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
    def withKeyboardEventTargetHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEventTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardEventTarget(value: HTMLElement | Document | String): Self = {
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
    def withLayers(
      value: js.Array[typingsSlinky.ol.baseMod.default] | typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.baseMod.default] | typingsSlinky.ol.groupMod.default
    ): Self = {
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
    def withMaxTilesLoading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTilesLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTilesLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTilesLoading")(js.undefined)
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
    def withOverlays(
      value: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.overlayMod.default] | js.Array[typingsSlinky.ol.overlayMod.default]
    ): Self = {
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
    def withTargetHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: HTMLElement | String): Self = {
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
    def withView(value: typingsSlinky.ol.viewMod.default): Self = {
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

