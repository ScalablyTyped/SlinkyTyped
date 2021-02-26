package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitCreateTreeEndpoint extends StObject {
  
  /**
    * The SHA1 of the tree you want to update with new data. If you don't set this, the commit will be created on top of everything; however, it will only contain your change, the rest of your files will show up as deleted.
    */
  var base_tree: js.UndefOr[String] = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  /**
    * Objects (of `path`, `mode`, `type`, and `sha`) specifying a tree structure.
    */
  var tree: js.Array[GitCreateTreeParamsTree] = js.native
}
object GitCreateTreeEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, tree: js.Array[GitCreateTreeParamsTree]): GitCreateTreeEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTreeEndpoint]
  }
  
  @scala.inline
  implicit class GitCreateTreeEndpointMutableBuilder[Self <: GitCreateTreeEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase_tree(value: String): Self = StObject.set(x, "base_tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase_treeUndefined: Self = StObject.set(x, "base_tree", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(value: js.Array[GitCreateTreeParamsTree]): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeVarargs(value: GitCreateTreeParamsTree*): Self = StObject.set(x, "tree", js.Array(value :_*))
  }
}
