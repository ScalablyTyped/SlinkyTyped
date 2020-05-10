package typingsSlinky.reactCssCollapse.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCssCollapse.mod.Props
import typingsSlinky.reactCssCollapse.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCssCollapse {
  @JSImport("react-css-collapse", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def classNameNull: this.type = set("className", null)
    @scala.inline
    def onRest(value: () => Unit): this.type = set("onRest", js.Any.fromFunction0(value))
    @scala.inline
    def transition(value: String): this.type = set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionNull: this.type = set("transition", null)
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(isOpen: Boolean): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

