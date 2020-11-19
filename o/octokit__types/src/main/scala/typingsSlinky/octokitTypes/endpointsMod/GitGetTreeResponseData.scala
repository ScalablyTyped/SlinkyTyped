package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitGetTreeResponseData extends js.Object {
  
  var sha: String = js.native
  
  var tree: js.Array[Mode] = js.native
  
  var truncated: Boolean = js.native
  
  var url: String = js.native
}
object GitGetTreeResponseData {
  
  @scala.inline
  def apply(sha: String, tree: js.Array[Mode], truncated: Boolean, url: String): GitGetTreeResponseData = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetTreeResponseData]
  }
  
  @scala.inline
  implicit class GitGetTreeResponseDataOps[Self <: GitGetTreeResponseData] (val x: Self) extends AnyVal {
    
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
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeVarargs(value: Mode*): Self = this.set("tree", js.Array(value :_*))
    
    @scala.inline
    def setTree(value: js.Array[Mode]): Self = this.set("tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncated(value: Boolean): Self = this.set("truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
