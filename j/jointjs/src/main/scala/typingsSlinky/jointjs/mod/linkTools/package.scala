package typingsSlinky.jointjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object linkTools {
  
  type Anchor = typingsSlinky.jointjs.mod.linkTools.Anchor_
  
  type AnchorCallback[T] = js.Function6[
    /* coords */ typingsSlinky.jointjs.mod.g.Point, 
    /* view */ typingsSlinky.jointjs.mod.dia.CellView, 
    /* magnet */ org.scalajs.dom.raw.SVGElement, 
    /* type */ java.lang.String, 
    /* linkView */ typingsSlinky.jointjs.mod.dia.LinkView, 
    /* toolView */ typingsSlinky.jointjs.mod.dia.ToolView, 
    T
  ]
  
  type Boundary = typingsSlinky.jointjs.mod.linkTools.Boundary_
  
  type Button = typingsSlinky.jointjs.mod.linkTools.Button_
  
  type Segments = typingsSlinky.jointjs.mod.linkTools.Segments_
  
  type Vertices = typingsSlinky.jointjs.mod.linkTools.Vertices_
}
