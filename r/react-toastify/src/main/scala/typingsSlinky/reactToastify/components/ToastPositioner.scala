package typingsSlinky.reactToastify.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactToastify.toastPositionerMod.ToastPositionerProps
import typingsSlinky.reactToastify.typesMod.ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToastPositioner {
  @JSImport("react-toastify/dist/components/ToastPositioner", "ToastPositioner")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: ClassName): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def classNameNull: this.type = set("className", null)
    @scala.inline
    def in(value: Boolean): this.type = set("in", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToastPositionerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ToastPositioner.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

