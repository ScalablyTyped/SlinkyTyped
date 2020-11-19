package typingsSlinky.reactOverlays.rootCloseWrapperMod

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.reactOverlays.reactOverlaysStrings.click
import typingsSlinky.reactOverlays.reactOverlaysStrings.mousedown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootCloseWrapperProps extends js.Object {
  
  /**
    * Children to render.
    */
  var children: js.UndefOr[ReactElement] = js.native
  
  /**
    * Disable the the RootCloseWrapper, preventing it from triggering
    * `onRootClose`.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Choose which document mouse event to bind to
    */
  var event: js.UndefOr[click | mousedown] = js.native
  
  /**
    * Callback fired after click or mousedown. Also triggers when user hits `esc`.
    */
  var onRootClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Event, _], Unit]] = js.native
}
object RootCloseWrapperProps {
  
  @scala.inline
  def apply(): RootCloseWrapperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootCloseWrapperProps]
  }
  
  @scala.inline
  implicit class RootCloseWrapperPropsOps[Self <: RootCloseWrapperProps] (val x: Self) extends AnyVal {
    
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
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEvent(value: click | mousedown): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setOnRootClose(value: /* e */ SyntheticEvent[Event, _] => Unit): Self = this.set("onRootClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRootClose: Self = this.set("onRootClose", js.undefined)
  }
}
