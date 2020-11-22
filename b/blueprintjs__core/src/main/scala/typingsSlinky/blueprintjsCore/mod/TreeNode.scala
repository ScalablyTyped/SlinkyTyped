package typingsSlinky.blueprintjsCore.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.blueprintjsCore.treeNodeMod.ITreeNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "TreeNode")
@js.native
class TreeNode[T] ()
  extends typingsSlinky.blueprintjsCore.componentsMod.TreeNode[T]
/* static members */
@JSImport("@blueprintjs/core", "TreeNode")
@js.native
object TreeNode extends js.Object {
  
  var displayName: String = js.native
  
  def ofType[U](): Instantiable1[
    /* props */ ITreeNodeProps[U], 
    typingsSlinky.blueprintjsCore.treeNodeMod.TreeNode[U]
  ] = js.native
}
