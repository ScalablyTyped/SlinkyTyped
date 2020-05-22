package typingsSlinky.reactImageMagnifiers.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactImageMagnifiers.mod.MagnifierContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MagnifierContainer {
  @JSImport("react-image-magnifiers", "MagnifierContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactImageMagnifiers.mod.MagnifierContainer] {
    @scala.inline
    def autoInPlace(value: Boolean): this.type = set("autoInPlace", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def inPlaceMinBreakpoint(value: Double): this.type = set("inPlaceMinBreakpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: String): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MagnifierContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MagnifierContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

