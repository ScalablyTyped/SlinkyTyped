package typingsSlinky.reactOnsenui.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.anon.HTMLAttributesidclassNameOnPostPop
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.force
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RouterNavigator {
  
  @JSImport("react-onsenui", "RouterNavigator")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.RouterNavigator] {
    
    @scala.inline
    def animation(value: String): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def swipePop(value: () => Unit): this.type = set("swipePop", js.Any.fromFunction0(value))
    
    @scala.inline
    def swipeTargetWidth(value: Double): this.type = set("swipeTargetWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def swipeable(value: Boolean | force): this.type = set("swipeable", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLAttributesidclassNameOnPostPop): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    onPostPop: () => Unit,
    onPostPush: () => Unit,
    renderPage: (js.Any, js.UndefOr[typingsSlinky.reactOnsenui.mod.Navigator]) => ReactElement,
    routeConfig: js.Any
  ): Builder = {
    val __props = js.Dynamic.literal(onPostPop = js.Any.fromFunction0(onPostPop), onPostPush = js.Any.fromFunction0(onPostPush), renderPage = js.Any.fromFunction2(renderPage), routeConfig = routeConfig.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HTMLAttributesidclassNameOnPostPop]))
  }
}
