package typingsSlinky.reactTooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetContentFunc = js.Function1[/* toolTipStr */ java.lang.String, slinky.core.TagMod[scala.Any]]
  type ReactTooltip = slinky.core.ReactComponentClass[typingsSlinky.reactTooltip.mod.TooltipProps]
  type VoidFunc = js.Function1[/* repeated */ js.Any, scala.Unit]
}
