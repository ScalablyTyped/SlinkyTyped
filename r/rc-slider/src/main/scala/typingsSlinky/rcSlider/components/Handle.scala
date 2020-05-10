package typingsSlinky.rcSlider.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcSlider.mod.HandleProps
import typingsSlinky.rcSlider.mod.Marks
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Handle {
  @JSImport("rc-slider", "Handle")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.rcSlider.mod.Handle] {
    @scala.inline
    def activeDotStyle(value: CSSProperties): this.type = set("activeDotStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def dotStyle(value: CSSProperties): this.type = set("dotStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def dots(value: Boolean): this.type = set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def handle(value: /* props */ js.Any => TagMod[Any]): this.type = set("handle", js.Any.fromFunction1(value))
    @scala.inline
    def handleStyle(value: js.Array[CSSProperties] | CSSProperties): this.type = set("handleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def included(value: Boolean): this.type = set("included", value.asInstanceOf[js.Any])
    @scala.inline
    def marks(value: Marks): this.type = set("marks", value.asInstanceOf[js.Any])
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def railStyle(value: CSSProperties): this.type = set("railStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def stepNull: this.type = set("step", null)
    @scala.inline
    def style(value: js.Array[CSSProperties] | CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def tipFormatter(value: /* value */ js.Any => js.UndefOr[_]): this.type = set("tipFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def tipFormatterNull: this.type = set("tipFormatter", null)
    @scala.inline
    def tipTransitionName(value: String): this.type = set("tipTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def trackStyle(value: js.Array[CSSProperties] | CSSProperties): this.type = set("trackStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HandleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(className: String, offset: Double, vertical: Boolean): Builder = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HandleProps]))
  }
}

