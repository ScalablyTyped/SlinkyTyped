package typingsSlinky.reactNotificationsComponent.mod

import typingsSlinky.reactNotificationsComponent.reactNotificationsComponentStrings.`ease-in-out`
import typingsSlinky.reactNotificationsComponent.reactNotificationsComponentStrings.`ease-in`
import typingsSlinky.reactNotificationsComponent.reactNotificationsComponentStrings.`ease-out`
import typingsSlinky.reactNotificationsComponent.reactNotificationsComponentStrings.`step-end`
import typingsSlinky.reactNotificationsComponent.reactNotificationsComponentStrings.`step-start`
import typingsSlinky.reactNotificationsComponent.reactNotificationsComponentStrings.ease
import typingsSlinky.reactNotificationsComponent.reactNotificationsComponentStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionOptions extends js.Object {
  
  var delay: js.UndefOr[Double] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var timingFunction: js.UndefOr[
    ease | linear | `ease-in` | `ease-out` | `ease-in-out` | `step-start` | `step-end`
  ] = js.native
}
object TransitionOptions {
  
  @scala.inline
  def apply(): TransitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionOptions]
  }
  
  @scala.inline
  implicit class TransitionOptionsOps[Self <: TransitionOptions] (val x: Self) extends AnyVal {
    
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setTimingFunction(value: ease | linear | `ease-in` | `ease-out` | `ease-in-out` | `step-start` | `step-end`): Self = this.set("timingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimingFunction: Self = this.set("timingFunction", js.undefined)
  }
}
