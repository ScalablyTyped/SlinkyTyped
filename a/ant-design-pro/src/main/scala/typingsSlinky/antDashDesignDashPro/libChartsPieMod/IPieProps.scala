package typingsSlinky.antDashDesignDashPro.libChartsPieMod

import slinky.core.TagMod
import typingsSlinky.antDashDesignDashPro.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPieProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var data: js.UndefOr[js.Array[Anon_X]] = js.undefined
  var hasLegend: js.UndefOr[Boolean] = js.undefined
  var height: Double
  var padding: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
  var subTitle: js.UndefOr[TagMod[Any]] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
  var tooltip: js.UndefOr[Boolean] = js.undefined
  var total: js.UndefOr[TagMod[Any] | Double | (js.Function0[TagMod[Any] | Double])] = js.undefined
  var valueFormat: js.UndefOr[js.Function1[/* value */ String, String | TagMod[Any]]] = js.undefined
}

object IPieProps {
  @scala.inline
  def apply(
    height: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    colors: js.Array[String] = null,
    data: js.Array[Anon_X] = null,
    hasLegend: js.UndefOr[Boolean] = js.undefined,
    padding: js.Tuple4[Double, Double, Double, Double] = null,
    percent: Int | Double = null,
    subTitle: TagMod[Any] = null,
    title: TagMod[Any] = null,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    total: TagMod[Any] | Double | (js.Function0[TagMod[Any] | Double]) = null,
    valueFormat: /* value */ String => String | TagMod[Any] = null
  ): IPieProps = {
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
    __obj.asInstanceOf[IPieProps]
  }
}

