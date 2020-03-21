package typingsSlinky.reactMapGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ContextViewStateChangeHandler = js.Function1[/* info */ typingsSlinky.reactMapGl.mod.ContextViewStateChangeInfo, scala.Unit]
  type ContextViewportChangeHandler = js.Function3[
    /* viewState */ typingsSlinky.reactMapGl.mod.ViewportProps, 
    /* interactionState */ typingsSlinky.reactMapGl.mod.ExtraState, 
    /* oldViewState */ typingsSlinky.reactMapGl.mod.ViewportProps, 
    scala.Unit
  ]
  type EasingFunction = js.Function1[/* t */ scala.Double, scala.Double]
  type EventManager = js.Any
  type SVGRedrawOptions = typingsSlinky.reactMapGl.mod.HTMLRedrawOptions
  type ViewStateChangeHandler = js.Function1[/* info */ typingsSlinky.reactMapGl.mod.ViewStateChangeInfo, scala.Unit]
  type ViewportChangeHandler = js.Function1[/* viewState */ typingsSlinky.reactMapGl.mod.ViewportProps, scala.Unit]
}
