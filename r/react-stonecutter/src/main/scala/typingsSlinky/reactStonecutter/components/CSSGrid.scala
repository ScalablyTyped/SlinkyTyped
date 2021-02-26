package typingsSlinky.reactStonecutter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactStonecutter.mod.AngleUnit
import typingsSlinky.reactStonecutter.mod.CSSGridProps
import typingsSlinky.reactStonecutter.mod.Easing
import typingsSlinky.reactStonecutter.mod.Layout_
import typingsSlinky.reactStonecutter.mod.LengthUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CSSGrid {
  
  @scala.inline
  def apply(columnWidth: Double, columns: Double, duration: Double): Builder = {
    val __props = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CSSGridProps]))
  }
  
  @JSImport("react-stonecutter", "CSSGrid")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactStonecutter.mod.CSSGrid] {
    
    @scala.inline
    def angleUnit(value: AngleUnit): this.type = set("angleUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: String): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def easing(value: Easing): this.type = set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enter(value: (/* itemProps */ js.Array[_], /* gridProps */ js.Array[_], /* gridState */ js.Any) => _): this.type = set("enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def entered(value: (/* itemProps */ js.Array[_], /* gridProps */ js.Array[_], /* gridState */ js.Any) => _): this.type = set("entered", js.Any.fromFunction3(value))
    
    @scala.inline
    def exit(value: (/* itemProps */ js.Array[_], /* gridProps */ js.Array[_], /* gridState */ js.Any) => _): this.type = set("exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def gutterHeight(value: Double): this.type = set("gutterHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gutterWidth(value: Double): this.type = set("gutterWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def layout(value: (/* itemProps */ js.Array[js.Any], /* gridProps */ js.Array[js.Any]) => Layout_): this.type = set("layout", js.Any.fromFunction2(value))
    
    @scala.inline
    def lengthUnit(value: LengthUnit): this.type = set("lengthUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def perspective(value: Double): this.type = set("perspective", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CSSGridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
