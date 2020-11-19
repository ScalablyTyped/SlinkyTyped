package typingsSlinky.reactOverlays.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactOverlays.modalManagerMod.^
import typingsSlinky.reactOverlays.modalMod.ModalProps
import typingsSlinky.reactOverlays.reactOverlaysStrings.static
import typingsSlinky.reactTransitionGroup.transitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modal {
  
  @JSImport("react-overlays", "Modal")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOverlays.mod.Modal] {
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdrop(value: Boolean | static): this.type = set("backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdropTransitionFunctionComponent(value: ReactComponentClass[TransitionProps[js.UndefOr[scala.Nothing]]]): this.type = set("backdropTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdropTransitionComponentClass(value: ReactComponentClass[TransitionProps[js.UndefOr[scala.Nothing]]]): this.type = set("backdropTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdropTransition(value: ReactComponentClass[TransitionProps[js.UndefOr[scala.Nothing]]]): this.type = set("backdropTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerReactElement(value: ReactElement): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def container(value: ReactElement | js.Function): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enforceFocus(value: Boolean): this.type = set("enforceFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def manager(value: ^): this.type = set("manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBackdropClick(value: js.Function): this.type = set("onBackdropClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEnter(value: /* node */ HTMLElement => _): this.type = set("onEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEntered(value: /* node */ HTMLElement => _): this.type = set("onEntered", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEntering(value: /* node */ HTMLElement => _): this.type = set("onEntering", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEscapeKeyDown(value: js.Function): this.type = set("onEscapeKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onExit(value: /* node */ HTMLElement => _): this.type = set("onExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExited(value: /* node */ HTMLElement => _): this.type = set("onExited", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExiting(value: /* node */ HTMLElement => _): this.type = set("onExiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def onHide(value: js.Function): this.type = set("onHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRendered(value: js.Function): this.type = set("onRendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onShow(value: js.Function): this.type = set("onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderBackdrop(value: /* props */ js.Any => ReactElement): this.type = set("renderBackdrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderDialog(value: /* props */ js.Any => ReactElement): this.type = set("renderDialog", js.Any.fromFunction1(value))
    
    @scala.inline
    def restoreFocus(value: Boolean): this.type = set("restoreFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionFunctionComponent(value: ReactComponentClass[TransitionProps[js.UndefOr[scala.Nothing]]]): this.type = set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionComponentClass(value: ReactComponentClass[TransitionProps[js.UndefOr[scala.Nothing]]]): this.type = set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transition(value: ReactComponentClass[TransitionProps[js.UndefOr[scala.Nothing]]]): this.type = set("transition", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Modal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
