package typingsSlinky.nivoSankey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AccessorFunc = js.Function1[/* datum */ typingsSlinky.nivoSankey.mod.SankeyNodeDatum, java.lang.String]
  
  type LabelFormatter = js.Function1[/* label */ java.lang.String | scala.Double, java.lang.String | scala.Double]
  
  type SankeyMouseHandler = js.Function2[
    /* data */ typingsSlinky.nivoSankey.mod.SankeyNodeDatum | typingsSlinky.nivoSankey.mod.SankeyLinkDatum, 
    /* event */ slinky.web.SyntheticMouseEvent[org.scalajs.dom.raw.Element], 
    scala.Unit
  ]
  
  type SankeySortFunction = js.Function2[
    /* nodeA */ typingsSlinky.nivoSankey.mod.SankeyDataNode, 
    /* nodeB */ typingsSlinky.nivoSankey.mod.SankeyDataNode, 
    scala.Double
  ]
  
  type TooltipFormat = js.Function1[/* value */ scala.Double, slinky.core.facade.ReactElement]
  
  type TooltipRenderer[T] = js.Function1[/* data */ T, slinky.core.facade.ReactElement]
}
