package typingsSlinky.antDesignPro.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignPro.AnonX
import typingsSlinky.antDesignPro.pieMod.IPieProps
import typingsSlinky.antDesignPro.pieMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pie
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("ant-design-pro/lib/Charts/Pie", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    height: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    colors: js.Array[String] = null,
    data: js.Array[AnonX] = null,
    hasLegend: js.UndefOr[Boolean] = js.undefined,
    padding: js.Tuple4[Double, Double, Double, Double] = null,
    percent: Int | Double = null,
    subTitle: TagMod[Any] = null,
    title: TagMod[Any] = null,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    total: TagMod[Any] | Double | (js.Function0[TagMod[Any] | Double]) = null,
    valueFormat: /* value */ String => String | TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLegend)) __obj.updateDynamic("hasLegend")(hasLegend.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(js.Any.fromFunction1(valueFormat))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IPieProps
}

