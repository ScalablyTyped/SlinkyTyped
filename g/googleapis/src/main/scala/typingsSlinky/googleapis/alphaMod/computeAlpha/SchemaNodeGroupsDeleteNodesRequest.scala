package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNodeGroupsDeleteNodesRequest extends js.Object {
  
  var nodes: js.UndefOr[js.Array[String]] = js.native
}
object SchemaNodeGroupsDeleteNodesRequest {
  
  @scala.inline
  def apply(): SchemaNodeGroupsDeleteNodesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupsDeleteNodesRequest]
  }
  
  @scala.inline
  implicit class SchemaNodeGroupsDeleteNodesRequestOps[Self <: SchemaNodeGroupsDeleteNodesRequest] (val x: Self) extends AnyVal {
    
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
    def setNodesVarargs(value: String*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[String]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
  }
}
