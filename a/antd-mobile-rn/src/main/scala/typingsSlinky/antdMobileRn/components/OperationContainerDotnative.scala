package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.modalPropsTypeMod.Action
import typingsSlinky.antdMobileRn.operationContainerNativeMod.OperationContainerProps
import typingsSlinky.antdMobileRn.operationContainerNativeMod.default
import typingsSlinky.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OperationContainerDotnative {
  
  @scala.inline
  def apply(actions: js.Array[Action[TextStyle]]): Builder = {
    val __props = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OperationContainerProps]))
  }
  
  @JSImport("antd-mobile-rn/lib/modal/OperationContainer.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def onAnimationEnd(value: /* visible */ Boolean => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
  }
  
  def withProps(p: OperationContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
