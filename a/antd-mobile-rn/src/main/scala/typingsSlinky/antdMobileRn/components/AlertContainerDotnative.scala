package typingsSlinky.antdMobileRn.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.alertContainerNativeMod.AlertContainerProps
import typingsSlinky.antdMobileRn.alertContainerNativeMod.default
import typingsSlinky.antdMobileRn.modalPropsTypeMod.Action
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AlertContainerDotnative {
  
  @JSImport("antd-mobile-rn/lib/modal/AlertContainer.native", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def content(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAnimationEnd(value: /* visible */ Boolean => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AlertContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(actions: js.Array[Action[TextStyle]]): Builder = {
    val __props = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AlertContainerProps]))
  }
}
