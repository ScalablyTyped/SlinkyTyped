package typingsSlinky.reactCircularProgressbar.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCircularProgressbar.anon.Background
import typingsSlinky.reactCircularProgressbar.circularProgressbarWithChildrenMod.CircularProgressbarWithChildrenProps
import typingsSlinky.reactCircularProgressbar.typesMod.CircularProgressbarStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CircularProgressbarWithChildren {
  @JSImport("react-circular-progressbar", "CircularProgressbarWithChildren")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def background(value: Boolean): this.type = set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundPadding(value: Double): this.type = set("backgroundPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def circleRatio(value: Double): this.type = set("circleRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def classes(value: Background): this.type = set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def counterClockwise(value: Boolean): this.type = set("counterClockwise", value.asInstanceOf[js.Any])
    @scala.inline
    def maxValue(value: Double): this.type = set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def minValue(value: Double): this.type = set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def styles(value: CircularProgressbarStyles): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CircularProgressbarWithChildrenProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: Double): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CircularProgressbarWithChildrenProps]))
  }
}

