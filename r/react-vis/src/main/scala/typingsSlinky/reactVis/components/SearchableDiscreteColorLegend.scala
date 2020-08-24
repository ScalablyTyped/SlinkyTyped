package typingsSlinky.reactVis.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactChild
import typingsSlinky.reactVis.anon.Color
import typingsSlinky.reactVis.mod.SearchableDiscreteColorLegendProps
import typingsSlinky.reactVis.reactVisStrings.horizontal
import typingsSlinky.reactVis.reactVisStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchableDiscreteColorLegend {
  @JSImport("react-vis", "SearchableDiscreteColorLegend")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def onItemClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onItemClick", js.Any.fromFunction1(value))
    @scala.inline
    def onItemMouseEnter(
      value: (/* item */ js.Any, /* index */ Double, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): this.type = set("onItemMouseEnter", js.Any.fromFunction3(value))
    @scala.inline
    def onItemMouseLeave(
      value: (/* item */ js.Any, /* index */ Double, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): this.type = set("onItemMouseLeave", js.Any.fromFunction3(value))
    @scala.inline
    def onSearchChange(value: /* x */ js.Any => _): this.type = set("onSearchChange", js.Any.fromFunction1(value))
    @scala.inline
    def orientation(value: vertical | horizontal): this.type = set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def searchFn(value: (/* items */ js.Array[_], /* s */ String) => js.Array[_]): this.type = set("searchFn", js.Any.fromFunction2(value))
    @scala.inline
    def searchPlaceholder(value: String): this.type = set("searchPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def searchText(value: String): this.type = set("searchText", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SearchableDiscreteColorLegendProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(items: js.Array[Color | String | ReactChild]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SearchableDiscreteColorLegendProps]))
  }
}

