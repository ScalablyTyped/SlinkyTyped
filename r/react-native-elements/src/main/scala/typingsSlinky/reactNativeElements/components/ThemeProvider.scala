package typingsSlinky.reactNativeElements.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeElements.mod.Theme
import typingsSlinky.reactNativeElements.mod.ThemeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  @scala.inline
  def apply[T](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ThemeProviderProps[T]]))
  }
  
  @JSImport("react-native-elements", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.ThemeProvider[T]] {
    
    @scala.inline
    def theme(value: Theme[T]): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useDark(value: Boolean): this.type = set("useDark", value.asInstanceOf[js.Any])
  }
  
  implicit def make[T](companion: ThemeProvider.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T](p: ThemeProviderProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
