package typingsSlinky.reactNativeElements.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeElements.mod.ThemeConsumerProps
import typingsSlinky.reactNativeElements.mod.ThemeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeConsumer {
  
  @scala.inline
  def apply[T](children: ThemeProps[T] => ReactElement): Builder[T] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ThemeConsumerProps[T]]))
  }
  
  @JSImport("react-native-elements", "ThemeConsumer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.ThemeConsumer[T]]
  
  def withProps[T](p: ThemeConsumerProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
