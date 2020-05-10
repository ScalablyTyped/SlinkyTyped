package typingsSlinky.reactOnsenui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.HTMLAttributesidclassNameIgnoreEdgeWidth
import typingsSlinky.reactOnsenui.mod.AnimationOptions
import typingsSlinky.reactOnsenui.mod.TabbarRenderTab
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.auto
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.bottom
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.none
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.slide
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabbar {
  @JSImport("react-onsenui", "Tabbar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.Tabbar] {
    @scala.inline
    def animation(value: none | slide): this.type = set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def animationOptions(value: AnimationOptions): this.type = set("animationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def ignoreEdgeWidth(value: Double): this.type = set("ignoreEdgeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def onPostChange(value: () => Unit): this.type = set("onPostChange", js.Any.fromFunction0(value))
    @scala.inline
    def onPreChange(value: () => Unit): this.type = set("onPreChange", js.Any.fromFunction0(value))
    @scala.inline
    def onReactive(value: () => Unit): this.type = set("onReactive", js.Any.fromFunction0(value))
    @scala.inline
    def onSwipe(value: (/* index */ Double, /* animationOptions */ AnimationOptions) => Unit): this.type = set("onSwipe", js.Any.fromFunction2(value))
    @scala.inline
    def position(value: bottom | top | auto): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def swipeable(value: Boolean): this.type = set("swipeable", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBorder(value: Boolean): this.type = set("tabBorder", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLAttributesidclassNameIgnoreEdgeWidth): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    index: Double,
    renderTabs: (Double, typingsSlinky.reactOnsenui.mod.Tabbar) => js.Array[TabbarRenderTab]
  ): Builder = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any], renderTabs = js.Any.fromFunction2(renderTabs))
    new Builder(js.Array(this.component, __props.asInstanceOf[HTMLAttributesidclassNameIgnoreEdgeWidth]))
  }
}

