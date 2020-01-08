package typingsSlinky.antDashDesignDashPro.libChartsBarMod

import slinky.core.TagMod
import typingsSlinky.antDashDesignDashPro.Anon_X
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBarProps extends js.Object {
  var autoLabel: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var data: js.Array[Anon_X]
  var height: Double
  var padding: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: TagMod[Any]
}

object IBarProps {
  @scala.inline
  def apply(
    data: js.Array[Anon_X],
    height: Double,
    title: TagMod[Any],
    autoLabel: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    padding: js.Tuple4[Double, Double, Double, Double] = null,
    style: CSSProperties = null
  ): IBarProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLabel)) __obj.updateDynamic("autoLabel")(autoLabel.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBarProps]
  }
}

