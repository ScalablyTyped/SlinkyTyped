package typingsSlinky.reactOnsenui.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.anon.HTMLAttributesidclassNameAnimationOptions
import typingsSlinky.reactOnsenui.mod.AnimationOptions
import typingsSlinky.reactOnsenui.mod.NavigatorAnimationTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Navigator {
  @JSImport("react-onsenui", "Navigator")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.Navigator] {
    @scala.inline
    def animation(value: NavigatorAnimationTypes): this.type = set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def animationOptions(value: AnimationOptions): this.type = set("animationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def initialRoute(value: js.Any): this.type = set("initialRoute", value.asInstanceOf[js.Any])
    @scala.inline
    def initialRouteStackVarargs(value: String*): this.type = set("initialRouteStack", js.Array(value :_*))
    @scala.inline
    def initialRouteStack(value: js.Array[String]): this.type = set("initialRouteStack", value.asInstanceOf[js.Any])
    @scala.inline
    def onPostPop(value: () => Unit): this.type = set("onPostPop", js.Any.fromFunction0(value))
    @scala.inline
    def onPostPush(value: () => Unit): this.type = set("onPostPush", js.Any.fromFunction0(value))
    @scala.inline
    def onPrePop(value: () => Unit): this.type = set("onPrePop", js.Any.fromFunction0(value))
    @scala.inline
    def onPrePush(value: () => Unit): this.type = set("onPrePush", js.Any.fromFunction0(value))
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLAttributesidclassNameAnimationOptions): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(renderPage: (js.Any, js.UndefOr[typingsSlinky.reactOnsenui.mod.Navigator]) => ReactElement): Builder = {
    val __props = js.Dynamic.literal(renderPage = js.Any.fromFunction2(renderPage))
    new Builder(js.Array(this.component, __props.asInstanceOf[HTMLAttributesidclassNameAnimationOptions]))
  }
}

