package typingsSlinky.codemirror.anon

import typingsSlinky.codemirror.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Anchor extends js.Object {
  
  var anchor: Position = js.native
  
  var head: Position = js.native
}
object Anchor {
  
  @scala.inline
  def apply(anchor: Position, head: Position): Anchor = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
  
  @scala.inline
  implicit class AnchorOps[Self <: Anchor] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: Position): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead(value: Position): Self = this.set("head", value.asInstanceOf[js.Any])
  }
}
