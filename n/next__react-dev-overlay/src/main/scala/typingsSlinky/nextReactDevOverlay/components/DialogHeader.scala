package typingsSlinky.nextReactDevOverlay.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nextReactDevOverlay.dialogHeaderMod.DialogHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DialogHeader {
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/Dialog", "DialogHeader")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DialogHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DialogHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
