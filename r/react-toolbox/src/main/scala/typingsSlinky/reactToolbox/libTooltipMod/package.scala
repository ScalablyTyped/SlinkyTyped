package typingsSlinky.reactToolbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTooltipMod {
  type tooltipHOC[P] = js.Function1[
    /* componentClass */ slinky.core.ReactComponentClass[P], 
    typingsSlinky.reactToolbox.libTooltipMod.TooltippedComponentClass[P]
  ]
}
