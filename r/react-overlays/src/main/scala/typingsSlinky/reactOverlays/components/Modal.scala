package typingsSlinky.reactOverlays.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactOverlays.anon.PreventScroll
import typingsSlinky.reactOverlays.anon.inbooleanappearbooleanund
import typingsSlinky.reactOverlays.modalManagerMod.default
import typingsSlinky.reactOverlays.modalMod.ModalHandle
import typingsSlinky.reactOverlays.modalMod.ModalProps
import typingsSlinky.reactOverlays.modalMod.ModalTransitionComponent
import typingsSlinky.reactOverlays.modalMod.RenderModalBackdropProps
import typingsSlinky.reactOverlays.modalMod.RenderModalDialogProps
import typingsSlinky.reactOverlays.reactOverlaysBooleans.`false`
import typingsSlinky.reactOverlays.reactOverlaysBooleans.`true`
import typingsSlinky.reactOverlays.reactOverlaysStrings.static
import typingsSlinky.reactOverlays.useWaitForDOMRefMod.DOMContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modal {
  
  @JSImport("react-overlays/esm", "Modal")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ModalHandle] {
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdrop(value: `true` | `false` | static): this.type = set("backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdropTransitionFunctionComponent(value: ReactComponentClass[inbooleanappearbooleanund]): this.type = set("backdropTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdropTransitionComponentClass(value: ReactComponentClass[inbooleanappearbooleanund]): this.type = set("backdropTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdropTransition(value: ModalTransitionComponent): this.type = set("backdropTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerRefObject(value: ReactRef[HTMLElement]): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerHTMLElement(value: HTMLElement): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerFunction0(value: () => HTMLElement | ReactRef[HTMLElement] | Null): this.type = set("container", js.Any.fromFunction0(value))
    
    @scala.inline
    def container(value: DOMContainer[HTMLElement]): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerNull: this.type = set("container", null)
    
    @scala.inline
    def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enforceFocus(value: Boolean): this.type = set("enforceFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def manager(value: default): this.type = set("manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBackdropClick(value: /* e */ SyntheticEvent[Event, Element] => Unit): this.type = set("onBackdropClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEnter(value: /* node */ HTMLElement => _): this.type = set("onEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEntered(value: /* node */ HTMLElement => _): this.type = set("onEntered", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEntering(value: /* node */ HTMLElement => _): this.type = set("onEntering", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEscapeKeyDown(value: /* e */ KeyboardEvent => Unit): this.type = set("onEscapeKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExit(value: /* node */ HTMLElement => _): this.type = set("onExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExited(value: /* node */ HTMLElement => _): this.type = set("onExited", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExiting(value: /* node */ HTMLElement => _): this.type = set("onExiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def onHide(value: () => Unit): this.type = set("onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def onShow(value: () => Unit): this.type = set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def renderBackdrop(value: /* props */ RenderModalBackdropProps => ReactElement): this.type = set("renderBackdrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderDialog(value: /* props */ RenderModalDialogProps => ReactElement): this.type = set("renderDialog", js.Any.fromFunction1(value))
    
    @scala.inline
    def restoreFocus(value: Boolean): this.type = set("restoreFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def restoreFocusOptions(value: PreventScroll): this.type = set("restoreFocusOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionFunctionComponent(value: ReactComponentClass[inbooleanappearbooleanund]): this.type = set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionComponentClass(value: ReactComponentClass[inbooleanappearbooleanund]): this.type = set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transition(value: ModalTransitionComponent): this.type = set("transition", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ModalProps with RefAttributes[ModalHandle]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Modal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
