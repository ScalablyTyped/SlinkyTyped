package typingsSlinky.highchartsDashReactDashOfficial.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.highcharts.highchartsMod.Chart
import typingsSlinky.highcharts.highchartsMod.Options
import typingsSlinky.highchartsDashReactDashOfficial.TypeofHighcharts
import typingsSlinky.highchartsDashReactDashOfficial.distHighchartsDashReactMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HighchartsDashReact
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("highcharts-react-official/dist/highcharts-react", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    allowChartUpdate: js.UndefOr[Boolean] = js.undefined,
    callback: /* chart */ Chart => Unit = null,
    constructorType: String = null,
    containerProps: StringDictionary[js.Any] = null,
    highcharts: TypeofHighcharts = null,
    immutable: js.UndefOr[Boolean] = js.undefined,
    options: Options = null,
    updateArgs: js.Array[Boolean] | (js.Tuple2[Boolean, Boolean]) | (js.Tuple3[Boolean, Boolean, Boolean]) = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowChartUpdate)) __obj.updateDynamic("allowChartUpdate")(allowChartUpdate.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (constructorType != null) __obj.updateDynamic("constructorType")(constructorType.asInstanceOf[js.Any])
    if (containerProps != null) __obj.updateDynamic("containerProps")(containerProps.asInstanceOf[js.Any])
    if (highcharts != null) __obj.updateDynamic("highcharts")(highcharts.asInstanceOf[js.Any])
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (updateArgs != null) __obj.updateDynamic("updateArgs")(updateArgs.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.highchartsDashReactDashOfficial.distHighchartsDashReactMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.highchartsDashReactDashOfficial.distHighchartsDashReactMod.HighchartsReact.Props
}

