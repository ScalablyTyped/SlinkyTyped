package typingsSlinky.ol.controlOverviewMapMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var collapseLabel: js.UndefOr[String | HTMLElement] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String | HTMLElement] = js.undefined
  var layers: js.UndefOr[
    js.Array[typingsSlinky.ol.layerLayerMod.default] | typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.layerLayerMod.default]
  ] = js.undefined
  var render: js.UndefOr[js.Function1[/* p0 */ typingsSlinky.ol.mapEventMod.default, Unit]] = js.undefined
  var target: js.UndefOr[HTMLElement | String] = js.undefined
  var tipLabel: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[typingsSlinky.ol.viewMod.default] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: String = null,
    collapseLabel: String | HTMLElement = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    label: String | HTMLElement = null,
    layers: js.Array[typingsSlinky.ol.layerLayerMod.default] | typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.layerLayerMod.default] = null,
    render: /* p0 */ typingsSlinky.ol.mapEventMod.default => Unit = null,
    target: HTMLElement | String = null,
    tipLabel: String = null,
    view: typingsSlinky.ol.viewMod.default = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collapseLabel != null) __obj.updateDynamic("collapseLabel")(collapseLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tipLabel != null) __obj.updateDynamic("tipLabel")(tipLabel.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

