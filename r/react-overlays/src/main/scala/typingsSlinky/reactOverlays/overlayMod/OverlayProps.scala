package typingsSlinky.reactOverlays.overlayMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.reactOverlays.anon.ArrowProps
import typingsSlinky.reactOverlays.anon.inbooleanundefinedappearb
import typingsSlinky.reactOverlays.reactOverlaysStrings.placement
import typingsSlinky.reactOverlays.typesMod.TransitionCallbacks
import typingsSlinky.reactOverlays.usePopperMod.Offset
import typingsSlinky.reactOverlays.usePopperMod.OffsetValue
import typingsSlinky.reactOverlays.usePopperMod.Placement
import typingsSlinky.reactOverlays.usePopperMod.UsePopperOptions
import typingsSlinky.reactOverlays.useRootCloseMod.MouseEvents
import typingsSlinky.reactOverlays.useWaitForDOMRefMod.DOMContainer
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayProps extends TransitionCallbacks {
  
  def children(value: ArrowProps): ReactElement = js.native
  
  var container: js.UndefOr[DOMContainer[HTMLElement]] = js.native
  
  var containerPadding: js.UndefOr[Double] = js.native
  
  var flip: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Offset] = js.native
  
  var onHide: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  
  var placement: js.UndefOr[Placement] = js.native
  
  var popperConfig: js.UndefOr[Omit[UsePopperOptions, placement]] = js.native
  
  var rootClose: js.UndefOr[Boolean] = js.native
  
  var rootCloseDisabled: js.UndefOr[Boolean] = js.native
  
  var rootCloseEvent: js.UndefOr[MouseEvents] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var target: DOMContainer[HTMLElement] = js.native
  
  var transition: js.UndefOr[ReactComponentClass[inbooleanundefinedappearb]] = js.native
}
object OverlayProps {
  
  @scala.inline
  def apply(children: ArrowProps => ReactElement): OverlayProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[OverlayProps]
  }
  
  @scala.inline
  implicit class OverlayPropsOps[Self <: OverlayProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ArrowProps => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainerRefObject(value: ReactRef[HTMLElement]): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerHTMLElement(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerFunction0(value: () => HTMLElement | ReactRef[HTMLElement] | Null): Self = this.set("container", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContainer(value: DOMContainer[HTMLElement]): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    
    @scala.inline
    def setContainerPadding(value: Double): Self = this.set("containerPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerPadding: Self = this.set("containerPadding", js.undefined)
    
    @scala.inline
    def setFlip(value: Boolean): Self = this.set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    
    @scala.inline
    def setOffsetFunction1(value: /* details */ typingsSlinky.reactOverlays.anon.Placement => OffsetValue): Self = this.set("offset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffset(value: Offset): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnHide(value: /* e */ Event => Unit): Self = this.set("onHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setPopperConfig(value: Omit[UsePopperOptions, placement]): Self = this.set("popperConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopperConfig: Self = this.set("popperConfig", js.undefined)
    
    @scala.inline
    def setRootClose(value: Boolean): Self = this.set("rootClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootClose: Self = this.set("rootClose", js.undefined)
    
    @scala.inline
    def setRootCloseDisabled(value: Boolean): Self = this.set("rootCloseDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootCloseDisabled: Self = this.set("rootCloseDisabled", js.undefined)
    
    @scala.inline
    def setRootCloseEvent(value: MouseEvents): Self = this.set("rootCloseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootCloseEvent: Self = this.set("rootCloseEvent", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setTargetRefObject(value: ReactRef[HTMLElement]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetHTMLElement(value: HTMLElement): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFunction0(value: () => HTMLElement | ReactRef[HTMLElement] | Null): Self = this.set("target", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: DOMContainer[HTMLElement]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
    
    @scala.inline
    def setTransitionFunctionComponent(value: ReactComponentClass[inbooleanundefinedappearb]): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionComponentClass(value: ReactComponentClass[inbooleanundefinedappearb]): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransition(value: ReactComponentClass[inbooleanundefinedappearb]): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
}
