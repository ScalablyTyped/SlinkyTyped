package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.anon.Checked
import typingsSlinky.fundamentalReact.switchMod.SwitchProps
import typingsSlinky.react.mod.PropsWithChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Switch {
  @JSImport("fundamental-react/lib/Switch/Switch", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def inputProps(value: js.Any): this.type = set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def internalLabels(value: Checked): this.type = set("internalLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def labelProps(value: js.Any): this.type = set("labelProps", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* repeated */ js.Any => _): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def semantic(value: Boolean): this.type = set("semantic", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[SwitchProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Switch.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

