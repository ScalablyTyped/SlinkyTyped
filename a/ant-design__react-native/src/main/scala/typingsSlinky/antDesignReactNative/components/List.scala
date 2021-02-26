package typingsSlinky.antDesignReactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.antDesignReactNativeBooleans.`false`
import typingsSlinky.antDesignReactNative.listMod.ListProps
import typingsSlinky.antDesignReactNative.listStyleMod.ListStyle
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  @JSImport("@ant-design/react-native", "List")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.List] {
    
    @scala.inline
    def children(value: `false` | ReactElement | js.Array[ReactElement]): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    
    @scala.inline
    def renderFooter(value: js.Function0[ReactType[_]] | String | ReactElement): this.type = set("renderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderFooterFunction0(value: () => ReactType[_]): this.type = set("renderFooter", js.Any.fromFunction0(value))
    
    @scala.inline
    def renderFooterReactElement(value: ReactElement): this.type = set("renderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderHeader(value: js.Function0[ReactType[_]] | String | ReactElement): this.type = set("renderHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderHeaderFunction0(value: () => ReactType[_]): this.type = set("renderHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def renderHeaderReactElement(value: ReactElement): this.type = set("renderHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: Partial[ListStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: List.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
