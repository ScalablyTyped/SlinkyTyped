package typingsSlinky.reactMapGl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  def MapContext: typingsSlinky.react.mod.Context[typingsSlinky.reactMapGl.mod.MapContextProps] = typingsSlinky.reactMapGl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("_MapContext").asInstanceOf[typingsSlinky.react.mod.Context[typingsSlinky.reactMapGl.mod.MapContextProps]]
  
  type SVGRedrawOptions = typingsSlinky.reactMapGl.mod.HTMLRedrawOptions
  
  type ViewStateChangeHandler = js.Function1[/* info */ typingsSlinky.reactMapGl.mod.ViewStateChangeInfo, scala.Unit]
  
  type ViewportChangeHandler = js.Function1[/* viewState */ typingsSlinky.reactMapGl.mod.ViewportProps, scala.Unit]
}
