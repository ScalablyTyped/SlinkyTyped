package typingsSlinky.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object treeMod {
  
  type TreeEventHandler[T] = js.Function3[
    /* node */ typingsSlinky.blueprintjsCore.treeNodeMod.ITreeNode[T], 
    /* nodePath */ js.Array[scala.Double], 
    /* e */ slinky.web.SyntheticMouseEvent[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
}
