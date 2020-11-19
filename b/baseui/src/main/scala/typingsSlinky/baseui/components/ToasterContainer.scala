package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.ReadonlyToasterProps
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import typingsSlinky.baseui.toastMod.ToasterOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToasterContainer {
  
  @JSImport("baseui/toast", "ToasterContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.toastMod.ToasterContainer] {
    
    @scala.inline
    def autoHideDuration(value: Double): this.type = set("autoHideDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overrides(value: ToasterOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placement(value: topLeft | topRight | bottomLeft | bottomRight | bottom | top): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def usePortal(value: Boolean): this.type = set("usePortal", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReadonlyToasterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ToasterContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
