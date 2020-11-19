package typingsSlinky.ionicReact.components

import org.scalajs.dom.raw.CustomEvent
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonActionSheetElement
import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.ionicReact.anon.ActionSheetOptionsReactOv
import typingsSlinky.ionicReact.ionActionSheetMod.ActionSheetButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IonActionSheet {
  
  @JSImport("@ionic/react", "IonActionSheet")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLIonActionSheetElement] {
    
    @scala.inline
    def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdropDismiss(value: Boolean): this.type = set("backdropDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonsVarargs(value: (ActionSheetButton | String)*): this.type = set("buttons", js.Array(value :_*))
    
    @scala.inline
    def buttons(value: js.Array[ActionSheetButton | String]): this.type = set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cssClassVarargs(value: String*): this.type = set("cssClass", js.Array(value :_*))
    
    @scala.inline
    def cssClass(value: String | js.Array[String]): this.type = set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): this.type = set("enterAnimation", js.Any.fromFunction2(value))
    
    @scala.inline
    def forwardedRef(value: ReactRef[HTMLIonActionSheetElement]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def header(value: String): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboardClose(value: Boolean): this.type = set("keyboardClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leaveAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): this.type = set("leaveAnimation", js.Any.fromFunction2(value))
    
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
  
  def withProps(p: ActionSheetOptionsReactOv): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(isOpen: Boolean): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ActionSheetOptionsReactOv]))
  }
}
