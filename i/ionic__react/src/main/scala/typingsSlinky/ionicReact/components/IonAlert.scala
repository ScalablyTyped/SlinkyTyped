package typingsSlinky.ionicReact.components

import org.scalajs.dom.raw.CustomEvent
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.ionicCore.alertInterfaceMod.AlertButton
import typingsSlinky.ionicCore.alertInterfaceMod.AlertInput
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonAlertElement
import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.ionicCore.sanitizationMod.IonicSafeString
import typingsSlinky.ionicReact.anon.AlertOptionsReactControll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IonAlert {
  
  @JSImport("@ionic/react", "IonAlert")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLIonAlertElement] {
    
    @scala.inline
    def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdropDismiss(value: Boolean): this.type = set("backdropDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonsVarargs(value: (AlertButton | String)*): this.type = set("buttons", js.Array(value :_*))
    
    @scala.inline
    def buttons(value: js.Array[AlertButton | String]): this.type = set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cssClassVarargs(value: String*): this.type = set("cssClass", js.Array(value :_*))
    
    @scala.inline
    def cssClass(value: String | js.Array[String]): this.type = set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): this.type = set("enterAnimation", js.Any.fromFunction2(value))
    
    @scala.inline
    def forwardedRef(value: ReactRef[HTMLIonAlertElement]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def header(value: String): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputsVarargs(value: AlertInput*): this.type = set("inputs", js.Array(value :_*))
    
    @scala.inline
    def inputs(value: js.Array[AlertInput]): this.type = set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboardClose(value: Boolean): this.type = set("keyboardClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leaveAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): this.type = set("leaveAnimation", js.Any.fromFunction2(value))
    
    @scala.inline
    def message(value: String | IonicSafeString): this.type = set("message", value.asInstanceOf[js.Any])
    
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
    def subHeader(value: String): this.type = set("subHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translucent(value: Boolean): this.type = set("translucent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AlertOptionsReactControll): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(isOpen: Boolean): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AlertOptionsReactControll]))
  }
}
