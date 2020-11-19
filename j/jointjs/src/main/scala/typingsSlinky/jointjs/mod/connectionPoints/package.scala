package typingsSlinky.jointjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object connectionPoints {
  
  type ConnectionPoint = typingsSlinky.jointjs.mod.connectionPoints.GenericConnectionPoint[typingsSlinky.jointjs.mod.connectionPoints.ConnectionPointType]
  
  type ConnectionPointJSON = typingsSlinky.jointjs.mod.connectionPoints.GenericConnectionPointJSON[typingsSlinky.jointjs.mod.connectionPoints.ConnectionPointType]
  
  type GenericConnectionPoint[K /* <: typingsSlinky.jointjs.mod.connectionPoints.ConnectionPointType */] = js.Function4[
    /* endPathSegmentLine */ typingsSlinky.jointjs.mod.g.Line, 
    /* endView */ typingsSlinky.jointjs.mod.dia.CellView, 
    /* endMagnet */ org.scalajs.dom.raw.SVGElement, 
    /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ /* opt */ js.Any, 
    typingsSlinky.jointjs.mod.g.Point
  ]
  
  type GenericConnectionPointArguments[K /* <: typingsSlinky.jointjs.mod.connectionPoints.ConnectionPointType */] = /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ js.Any
}
