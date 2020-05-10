package typingsSlinky.antDesignReactNative.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.listMod.ListProps
import typingsSlinky.antDesignReactNative.listMod.default
import typingsSlinky.antDesignReactNative.listStyleMod.ListStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  @JSImport("@ant-design/react-native/lib/list", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def renderFooterReactElement(value: ReactElement): this.type = set("renderFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def renderFooterFunction0(value: () => ReactComponentClass[_]): this.type = set("renderFooter", js.Any.fromFunction0(value))
    @scala.inline
    def renderFooter(value: js.Function0[ReactComponentClass[_]] | String | ReactElement): this.type = set("renderFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def renderHeaderReactElement(value: ReactElement): this.type = set("renderHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def renderHeaderFunction0(value: () => ReactComponentClass[_]): this.type = set("renderHeader", js.Any.fromFunction0(value))
    @scala.inline
    def renderHeader(value: js.Function0[ReactComponentClass[_]] | String | ReactElement): this.type = set("renderHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def styles(value: Partial[ListStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: List.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

