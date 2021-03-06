package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.Action
import typingsSlinky.antDesignReactNative.operationContainerMod.OperationContainerProps
import typingsSlinky.antDesignReactNative.operationContainerMod.default
import typingsSlinky.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OperationContainer {
  
  @scala.inline
  def apply(actions: js.Array[Action[TextStyle]]): Builder = {
    val __props = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OperationContainerProps]))
  }
  
  @JSImport("@ant-design/react-native/lib/modal/OperationContainer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def onAnimationEnd(value: /* visible */ Boolean => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBackHandler(value: () => Boolean): this.type = set("onBackHandler", js.Any.fromFunction0(value))
  }
  
  def withProps(p: OperationContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
