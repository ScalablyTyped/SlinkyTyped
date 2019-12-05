package typingsSlinky.atNivoScales.atNivoScalesMod

import typingsSlinky.atNivoScales.atNivoScalesStrings.auto
import typingsSlinky.atNivoScales.atNivoScalesStrings.day
import typingsSlinky.atNivoScales.atNivoScalesStrings.hour
import typingsSlinky.atNivoScales.atNivoScalesStrings.linear
import typingsSlinky.atNivoScales.atNivoScalesStrings.log
import typingsSlinky.atNivoScales.atNivoScalesStrings.millisecond
import typingsSlinky.atNivoScales.atNivoScalesStrings.minute
import typingsSlinky.atNivoScales.atNivoScalesStrings.month
import typingsSlinky.atNivoScales.atNivoScalesStrings.point
import typingsSlinky.atNivoScales.atNivoScalesStrings.second
import typingsSlinky.atNivoScales.atNivoScalesStrings.time
import typingsSlinky.atNivoScales.atNivoScalesStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atNivoScales.atNivoScalesMod.LinearScale
  - typings.atNivoScales.atNivoScalesMod.PointScale
  - typings.atNivoScales.atNivoScalesMod.TimeScale
  - typings.atNivoScales.atNivoScalesMod.LogScale
*/
trait Scale extends js.Object

object Scale {
  @scala.inline
  def LinearScale(
    `type`: linear,
    max: auto | Double = null,
    min: auto | Double = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    stacked: js.UndefOr[Boolean] = js.undefined
  ): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (!js.isUndefined(stacked)) __obj.updateDynamic("stacked")(stacked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def PointScale(`type`: point): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def TimeScale(
    `type`: time,
    format: String = null,
    precision: millisecond | second | minute | hour | month | year | day = null
  ): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def LogScale(`type`: log, base: Int | Double = null, max: auto | Double = null, min: auto | Double = null): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}

