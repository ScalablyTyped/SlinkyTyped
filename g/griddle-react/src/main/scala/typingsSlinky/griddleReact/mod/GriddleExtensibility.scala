package typingsSlinky.griddleReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GriddleExtensibility extends js.Object {
  var components: js.UndefOr[GriddleComponents] = js.native
  var events: js.UndefOr[GriddleEvents] = js.native
  var listeners: js.UndefOr[PropertyBag[Listener]] = js.native
  var reducer: js.UndefOr[PropertyBag[Reducer]] = js.native
  var renderProperties: js.UndefOr[GriddleRenderProperties] = js.native
  var selectors: js.UndefOr[PropertyBag[Selector]] = js.native
  var settingsComponentObjects: js.UndefOr[PropertyBag[SettingsComponentObject]] = js.native
  var styleConfig: js.UndefOr[GriddleStyleConfig] = js.native
}

object GriddleExtensibility {
  @scala.inline
  def apply(): GriddleExtensibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleExtensibility]
  }
  @scala.inline
  implicit class GriddleExtensibilityOps[Self <: GriddleExtensibility] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponents(value: GriddleComponents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: GriddleEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withListeners(value: PropertyBag[Listener]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(js.undefined)
        ret
    }
    @scala.inline
    def withReducer(value: PropertyBag[Reducer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReducer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducer")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderProperties(value: GriddleRenderProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectors(value: PropertyBag[Selector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsComponentObjects(value: PropertyBag[SettingsComponentObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsComponentObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsComponentObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsComponentObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleConfig(value: GriddleStyleConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleConfig")(js.undefined)
        ret
    }
  }
  
}

