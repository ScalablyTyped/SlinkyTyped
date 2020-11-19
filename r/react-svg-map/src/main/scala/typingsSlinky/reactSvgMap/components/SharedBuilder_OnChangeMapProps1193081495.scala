package typingsSlinky.reactSvgMap.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_OnChangeMapProps1193081495[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def childrenAfter(value: ReactElement): this.type = set("childrenAfter", value.asInstanceOf[js.Any])
  
  @scala.inline
  def childrenBefore(value: ReactElement): this.type = set("childrenBefore", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def locationClassNameFunction1(value: /* repeated */ js.Any => _): this.type = set("locationClassName", js.Any.fromFunction1(value))
  
  @scala.inline
  def locationClassName(value: String | (js.Function1[/* repeated */ js.Any, _])): this.type = set("locationClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onChange(value: /* repeated */ js.Any => _): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onLocationBlur(value: /* repeated */ js.Any => _): this.type = set("onLocationBlur", js.Any.fromFunction1(value))
  
  @scala.inline
  def onLocationFocus(value: /* repeated */ js.Any => _): this.type = set("onLocationFocus", js.Any.fromFunction1(value))
  
  @scala.inline
  def onLocationMouseMove(value: /* repeated */ js.Any => _): this.type = set("onLocationMouseMove", js.Any.fromFunction1(value))
  
  @scala.inline
  def onLocationMouseOut(value: /* repeated */ js.Any => _): this.type = set("onLocationMouseOut", js.Any.fromFunction1(value))
  
  @scala.inline
  def onLocationMouseOver(value: /* repeated */ js.Any => _): this.type = set("onLocationMouseOver", js.Any.fromFunction1(value))
}
