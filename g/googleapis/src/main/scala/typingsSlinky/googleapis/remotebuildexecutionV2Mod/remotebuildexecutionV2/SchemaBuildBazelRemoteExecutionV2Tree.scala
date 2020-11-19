package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `Tree` contains all the Directory protos in a single directory Merkle
  * tree, compressed into one message.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2Tree extends js.Object {
  
  /**
    * All the child directories: the directories referred to by the root and,
    * recursively, all its children. In order to reconstruct the directory
    * tree, the client must take the digests of each of the child directories
    * and then build up a tree starting from the `root`.
    */
  var children: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2Directory]] = js.native
  
  /**
    * The root directory in the tree.
    */
  var root: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Directory] = js.native
}
object SchemaBuildBazelRemoteExecutionV2Tree {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2Tree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2Tree]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2TreeOps[Self <: SchemaBuildBazelRemoteExecutionV2Tree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildrenVarargs(value: SchemaBuildBazelRemoteExecutionV2Directory*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[SchemaBuildBazelRemoteExecutionV2Directory]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setRoot(value: SchemaBuildBazelRemoteExecutionV2Directory): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
