package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.tabBarItemNativeMod.TabBarItemProps
import typingsSlinky.antdMobileRn.tabBarItemNativeMod.default
import typingsSlinky.reactNative.mod.ImageRequireSource
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.StyleProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabBarItemDotnative {
  @JSImport("antd-mobile-rn/lib/tab-bar/TabBarItem.native", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def badge(value: String | Double): this.type = set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: ImageURISource | js.Array[ImageURISource] | ImageRequireSource): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconStyle(value: StyleProp[ImageStyle]): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def iconStyleNull: this.type = set("iconStyle", null)
    @scala.inline
    def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def renderAsOriginal(value: Boolean): this.type = set("renderAsOriginal", value.asInstanceOf[js.Any])
    @scala.inline
    def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedIcon(value: ImageURISource | js.Array[ImageURISource] | ImageRequireSource): this.type = set("selectedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def styles(value: js.Any): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def unselectedTintColor(value: String): this.type = set("unselectedTintColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabBarItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(title: String): Builder = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabBarItemProps]))
  }
}

