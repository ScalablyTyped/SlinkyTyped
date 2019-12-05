package typingsSlinky.ol.pluggableMapMod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var controls: js.UndefOr[
    typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.controlControlMod.default] | js.Array[typingsSlinky.ol.controlControlMod.default]
  ] = js.undefined
  var interactions: js.UndefOr[
    typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.interactionInteractionMod.default] | js.Array[typingsSlinky.ol.interactionInteractionMod.default]
  ] = js.undefined
  var keyboardEventTarget: js.UndefOr[HTMLElement | Document | String] = js.undefined
  var layers: js.UndefOr[
    js.Array[typingsSlinky.ol.layerBaseMod.default] | typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.layerBaseMod.default] | typingsSlinky.ol.layerGroupMod.default
  ] = js.undefined
  var loadTilesWhileAnimating: js.UndefOr[Boolean] = js.undefined
  var loadTilesWhileInteracting: js.UndefOr[Boolean] = js.undefined
  var maxTilesLoading: js.UndefOr[Double] = js.undefined
  var moveTolerance: js.UndefOr[Double] = js.undefined
  var overlays: js.UndefOr[
    typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.overlayMod.default] | js.Array[typingsSlinky.ol.overlayMod.default]
  ] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[HTMLElement | String] = js.undefined
  var view: js.UndefOr[typingsSlinky.ol.viewMod.default] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    controls: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.controlControlMod.default] | js.Array[typingsSlinky.ol.controlControlMod.default] = null,
    interactions: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.interactionInteractionMod.default] | js.Array[typingsSlinky.ol.interactionInteractionMod.default] = null,
    keyboardEventTarget: HTMLElement | Document | String = null,
    layers: js.Array[typingsSlinky.ol.layerBaseMod.default] | typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.layerBaseMod.default] | typingsSlinky.ol.layerGroupMod.default = null,
    loadTilesWhileAnimating: js.UndefOr[Boolean] = js.undefined,
    loadTilesWhileInteracting: js.UndefOr[Boolean] = js.undefined,
    maxTilesLoading: Int | Double = null,
    moveTolerance: Int | Double = null,
    overlays: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.overlayMod.default] | js.Array[typingsSlinky.ol.overlayMod.default] = null,
    pixelRatio: Int | Double = null,
    target: HTMLElement | String = null,
    view: typingsSlinky.ol.viewMod.default = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (interactions != null) __obj.updateDynamic("interactions")(interactions.asInstanceOf[js.Any])
    if (keyboardEventTarget != null) __obj.updateDynamic("keyboardEventTarget")(keyboardEventTarget.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (!js.isUndefined(loadTilesWhileAnimating)) __obj.updateDynamic("loadTilesWhileAnimating")(loadTilesWhileAnimating.asInstanceOf[js.Any])
    if (!js.isUndefined(loadTilesWhileInteracting)) __obj.updateDynamic("loadTilesWhileInteracting")(loadTilesWhileInteracting.asInstanceOf[js.Any])
    if (maxTilesLoading != null) __obj.updateDynamic("maxTilesLoading")(maxTilesLoading.asInstanceOf[js.Any])
    if (moveTolerance != null) __obj.updateDynamic("moveTolerance")(moveTolerance.asInstanceOf[js.Any])
    if (overlays != null) __obj.updateDynamic("overlays")(overlays.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

