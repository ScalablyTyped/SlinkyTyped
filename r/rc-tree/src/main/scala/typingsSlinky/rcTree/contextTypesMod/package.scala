package typingsSlinky.rcTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object contextTypesMod {
  
  type NodeDragEventHandler[T] = js.Function2[
    /* e */ slinky.web.SyntheticMouseEvent[T], 
    /* node */ typingsSlinky.rcTree.interfaceMod.NodeInstance, 
    scala.Unit
  ]
  
  type NodeMouseEventHandler[T] = js.Function2[
    /* e */ slinky.web.SyntheticMouseEvent[T], 
    /* node */ typingsSlinky.rcTree.interfaceMod.EventDataNode, 
    scala.Unit
  ]
}
