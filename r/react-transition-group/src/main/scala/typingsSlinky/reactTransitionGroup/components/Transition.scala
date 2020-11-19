package typingsSlinky.reactTransitionGroup.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactTransitionGroup.anon.Appear
import typingsSlinky.reactTransitionGroup.transitionMod.EndHandler
import typingsSlinky.reactTransitionGroup.transitionMod.EnterHandler
import typingsSlinky.reactTransitionGroup.transitionMod.ExitHandler
import typingsSlinky.reactTransitionGroup.transitionMod.TransitionChildren
import typingsSlinky.reactTransitionGroup.transitionMod.TransitionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transition {
  
  object EndListenerProps {
    
    @JSImport("react-transition-group", "Transition")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder[RefElement /* <: js.UndefOr[HTMLElement] */] (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.reactTransitionGroup.mod.Transition[RefElement]] {
      
      @scala.inline
      def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def childrenFunction1(value: /* status */ TransitionStatus => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
      
      @scala.inline
      def children(value: TransitionChildren): this.type = set("children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def in(value: Boolean): this.type = set("in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mountOnEnter(value: Boolean): this.type = set("mountOnEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nodeRefRefObject(value: ReactRef[RefElement]): this.type = set("nodeRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nodeRefFunction1(value: /* instance */ RefElement | Null => Unit): this.type = set("nodeRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def nodeRef(value: Ref[RefElement]): this.type = set("nodeRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nodeRefNull: this.type = set("nodeRef", null)
      
      @scala.inline
      def onEnter(value: EnterHandler[RefElement]): this.type = set("onEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEntered(value: EnterHandler[RefElement]): this.type = set("onEntered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEntering(value: EnterHandler[RefElement]): this.type = set("onEntering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onExit(value: ExitHandler[RefElement]): this.type = set("onExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onExited(value: ExitHandler[RefElement]): this.type = set("onExited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onExiting(value: ExitHandler[RefElement]): this.type = set("onExiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def timeout(value: Double | Appear): this.type = set("timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def unmountOnExit(value: Boolean): this.type = set("unmountOnExit", value.asInstanceOf[js.Any])
    }
    
    def withProps[RefElement /* <: js.UndefOr[HTMLElement] */](p: typingsSlinky.reactTransitionGroup.transitionMod.EndListenerProps[RefElement]): Builder[RefElement] = new Builder[RefElement](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply[RefElement /* <: js.UndefOr[HTMLElement] */](addEndListener: EndHandler[RefElement]): Builder[RefElement] = {
      val __props = js.Dynamic.literal(addEndListener = addEndListener.asInstanceOf[js.Any])
      new Builder[RefElement](js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactTransitionGroup.transitionMod.EndListenerProps[RefElement]]))
    }
  }
  
  object TimeoutProps {
    
    @JSImport("react-transition-group", "Transition")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder[RefElement /* <: js.UndefOr[HTMLElement] */] (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.reactTransitionGroup.mod.Transition[RefElement]] {
      
      @scala.inline
      def addEndListener(value: EndHandler[RefElement]): this.type = set("addEndListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def childrenFunction1(value: /* status */ TransitionStatus => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
      
      @scala.inline
      def children(value: TransitionChildren): this.type = set("children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def in(value: Boolean): this.type = set("in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mountOnEnter(value: Boolean): this.type = set("mountOnEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nodeRefRefObject(value: ReactRef[RefElement]): this.type = set("nodeRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nodeRefFunction1(value: /* instance */ RefElement | Null => Unit): this.type = set("nodeRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def nodeRef(value: Ref[RefElement]): this.type = set("nodeRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nodeRefNull: this.type = set("nodeRef", null)
      
      @scala.inline
      def onEnter(value: EnterHandler[RefElement]): this.type = set("onEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEntered(value: EnterHandler[RefElement]): this.type = set("onEntered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEntering(value: EnterHandler[RefElement]): this.type = set("onEntering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onExit(value: ExitHandler[RefElement]): this.type = set("onExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onExited(value: ExitHandler[RefElement]): this.type = set("onExited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onExiting(value: ExitHandler[RefElement]): this.type = set("onExiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def unmountOnExit(value: Boolean): this.type = set("unmountOnExit", value.asInstanceOf[js.Any])
    }
    
    def withProps[RefElement /* <: js.UndefOr[HTMLElement] */](p: typingsSlinky.reactTransitionGroup.transitionMod.TimeoutProps[RefElement]): Builder[RefElement] = new Builder[RefElement](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply[RefElement /* <: js.UndefOr[HTMLElement] */](timeout: Double | Appear): Builder[RefElement] = {
      val __props = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      new Builder[RefElement](js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactTransitionGroup.transitionMod.TimeoutProps[RefElement]]))
    }
  }
}
