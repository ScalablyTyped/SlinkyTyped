package typingsSlinky.reactToggled.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactToggled.mod.ReactToggledProps
import typingsSlinky.reactToggled.mod.TogglerStateAndHelpers
import typingsSlinky.reactToggled.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactToggled {
  @JSImport("react-toggled", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def defaultOn(value: Boolean): this.type = set("defaultOn", value.asInstanceOf[js.Any])
    @scala.inline
    def on(value: Boolean): this.type = set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def onToggle(value: (/* on */ Boolean, /* object */ TogglerStateAndHelpers) => Unit): this.type = set("onToggle", js.Any.fromFunction2(value))
  }
  
  def withProps(p: ReactToggledProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactToggled.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

