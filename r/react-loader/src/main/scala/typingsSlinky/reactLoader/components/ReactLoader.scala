package typingsSlinky.reactLoader.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactLoader.mod.LoaderOptions
import typingsSlinky.reactLoader.mod.LoaderProps
import typingsSlinky.reactLoader.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactLoader {
  @JSImport("react-loader", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def corners(value: Double): this.type = set("corners", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: Double): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def fps(value: Double): this.type = set("fps", value.asInstanceOf[js.Any])
    @scala.inline
    def hwaccel(value: Boolean): this.type = set("hwaccel", value.asInstanceOf[js.Any])
    @scala.inline
    def left(value: String): this.type = set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def length(value: Double): this.type = set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def lines(value: Double): this.type = set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def loadedClassName(value: String): this.type = set("loadedClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def opacity(value: Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def options(value: LoaderOptions): this.type = set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def radius(value: Double): this.type = set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def rotate(value: Double): this.type = set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def scale(value: Double): this.type = set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def shadow(value: Boolean): this.type = set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def top(value: String): this.type = set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def trail(value: Double): this.type = set("trail", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LoaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(loaded: Boolean): Builder = {
    val __props = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LoaderProps]))
  }
}

