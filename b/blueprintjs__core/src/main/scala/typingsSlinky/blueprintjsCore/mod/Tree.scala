package typingsSlinky.blueprintjsCore.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.blueprintjsCore.treeMod.ITreeProps
import typingsSlinky.blueprintjsCore.treeNodeMod.ITreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Tree")
@js.native
class Tree[T] ()
  extends typingsSlinky.blueprintjsCore.componentsMod.Tree[T]
/* static members */
@JSImport("@blueprintjs/core", "Tree")
@js.native
object Tree extends js.Object {
  
  var displayName: String = js.native
  
  def nodeFromPath(path: js.Array[Double], treeNodes: js.Array[ITreeNode[js.Object]]): ITreeNode[js.Object] = js.native
  
  def ofType[T](): Instantiable1[/* props */ ITreeProps[T], typingsSlinky.blueprintjsCore.treeMod.Tree[T]] = js.native
}
