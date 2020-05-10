package typingsSlinky.reactScrollRotate.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactScrollRotate.mod.ScrollRotateProps
import typingsSlinky.reactScrollRotate.reactScrollRotateStrings.prec
import typingsSlinky.reactScrollRotate.reactScrollRotateStrings.px
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollRotate {
  @JSImport("react-scroll-rotate", "ScrollRotate")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactScrollRotate.mod.ScrollRotate] {
    @scala.inline
    def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def from(value: Double): this.type = set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def loops(value: Double): this.type = set("loops", value.asInstanceOf[js.Any])
    @scala.inline
    def method(value: px | prec): this.type = set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def throttle(value: Double): this.type = set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def to(value: Double): this.type = set("to", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ScrollRotateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ScrollRotate.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

