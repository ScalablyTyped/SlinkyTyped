package typingsSlinky.reactOverlays.dropdownMenuMod

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import typingsSlinky.reactOverlays.anon.Arialabelledby
import typingsSlinky.reactOverlays.anon.Ref
import typingsSlinky.reactOverlays.overlayMod.OverlayRenderProps
import typingsSlinky.reactOverlays.overlayMod.Placements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownMenuRenderProps extends OverlayRenderProps {
  
  var alignEnd: Boolean = js.native
  
  def close(event: SyntheticEvent[Event, _]): Unit = js.native
}
object DropdownMenuRenderProps {
  
  @scala.inline
  def apply(
    alignEnd: Boolean,
    arrowProps: Ref,
    close: SyntheticEvent[Event, _] => Unit,
    placement: Placements,
    props: Arialabelledby,
    scheduleUpdate: () => Unit,
    show: Boolean
  ): DropdownMenuRenderProps = {
    val __obj = js.Dynamic.literal(alignEnd = alignEnd.asInstanceOf[js.Any], arrowProps = arrowProps.asInstanceOf[js.Any], close = js.Any.fromFunction1(close), placement = placement.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownMenuRenderProps]
  }
  
  @scala.inline
  implicit class DropdownMenuRenderPropsOps[Self <: DropdownMenuRenderProps] (val x: Self) extends AnyVal {
    
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
    def setAlignEnd(value: Boolean): Self = this.set("alignEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: SyntheticEvent[Event, _] => Unit): Self = this.set("close", js.Any.fromFunction1(value))
  }
}
