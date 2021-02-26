package typingsSlinky.reactNativeSafeAreaContext.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SafeAreaConsumer {
  
  @scala.inline
  def apply(children: EdgeInsets | Null => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[EdgeInsets | Null]]))
  }
  
  @JSImport("react-native-safe-area-context", "SafeAreaConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ConsumerProps[EdgeInsets | Null]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
