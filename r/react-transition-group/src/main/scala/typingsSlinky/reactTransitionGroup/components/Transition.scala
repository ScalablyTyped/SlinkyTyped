package typingsSlinky.reactTransitionGroup.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTransitionGroup.AnonAppear
import typingsSlinky.reactTransitionGroup.transitionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Transition {
  object EndListenerProps {
    @JSImport("react-transition-group/Transition", JSImport.Default)
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, default] {
      @scala.inline
      def in(value: Boolean): this.type = set("in", value.asInstanceOf[js.Any])
      @scala.inline
      def mountOnEnter(value: Boolean): this.type = set("mountOnEnter", value.asInstanceOf[js.Any])
      @scala.inline
      def onEnter(value: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit): this.type = set("onEnter", js.Any.fromFunction2(value))
      @scala.inline
      def onEntered(value: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit): this.type = set("onEntered", js.Any.fromFunction2(value))
      @scala.inline
      def onEntering(value: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit): this.type = set("onEntering", js.Any.fromFunction2(value))
      @scala.inline
      def onExit(value: /* node */ HTMLElement => Unit): this.type = set("onExit", js.Any.fromFunction1(value))
      @scala.inline
      def onExited(value: /* node */ HTMLElement => Unit): this.type = set("onExited", js.Any.fromFunction1(value))
      @scala.inline
      def onExiting(value: /* node */ HTMLElement => Unit): this.type = set("onExiting", js.Any.fromFunction1(value))
      @scala.inline
      def timeout(value: Double | AnonAppear): this.type = set("timeout", value.asInstanceOf[js.Any])
      @scala.inline
      def unmountOnExit(value: Boolean): this.type = set("unmountOnExit", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.reactTransitionGroup.transitionMod.EndListenerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(addEndListener: (/* node */ HTMLElement, /* done */ js.Function0[Unit]) => Unit): Builder = {
        val __props = js.Dynamic.literal(addEndListener = js.Any.fromFunction2(addEndListener))
        new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactTransitionGroup.transitionMod.EndListenerProps]))
    }
  }
  
  object TimeoutProps {
    @JSImport("react-transition-group/Transition", JSImport.Default)
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, default] {
      @scala.inline
      def addEndListener(value: (/* node */ HTMLElement, /* done */ js.Function0[Unit]) => Unit): this.type = set("addEndListener", js.Any.fromFunction2(value))
      @scala.inline
      def in(value: Boolean): this.type = set("in", value.asInstanceOf[js.Any])
      @scala.inline
      def mountOnEnter(value: Boolean): this.type = set("mountOnEnter", value.asInstanceOf[js.Any])
      @scala.inline
      def onEnter(value: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit): this.type = set("onEnter", js.Any.fromFunction2(value))
      @scala.inline
      def onEntered(value: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit): this.type = set("onEntered", js.Any.fromFunction2(value))
      @scala.inline
      def onEntering(value: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit): this.type = set("onEntering", js.Any.fromFunction2(value))
      @scala.inline
      def onExit(value: /* node */ HTMLElement => Unit): this.type = set("onExit", js.Any.fromFunction1(value))
      @scala.inline
      def onExited(value: /* node */ HTMLElement => Unit): this.type = set("onExited", js.Any.fromFunction1(value))
      @scala.inline
      def onExiting(value: /* node */ HTMLElement => Unit): this.type = set("onExiting", js.Any.fromFunction1(value))
      @scala.inline
      def unmountOnExit(value: Boolean): this.type = set("unmountOnExit", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.reactTransitionGroup.transitionMod.TimeoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(timeout: Double | AnonAppear): Builder = {
        val __props = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
        new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactTransitionGroup.transitionMod.TimeoutProps]))
    }
  }
  
}

