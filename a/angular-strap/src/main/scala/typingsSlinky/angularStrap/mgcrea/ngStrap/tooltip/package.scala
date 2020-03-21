package typingsSlinky.angularStrap.mgcrea.ngStrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tooltip {
  type ITooltipService = js.Function2[
    /* element */ typingsSlinky.angular.mod.IAugmentedJQuery, 
    /* config */ js.UndefOr[typingsSlinky.angularStrap.mgcrea.ngStrap.tooltip.ITooltipOptions], 
    typingsSlinky.angularStrap.mgcrea.ngStrap.tooltip.ITooltip
  ]
}
