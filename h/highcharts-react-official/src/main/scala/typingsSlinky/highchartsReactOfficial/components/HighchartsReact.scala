package typingsSlinky.highchartsReactOfficial.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.highcharts.mod.Chart_
import typingsSlinky.highcharts.mod.Options
import typingsSlinky.highchartsReactOfficial.TypeofHighcharts
import typingsSlinky.highchartsReactOfficial.highchartsReactMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HighchartsReact
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("highcharts-react-official/dist/highcharts-react", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    allowChartUpdate: js.UndefOr[Boolean] = js.undefined,
    callback: /* chart */ Chart_ => Unit = null,
    constructorType: String = null,
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
    if (highcharts != null) __obj.updateDynamic("highcharts")(highcharts.asInstanceOf[js.Any])
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (updateArgs != null) __obj.updateDynamic("updateArgs")(updateArgs.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.highchartsReactOfficial.highchartsReactMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.highchartsReactOfficial.highchartsReactMod.HighchartsReact.Props
}

