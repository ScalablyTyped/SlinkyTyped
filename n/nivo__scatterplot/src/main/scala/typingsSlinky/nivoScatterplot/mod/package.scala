package typingsSlinky.nivoScatterplot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CustomCanvasLayer = js.Function2[
    /* ctx */ org.scalajs.dom.raw.CanvasRenderingContext2D, 
    /* props */ typingsSlinky.nivoScatterplot.mod.CustomCanvasLayerProps, 
    scala.Unit
  ]
  
  type CustomSvgLayer = js.Function1[
    /* props */ typingsSlinky.nivoScatterplot.mod.CustomSvgLayerProps, 
    slinky.core.facade.ReactElement
  ]
  
  type CustomTooltip = js.Function1[
    /* props */ typingsSlinky.nivoScatterplot.mod.TooltipProps, 
    slinky.core.facade.ReactElement
  ]
  
  type DerivedDatumProp[T] = js.Function1[/* node */ typingsSlinky.nivoScatterplot.mod.Datum, T]
  
  type DerivedNodeProp[T] = js.Function1[/* node */ typingsSlinky.nivoScatterplot.mod.Node, T]
  
  type MouseHandler = js.Function2[
    /* node */ typingsSlinky.nivoScatterplot.mod.Node, 
    /* event */ slinky.web.SyntheticMouseEvent[js.Any], 
    scala.Unit
  ]
  
  type NodeCanvasComponent = js.Function2[
    /* ctx */ org.scalajs.dom.raw.CanvasRenderingContext2D, 
    /* props */ typingsSlinky.nivoScatterplot.mod.NodeProps, 
    scala.Unit
  ]
  
  type NodeComponent = js.Function1[
    /* props */ typingsSlinky.nivoScatterplot.mod.NodeProps, 
    slinky.core.facade.ReactElement
  ]
  
  type Value = scala.Double | java.lang.String | js.Date
  
  type ValueFormatter = js.Function1[
    /* value */ typingsSlinky.nivoScatterplot.mod.Value, 
    java.lang.String | scala.Double
  ]
}
