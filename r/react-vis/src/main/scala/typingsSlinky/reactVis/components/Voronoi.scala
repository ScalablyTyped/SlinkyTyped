package typingsSlinky.reactVis.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactVis.mod.VoronoiPoint
import typingsSlinky.reactVis.mod.VoronoiProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Voronoi {
  @JSImport("react-vis", "Voronoi")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onHover(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onHover", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseUp(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def x(value: /* d */ js.Any => Double): this.type = set("x", js.Any.fromFunction1(value))
    @scala.inline
    def y(value: /* d */ js.Any => Double): this.type = set("y", js.Any.fromFunction1(value))
  }
  
  def withProps(p: VoronoiProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(extent: js.Array[js.Array[Double]], nodes: js.Array[VoronoiPoint]): Builder = {
    val __props = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[VoronoiProps]))
  }
}

