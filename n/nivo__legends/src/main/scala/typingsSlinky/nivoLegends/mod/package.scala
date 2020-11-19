package typingsSlinky.nivoLegends

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type LegendMouseHandler = js.Function2[
    /* data */ typingsSlinky.nivoLegends.mod.LegendMouseHandlerData, 
    /* event */ slinky.web.SyntheticMouseEvent[js.Any], 
    scala.Unit
  ]
  
  type QuantileLegendSvg = slinky.core.ReactComponentClass[typingsSlinky.nivoLegends.mod.QuantileLegendProps]
}
