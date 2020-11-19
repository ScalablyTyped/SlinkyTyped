package typingsSlinky.matrixJsSdk.anon

import typingsSlinky.matrixJsSdk.mod.MatrixEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Presence extends js.Object {
  
  var presence: MatrixEvent = js.native
}
object Presence {
  
  @scala.inline
  def apply(presence: MatrixEvent): Presence = {
    val __obj = js.Dynamic.literal(presence = presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Presence]
  }
  
  @scala.inline
  implicit class PresenceOps[Self <: Presence] (val x: Self) extends AnyVal {
    
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
    def setPresence(value: MatrixEvent): Self = this.set("presence", value.asInstanceOf[js.Any])
  }
}
