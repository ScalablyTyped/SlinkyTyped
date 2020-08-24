package typingsSlinky.reactNativeSafeAreaContext.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Consumer {
  @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaContext", "SafeAreaContext.Consumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ConsumerProps[EdgeInsets | Null]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: EdgeInsets | Null => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[EdgeInsets | Null]]))
  }
}

