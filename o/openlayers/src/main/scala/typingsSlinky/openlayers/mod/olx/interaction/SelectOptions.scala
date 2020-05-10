package typingsSlinky.openlayers.mod.olx.interaction

import typingsSlinky.openlayers.mod.Collection
import typingsSlinky.openlayers.mod.EventsConditionType
import typingsSlinky.openlayers.mod.Feature
import typingsSlinky.openlayers.mod.MapBrowserEvent
import typingsSlinky.openlayers.mod.SelectFilterFunction
import typingsSlinky.openlayers.mod.StyleFunction
import typingsSlinky.openlayers.mod.layer.Layer
import typingsSlinky.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectOptions extends js.Object {
  var addCondition: js.UndefOr[EventsConditionType] = js.native
  var condition: js.UndefOr[EventsConditionType] = js.native
  var features: js.UndefOr[Collection[Feature]] = js.native
  var filter: js.UndefOr[SelectFilterFunction] = js.native
  var hitTolerance: js.UndefOr[Double] = js.native
  var layers: js.UndefOr[js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean])] = js.native
  var multi: js.UndefOr[Boolean] = js.native
  var removeCondition: js.UndefOr[EventsConditionType] = js.native
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
  var toggleCondition: js.UndefOr[EventsConditionType] = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
}

object SelectOptions {
  @scala.inline
  def apply(): SelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectOptions]
  }
  @scala.inline
  implicit class SelectOptionsOps[Self <: SelectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCondition(value: /* event */ MapBrowserEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCondition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withCondition(value: /* event */ MapBrowserEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: Collection[Feature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(
      value: (/* feature */ Feature | typingsSlinky.openlayers.mod.render.Feature, /* layer */ Layer) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withHitTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withLayersFunction1(value: /* layer */ Layer => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean])): Self = {
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
    def withMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveCondition(value: /* event */ MapBrowserEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCondition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleFunction2(
      value: (/* feature */ Feature | typingsSlinky.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStyle(value: Style | js.Array[Style] | StyleFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleCondition(value: /* event */ MapBrowserEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCondition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToggleCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapX")(js.undefined)
        ret
    }
  }
  
}

