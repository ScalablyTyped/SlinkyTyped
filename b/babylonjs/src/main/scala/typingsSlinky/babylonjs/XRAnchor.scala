package typingsSlinky.babylonjs

import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRAnchor extends js.Object {
  
  var anchorSpace: EventTarget = js.native
  
  def detach(): Unit = js.native
  
  // remove?
  var id: js.UndefOr[String] = js.native
  
  var lastChangedTime: Double = js.native
}
object XRAnchor {
  
  @scala.inline
  def apply(anchorSpace: EventTarget, detach: () => Unit, lastChangedTime: Double): XRAnchor = {
    val __obj = js.Dynamic.literal(anchorSpace = anchorSpace.asInstanceOf[js.Any], detach = js.Any.fromFunction0(detach), lastChangedTime = lastChangedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRAnchor]
  }
  
  @scala.inline
  implicit class XRAnchorOps[Self <: XRAnchor] (val x: Self) extends AnyVal {
    
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
    def setAnchorSpace(value: EventTarget): Self = this.set("anchorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetach(value: () => Unit): Self = this.set("detach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastChangedTime(value: Double): Self = this.set("lastChangedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
