package typingsSlinky.atom.anon

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.atom.mod.CommandEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Description[TargetType /* <: EventTarget */] extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  def didDispatch(event: CommandEvent[TargetType]): Unit | js.Promise[Unit] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var hiddenInCommandPalette: js.UndefOr[Boolean] = js.native
}
object Description {
  
  @scala.inline
  def apply[TargetType /* <: EventTarget */](didDispatch: CommandEvent[TargetType] => Unit | js.Promise[Unit]): Description[TargetType] = {
    val __obj = js.Dynamic.literal(didDispatch = js.Any.fromFunction1(didDispatch))
    __obj.asInstanceOf[Description[TargetType]]
  }
  
  @scala.inline
  implicit class DescriptionOps[Self <: Description[_], TargetType /* <: EventTarget */] (val x: Self with Description[TargetType]) extends AnyVal {
    
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
    def setDidDispatch(value: CommandEvent[TargetType] => Unit | js.Promise[Unit]): Self = this.set("didDispatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setHiddenInCommandPalette(value: Boolean): Self = this.set("hiddenInCommandPalette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenInCommandPalette: Self = this.set("hiddenInCommandPalette", js.undefined)
  }
}
