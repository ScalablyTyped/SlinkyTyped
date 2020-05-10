package typingsSlinky.higButton.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.higButton.mod.AvailableTargets_
import typingsSlinky.higButton.mod.AvailableTypes_
import typingsSlinky.higButton.mod.AvailableWidths_
import typingsSlinky.higButton.mod.Props
import typingsSlinky.higButton.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  @JSImport("@hig/button", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def link(value: String): this.type = set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: () => Unit): this.type = set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def onClick(value: () => Unit): this.type = set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def onFocus(value: () => Unit): this.type = set("onFocus", js.Any.fromFunction0(value))
    @scala.inline
    def onHover(value: () => Unit): this.type = set("onHover", js.Any.fromFunction0(value))
    @scala.inline
    def onMouseDown(value: () => Unit): this.type = set("onMouseDown", js.Any.fromFunction0(value))
    @scala.inline
    def onMouseEnter(value: () => Unit): this.type = set("onMouseEnter", js.Any.fromFunction0(value))
    @scala.inline
    def onMouseLeave(value: () => Unit): this.type = set("onMouseLeave", js.Any.fromFunction0(value))
    @scala.inline
    def onMouseUp(value: () => Unit): this.type = set("onMouseUp", js.Any.fromFunction0(value))
    @scala.inline
    def stylesheet(value: js.Any): this.type = set("stylesheet", value.asInstanceOf[js.Any])
    @scala.inline
    def target(value: AvailableTargets_): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: AvailableTypes_): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: AvailableWidths_): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(title: String): Builder = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

