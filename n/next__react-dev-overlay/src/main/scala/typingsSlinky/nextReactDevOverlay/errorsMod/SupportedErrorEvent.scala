package typingsSlinky.nextReactDevOverlay.errorsMod

import typingsSlinky.nextReactDevOverlay.busMod.UnhandledError
import typingsSlinky.nextReactDevOverlay.busMod.UnhandledRejection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportedErrorEvent extends js.Object {
  
  var event: UnhandledError | UnhandledRejection = js.native
  
  var id: Double = js.native
}
object SupportedErrorEvent {
  
  @scala.inline
  def apply(event: UnhandledError | UnhandledRejection, id: Double): SupportedErrorEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedErrorEvent]
  }
  
  @scala.inline
  implicit class SupportedErrorEventOps[Self <: SupportedErrorEvent] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: UnhandledError | UnhandledRejection): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
