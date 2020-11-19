package typingsSlinky.nivoLine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AccessorFunc = js.Function1[/* datum */ typingsSlinky.nivoLine.anon.XFormatted, java.lang.String]
  
  type CustomLayer = js.Function1[
    /* props */ typingsSlinky.nivoLine.mod.CustomLayerProps, 
    slinky.core.facade.ReactElement
  ]
  
  type DatumValue = typingsSlinky.nivoCore.mod.DatumValue
  
  type Layer = typingsSlinky.nivoLine.mod.LineLayerType | typingsSlinky.nivoLine.mod.CustomLayer
  
  type PointMouseHandler = js.Function2[
    /* point */ typingsSlinky.nivoLine.mod.Point, 
    /* event */ slinky.web.SyntheticMouseEvent[org.scalajs.dom.raw.Element], 
    scala.Unit
  ]
  
  type PointTooltip = slinky.core.ReactComponentClass[typingsSlinky.nivoLine.mod.PointTooltipProps]
  
  type SliceTooltip = slinky.core.ReactComponentClass[typingsSlinky.nivoLine.mod.SliceTooltipProps]
}
