package typingsSlinky.nivoLine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DataFormatter = js.Function1[/* value */ typingsSlinky.nivoLine.mod.LineValue, java.lang.String | scala.Double]
  type LineCustomLayer = js.Function1[
    /* props */ typingsSlinky.nivoLine.mod.LineCustomLayerProps, 
    slinky.core.TagMod[scala.Any]
  ]
  type TooltipFormatter = js.Function1[/* value */ typingsSlinky.nivoLine.mod.LineValue, slinky.core.TagMod[scala.Any]]
  type TooltipProp = slinky.core.ReactComponentClass[typingsSlinky.nivoLine.mod.LineTooltipProps]
}
