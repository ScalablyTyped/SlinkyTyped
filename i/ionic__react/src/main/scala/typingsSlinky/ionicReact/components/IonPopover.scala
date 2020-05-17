package typingsSlinky.ionicReact.components

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonPopoverElement
import typingsSlinky.ionicCore.mod.FrameworkDelegate
import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsSlinky.ionicReact.anon.childrenReactNodeforwardeAnimated
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IonPopover {
  @JSImport("@ionic/react", "IonPopover")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Ref[js.Any]] {
    @scala.inline
    def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def backdropDismiss(value: Boolean): this.type = set("backdropDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def cssClass(value: String | js.Array[String]): this.type = set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def delegate(value: FrameworkDelegate): this.type = set("delegate", value.asInstanceOf[js.Any])
    @scala.inline
    def enterAnimation(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): this.type = set("enterAnimation", js.Any.fromFunction3(value))
    @scala.inline
    def event(value: Event): this.type = set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def forwardedRef(value: ReactRef[HTMLIonPopoverElement]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def keyboardClose(value: Boolean): this.type = set("keyboardClose", value.asInstanceOf[js.Any])
    @scala.inline
    def leaveAnimation(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): this.type = set("leaveAnimation", js.Any.fromFunction3(value))
    @scala.inline
    def mode(value: Mode): this.type = set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def onDidDismiss(value: /* event */ CustomEvent => Unit): this.type = set("onDidDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def onDidPresent(value: /* event */ CustomEvent => Unit): this.type = set("onDidPresent", js.Any.fromFunction1(value))
    @scala.inline
    def onWillDismiss(value: /* event */ CustomEvent => Unit): this.type = set("onWillDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def onWillPresent(value: /* event */ CustomEvent => Unit): this.type = set("onWillPresent", js.Any.fromFunction1(value))
    @scala.inline
    def showBackdrop(value: Boolean): this.type = set("showBackdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def translucent(value: Boolean): this.type = set("translucent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: childrenReactNodeforwardeAnimated): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(isOpen: Boolean): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[childrenReactNodeforwardeAnimated]))
  }
}

