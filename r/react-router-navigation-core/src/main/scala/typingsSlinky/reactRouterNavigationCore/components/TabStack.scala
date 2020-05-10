package typingsSlinky.reactRouterNavigationCore.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactRouterNavigationCore.mod.TabStackProps
import typingsSlinky.reactRouterNavigationCore.mod.TabsRendererProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabStack {
  @JSImport("react-router-navigation-core", "TabStack")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactRouterNavigationCore.mod.TabStack] {
    @scala.inline
    def forceSync(value: Boolean): this.type = set("forceSync", value.asInstanceOf[js.Any])
    @scala.inline
    def `lazy`(value: Boolean): this.type = set("lazy", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  def withProps(p: TabStackProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(render: TabsRendererProps => TagMod[Any]): Builder = {
    val __props = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    new Builder(js.Array(this.component, __props.asInstanceOf[TabStackProps]))
  }
}

