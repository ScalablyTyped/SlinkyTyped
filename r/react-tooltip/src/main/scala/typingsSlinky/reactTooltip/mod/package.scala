package typingsSlinky.reactTooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetContent = typingsSlinky.reactTooltip.mod.GetContentFunc | (js.Tuple2[typingsSlinky.reactTooltip.mod.GetContentFunc, scala.Double])
  type GetContentFunc = js.Function1[/* toolTipStr */ java.lang.String, slinky.core.facade.ReactElement]
  type ReactTooltip = slinky.core.ReactComponentClass[typingsSlinky.reactTooltip.mod.TooltipProps]
  type VoidFunc = js.Function1[/* repeated */ js.Any, scala.Unit]
}
