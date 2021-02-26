package typingsSlinky.reactOverlays.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactOverlays.anon.ForceUpdate
import typingsSlinky.reactOverlays.anon.OmitUsePopperOptionsplace
import typingsSlinky.reactOverlays.anon.Popper
import typingsSlinky.reactOverlays.anon.inbooleanundefinedappearb
import typingsSlinky.reactOverlays.esmOverlayMod.OverlayProps
import typingsSlinky.reactOverlays.esmUsePopperMod.Offset
import typingsSlinky.reactOverlays.esmUsePopperMod.OffsetValue
import typingsSlinky.reactOverlays.esmUsePopperMod.Placement
import typingsSlinky.reactOverlays.esmUseRootCloseMod.MouseEvents
import typingsSlinky.reactOverlays.esmUseWaitForDOMRefMod.DOMContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Overlay {
  
  @scala.inline
  def apply(children: ForceUpdate => ReactElement): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[OverlayProps with RefAttributes[HTMLElement]]))
  }
  
  @JSImport("react-overlays/esm", "Overlay")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLElement] {
    
    @scala.inline
    def container(value: DOMContainer[HTMLElement]): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerFunction0(value: () => HTMLElement | ReactRef[HTMLElement] | Null): this.type = set("container", js.Any.fromFunction0(value))
    
    @scala.inline
    def containerHTMLElement(value: HTMLElement): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerNull: this.type = set("container", null)
    
    @scala.inline
    def containerPadding(value: Double): this.type = set("containerPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerRefObject(value: ReactRef[HTMLElement]): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offset(value: Offset): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetFunction1(value: /* details */ Popper => OffsetValue): this.type = set("offset", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEnter(value: /* node */ HTMLElement => _): this.type = set("onEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEntered(value: /* node */ HTMLElement => _): this.type = set("onEntered", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEntering(value: /* node */ HTMLElement => _): this.type = set("onEntering", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExit(value: /* node */ HTMLElement => _): this.type = set("onExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExited(value: /* node */ HTMLElement => _): this.type = set("onExited", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExiting(value: /* node */ HTMLElement => _): this.type = set("onExiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def onHide(value: /* e */ Event => Unit): this.type = set("onHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popperConfig(value: OmitUsePopperOptionsplace): this.type = set("popperConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClose(value: Boolean): this.type = set("rootClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootCloseDisabled(value: Boolean): this.type = set("rootCloseDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootCloseEvent(value: MouseEvents): this.type = set("rootCloseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def target(value: DOMContainer[HTMLElement]): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetFunction0(value: () => HTMLElement | ReactRef[HTMLElement] | Null): this.type = set("target", js.Any.fromFunction0(value))
    
    @scala.inline
    def targetHTMLElement(value: HTMLElement): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetNull: this.type = set("target", null)
    
    @scala.inline
    def targetRefObject(value: ReactRef[HTMLElement]): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transition(value: ReactComponentClass[inbooleanundefinedappearb]): this.type = set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionComponentClass(value: ReactComponentClass[inbooleanundefinedappearb]): this.type = set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionFunctionComponent(value: ReactComponentClass[inbooleanundefinedappearb]): this.type = set("transition", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OverlayProps with RefAttributes[HTMLElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
