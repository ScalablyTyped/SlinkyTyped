package typingsSlinky.reactSparklines.components

import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactSVGElement
import typingsSlinky.reactSparklines.mod.Point
import typingsSlinky.reactSparklines.mod.SparklinesBarsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SparklinesBars {
  @JSImport("react-sparklines", "SparklinesBars")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSparklines.mod.SparklinesBars] {
    @scala.inline
    def barWidth(value: Double): this.type = set("barWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: Double): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseMove(value: (/* p */ Point, /* event */ SyntheticMouseEvent[ReactSVGElement]) => Unit): this.type = set("onMouseMove", js.Any.fromFunction2(value))
    @scala.inline
    def pointsVarargs(value: Point*): this.type = set("points", js.Array(value :_*))
    @scala.inline
    def points(value: js.Array[Point]): this.type = set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SparklinesBarsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SparklinesBars.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

