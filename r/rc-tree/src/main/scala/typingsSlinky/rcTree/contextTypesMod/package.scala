package typingsSlinky.rcTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object contextTypesMod {
  
  type NodeDragEventHandler = js.Function2[
    /* e */ slinky.web.SyntheticMouseEvent[org.scalajs.dom.raw.HTMLDivElement], 
    /* node */ typingsSlinky.rcTree.interfaceMod.NodeInstance, 
    scala.Unit
  ]
  
  type NodeMouseEventHandler = js.Function2[
    /* e */ slinky.web.SyntheticMouseEvent[org.scalajs.dom.raw.HTMLDivElement], 
    /* node */ typingsSlinky.rcTree.interfaceMod.EventDataNode, 
    scala.Unit
  ]
}
