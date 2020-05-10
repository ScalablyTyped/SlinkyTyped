package typingsSlinky.reactMotion.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMotion.mod.MotionProps
import typingsSlinky.reactMotion.mod.PlainStyle
import typingsSlinky.reactMotion.mod.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Motion {
  @JSImport("react-motion", "Motion")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMotion.mod.Motion] {
    @scala.inline
    def defaultStyle(value: PlainStyle): this.type = set("defaultStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def onRest(value: () => Unit): this.type = set("onRest", js.Any.fromFunction0(value))
  }
  
  def withProps(p: MotionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(style: Style): Builder = {
    val __props = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MotionProps]))
  }
}

