package typingsSlinky.reactMdStates.useRippleHandlersMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactMdStates.typesMod.MergableRippleHandlers
import typingsSlinky.reactMdStates.typesMod.RippleEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[E /* <: HTMLElement */] extends js.Object {
  
  def cancel(ease: Boolean): Unit = js.native
  
  def create(event: RippleEvent[E]): Unit = js.native
  
  var disableProgrammaticRipple: js.UndefOr[Boolean] = js.native
  
  var disableRipple: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var handlers: js.UndefOr[MergableRippleHandlers[E]] = js.native
  
  def release(event: RippleEvent[E]): Unit = js.native
}
object Options {
  
  @scala.inline
  def apply[E /* <: HTMLElement */](cancel: Boolean => Unit, create: RippleEvent[E] => Unit, release: RippleEvent[E] => Unit): Options[E] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), release = js.Any.fromFunction1(release))
    __obj.asInstanceOf[Options[E]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], E /* <: HTMLElement */] (val x: Self with Options[E]) extends AnyVal {
    
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
    def setCancel(value: Boolean => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreate(value: RippleEvent[E] => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRelease(value: RippleEvent[E] => Unit): Self = this.set("release", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisableProgrammaticRipple(value: Boolean): Self = this.set("disableProgrammaticRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableProgrammaticRipple: Self = this.set("disableProgrammaticRipple", js.undefined)
    
    @scala.inline
    def setDisableRipple(value: Boolean): Self = this.set("disableRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableRipple: Self = this.set("disableRipple", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setHandlers(value: MergableRippleHandlers[E]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
  }
}
