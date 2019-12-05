package typingsSlinky.atBlueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEsmComponentsTreeTreeMod {
  import org.scalajs.dom.raw.HTMLElement
  import slinky.web.SyntheticMouseEvent
  import typingsSlinky.atBlueprintjsCore.libEsmComponentsTreeTreeNodeMod.ITreeNode

  type TreeEventHandler[T] = js.Function3[
    /* node */ ITreeNode[T], 
    /* nodePath */ js.Array[Double], 
    /* e */ SyntheticMouseEvent[HTMLElement], 
    Unit
  ]
}
