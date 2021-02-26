package typingsSlinky.reactNativeSafeAreaContext.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.Metrics
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.NativeSafeAreaProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompatNativeSafeAreaProvider {
  
  @scala.inline
  def apply(onInsetsChange: SyntheticEvent[NodeHandle, Metrics] => Unit): Builder = {
    val __props = js.Dynamic.literal(onInsetsChange = js.Any.fromFunction1(onInsetsChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[NativeSafeAreaProviderProps]))
  }
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/CompatNativeSafeAreaProvider", "CompatNativeSafeAreaProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  def withProps(p: NativeSafeAreaProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
