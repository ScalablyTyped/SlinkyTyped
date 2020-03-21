package typingsSlinky.antDesignPro.waterWaveMod

import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWaterWaveProps extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var height: Double
  var percent: Double
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: TagMod[Any]
}

object IWaterWaveProps {
  @scala.inline
  def apply(
    height: Double,
    percent: Double,
    title: TagMod[Any],
    color: String = null,
    style: CSSProperties = null
  ): IWaterWaveProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWaterWaveProps]
  }
}

