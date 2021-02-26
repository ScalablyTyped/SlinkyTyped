package typingsSlinky.reactSvgMap.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSvgMap.mod.Map
import typingsSlinky.reactSvgMap.mod.SVGMapProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SVGMap {
  
  @scala.inline
  def apply(map: Map): Builder = {
    val __props = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SVGMapProps]))
  }
  
  @JSImport("react-svg-map", "SVGMap")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def childrenAfter(value: ReactElement): this.type = set("childrenAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenBefore(value: ReactElement): this.type = set("childrenBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isLocationSelected(value: /* repeated */ js.Any => _): this.type = set("isLocationSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def locationClassName(value: String | (js.Function1[/* repeated */ js.Any, _])): this.type = set("locationClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locationClassNameFunction1(value: /* repeated */ js.Any => _): this.type = set("locationClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def locationRole(value: String): this.type = set("locationRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locationTabIndex(value: String | (js.Function1[/* repeated */ js.Any, _])): this.type = set("locationTabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locationTabIndexFunction1(value: /* repeated */ js.Any => _): this.type = set("locationTabIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLocationBlur(value: /* repeated */ js.Any => _): this.type = set("onLocationBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLocationClick(value: /* repeated */ js.Any => _): this.type = set("onLocationClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLocationFocus(value: /* repeated */ js.Any => _): this.type = set("onLocationFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLocationKeyDown(value: /* repeated */ js.Any => _): this.type = set("onLocationKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLocationMouseMove(value: /* repeated */ js.Any => _): this.type = set("onLocationMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLocationMouseOut(value: /* repeated */ js.Any => _): this.type = set("onLocationMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLocationMouseOver(value: /* repeated */ js.Any => _): this.type = set("onLocationMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SVGMapProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
