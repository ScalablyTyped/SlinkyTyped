package typingsSlinky.materialUiCore.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiCore.noSsrMod.default
import typingsSlinky.materialUiCore.noSsrNoSsrMod.NoSsrProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NoSsr {
  @JSImport("@material-ui/core/NoSsr", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def fallbackReactElement(value: ReactElement): this.type = set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def fallback(value: TagMod[Any]): this.type = set("fallback", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NoSsrProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: NoSsr.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

