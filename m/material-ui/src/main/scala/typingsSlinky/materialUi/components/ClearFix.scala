package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.clearFixMod.ClearFixProps
import typingsSlinky.materialUi.clearFixMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClearFix {
  
  @JSImport("material-ui/internal/ClearFix", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ClearFixProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ClearFix.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
