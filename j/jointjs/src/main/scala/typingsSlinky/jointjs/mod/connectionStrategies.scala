package typingsSlinky.jointjs.mod

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.jointjs.mod.dia.Cell
import typingsSlinky.jointjs.mod.dia.CellView
import typingsSlinky.jointjs.mod.dia.Element
import typingsSlinky.jointjs.mod.dia.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "connectionStrategies")
@js.native
object connectionStrategies extends js.Object {
  
  var pinAbsolute: ConnectionStrategy = js.native
  
  var pinRelative: ConnectionStrategy = js.native
  
  var useDefaults: ConnectionStrategy = js.native
  
  type ConnectionStrategy = js.Function4[
    /* endDefinition */ Cell, 
    /* endView */ CellView, 
    /* endMagnet */ SVGElement, 
    /* coords */ Point, 
    Element
  ]
}
