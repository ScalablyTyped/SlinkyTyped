package typingsSlinky.atNivoLine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoLineMod {
  import slinky.core.ReactComponentClass
  import slinky.core.TagMod

  type DataFormatter = js.Function1[/* value */ LineValue, String | Double]
  type Layer = LineLayerType | LineCustomLayer
  type LineCustomLayer = js.Function1[/* props */ LineCustomLayerProps, TagMod[Any]]
  type LineValue = String | Double | js.Date
  type TooltipFormatter = js.Function1[/* value */ LineValue, TagMod[Any]]
  type TooltipProp = ReactComponentClass[LineTooltipProps]
}
