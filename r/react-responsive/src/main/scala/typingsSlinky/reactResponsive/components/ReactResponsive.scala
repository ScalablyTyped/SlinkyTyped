package typingsSlinky.reactResponsive.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClassType
import typingsSlinky.reactResponsive.anon.PartialMediaQueryMatchers
import typingsSlinky.reactResponsive.mod.MediaQueryMatchers
import typingsSlinky.reactResponsive.mod.MediaQueryProps
import typingsSlinky.reactResponsive.mod.MediaQueryType
import typingsSlinky.reactResponsive.mod.default
import typingsSlinky.reactResponsive.reactResponsiveStrings.interlace
import typingsSlinky.reactResponsive.reactResponsiveStrings.landscape
import typingsSlinky.reactResponsive.reactResponsiveStrings.portrait
import typingsSlinky.reactResponsive.reactResponsiveStrings.progressive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactResponsive {
  
  @JSImport("react-responsive", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def all(value: Boolean): this.type = set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def aspectRatio(value: String): this.type = set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def aural(value: Boolean): this.type = set("aural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def braille(value: Boolean): this.type = set("braille", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction1(value: /* matches */ Boolean => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def children(value: ReactElement | (js.Function1[/* matches */ Boolean, ReactElement])): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: Boolean): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorIndex(value: Boolean): this.type = set("colorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[_]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[_]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: String | ReactComponentClass[_] | (ClassType[_, _, _])): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def device(value: MediaQueryMatchers): this.type = set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deviceAspectRatio(value: String): this.type = set("deviceAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deviceHeight(value: Double | String): this.type = set("deviceHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deviceWidth(value: Double | String): this.type = set("deviceWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def embossed(value: Boolean): this.type = set("embossed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def grid(value: Boolean): this.type = set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def handheld(value: Boolean): this.type = set("handheld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxAspectRatio(value: String): this.type = set("maxAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxColor(value: Double): this.type = set("maxColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxColorIndex(value: Double): this.type = set("maxColorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDeviceAspectRatio(value: String): this.type = set("maxDeviceAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDeviceHeight(value: Double | String): this.type = set("maxDeviceHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDeviceWidth(value: Double | String): this.type = set("maxDeviceWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxHeight(value: Double | String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxMonochrome(value: Double): this.type = set("maxMonochrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxResolution(value: Double | String): this.type = set("maxResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxWidth(value: Double | String): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minAspectRatio(value: String): this.type = set("minAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minColor(value: Double): this.type = set("minColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minColorIndex(value: Double): this.type = set("minColorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDeviceAspectRatio(value: String): this.type = set("minDeviceAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDeviceHeight(value: Double | String): this.type = set("minDeviceHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDeviceWidth(value: Double | String): this.type = set("minDeviceWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minHeight(value: Double | String): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minMonochrome(value: Double): this.type = set("minMonochrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minResolution(value: Double | String): this.type = set("minResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minWidth(value: Double | String): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def monochrome(value: Boolean): this.type = set("monochrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBeforeChange(value: /* matches */ Boolean => Unit): this.type = set("onBeforeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* matches */ Boolean => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def orientation(value: portrait | landscape): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def print(value: Boolean): this.type = set("print", value.asInstanceOf[js.Any])
    
    @scala.inline
    def projection(value: Boolean): this.type = set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def query(value: String): this.type = set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resolution(value: Double | String): this.type = set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scan(value: progressive | interlace): this.type = set("scan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def screen(value: Boolean): this.type = set("screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tty(value: Boolean): this.type = set("tty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tv(value: Boolean): this.type = set("tv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: MediaQueryType): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def values(value: PartialMediaQueryMatchers): this.type = set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MediaQueryProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactResponsive.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
