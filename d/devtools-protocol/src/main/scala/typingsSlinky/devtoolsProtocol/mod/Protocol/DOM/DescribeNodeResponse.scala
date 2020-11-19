package typingsSlinky.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNodeResponse extends js.Object {
  
  /**
    * Node description.
    */
  var node: Node = js.native
}
object DescribeNodeResponse {
  
  @scala.inline
  def apply(node: Node): DescribeNodeResponse = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodeResponse]
  }
  
  @scala.inline
  implicit class DescribeNodeResponseOps[Self <: DescribeNodeResponse] (val x: Self) extends AnyVal {
    
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
    def setNode(value: Node): Self = this.set("node", value.asInstanceOf[js.Any])
  }
}
