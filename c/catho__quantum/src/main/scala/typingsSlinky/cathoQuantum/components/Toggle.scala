package typingsSlinky.cathoQuantum.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.BaseFontSize
import typingsSlinky.cathoQuantum.toggleMod.ToggleProps
import typingsSlinky.cathoQuantum.toggleMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Toggle {
  @JSImport("@catho/quantum/Toggle", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: BaseFontSize): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToggleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Toggle.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

