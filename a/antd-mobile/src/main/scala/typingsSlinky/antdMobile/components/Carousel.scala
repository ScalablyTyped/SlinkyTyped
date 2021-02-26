package typingsSlinky.antdMobile.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.carouselMod.CarouselProps
import typingsSlinky.antdMobile.carouselMod.IFrameOverFlow
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Carousel {
  
  @JSImport("antd-mobile", "Carousel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobile.mod.Carousel] {
    
    @scala.inline
    def afterChange(value: /* current */ Double => Unit): this.type = set("afterChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoplayInterval(value: Double): this.type = set("autoplayInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def beforeChange(value: (/* from */ Double, /* to */ Double) => Unit): this.type = set("beforeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def cellSpacing(value: Double): this.type = set("cellSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dotActiveStyle(value: CSSProperties): this.type = set("dotActiveStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dotStyle(value: CSSProperties): this.type = set("dotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dots(value: Boolean): this.type = set("dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def easing(value: () => Unit): this.type = set("easing", js.Any.fromFunction0(value))
    
    @scala.inline
    def frameOverflow(value: IFrameOverFlow): this.type = set("frameOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def infinite(value: Boolean): this.type = set("infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialSlideWidth(value: Double): this.type = set("initialSlideWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedIndex(value: Double): this.type = set("selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slideWidth(value: String | Double): this.type = set("slideWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def swipeSpeed(value: Double): this.type = set("swipeSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Carousel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CarouselProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
