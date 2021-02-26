package typingsSlinky.reactStonecutter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactStonecutter.mod.AngleUnit
import typingsSlinky.reactStonecutter.mod.Layout_
import typingsSlinky.reactStonecutter.mod.LengthUnit
import typingsSlinky.reactStonecutter.mod.SpringGridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SpringGrid {
  
  @scala.inline
  def apply(columnWidth: Double, columns: Double): Builder = {
    val __props = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SpringGridProps]))
  }
  
  @JSImport("react-stonecutter", "SpringGrid")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactStonecutter.mod.SpringGrid] {
    
    @scala.inline
    def angleUnit(value: AngleUnit): this.type = set("angleUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: String): this.type = set("component", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def springConfig(value: js.Any): this.type = set("springConfig", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SpringGridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
