package typingsSlinky.atNivoLegends

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoLegendsMod {
  import slinky.core.ReactComponentClass
  import slinky.web.SyntheticMouseEvent

  type LegendMouseHandler = js.Function2[/* data */ LegendMouseHandlerData, /* event */ SyntheticMouseEvent[js.Any], Unit]
  type QuantileLegendSvg = ReactComponentClass[QuantileLegendProps]
}
