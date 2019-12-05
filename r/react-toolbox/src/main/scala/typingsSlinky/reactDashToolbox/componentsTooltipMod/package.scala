package typingsSlinky.reactDashToolbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object componentsTooltipMod {
  import slinky.core.ReactComponentClass

  type tooltipHOC[P] = js.Function1[/* componentClass */ ReactComponentClass[P], TooltippedComponentClass[P]]
}
