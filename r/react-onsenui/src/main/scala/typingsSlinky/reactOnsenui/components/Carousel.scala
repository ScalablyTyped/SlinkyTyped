package typingsSlinky.reactOnsenui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.anon.HTMLAttributesidclassNameAutoRefresh
import typingsSlinky.reactOnsenui.mod.AnimationOptions
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.horizontal
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Carousel {
  
  @JSImport("react-onsenui", "Carousel")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.Carousel] {
    
    @scala.inline
    def animationOptions(value: AnimationOptions): this.type = set("animationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoRefresh(value: Boolean): this.type = set("autoRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoScroll(value: Boolean): this.type = set("autoScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoScrollRatio(value: Double): this.type = set("autoScrollRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: horizontal | vertical): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fullscreen(value: Boolean): this.type = set("fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemHeight(value: Double | String): this.type = set("itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemWidth(value: Double | String): this.type = set("itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onOverscroll(value: () => Unit): this.type = set("onOverscroll", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPostChange(value: () => Unit): this.type = set("onPostChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def onRefresh(value: () => Unit): this.type = set("onRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def overscrollable(value: Boolean): this.type = set("overscrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def swipeable(value: Boolean): this.type = set("swipeable", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLAttributesidclassNameAutoRefresh): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Carousel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
