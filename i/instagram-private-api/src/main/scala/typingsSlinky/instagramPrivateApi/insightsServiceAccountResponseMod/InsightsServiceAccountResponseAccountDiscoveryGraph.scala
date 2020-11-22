package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseAccountDiscoveryGraph extends js.Object {
  
  var nodes: js.Array[InsightsServiceAccountResponseNodesItem] = js.native
}
object InsightsServiceAccountResponseAccountDiscoveryGraph {
  
  @scala.inline
  def apply(nodes: js.Array[InsightsServiceAccountResponseNodesItem]): InsightsServiceAccountResponseAccountDiscoveryGraph = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAccountDiscoveryGraph]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseAccountDiscoveryGraphOps[Self <: InsightsServiceAccountResponseAccountDiscoveryGraph] (val x: Self) extends AnyVal {
    
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
    def setNodesVarargs(value: InsightsServiceAccountResponseNodesItem*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[InsightsServiceAccountResponseNodesItem]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
}
