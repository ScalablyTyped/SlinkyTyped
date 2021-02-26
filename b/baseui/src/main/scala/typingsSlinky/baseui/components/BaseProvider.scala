package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.mod.BaseProviderOverrides
import typingsSlinky.baseui.mod.BaseProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseProvider {
  
  @scala.inline
  def apply(
    theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
  ): Builder = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BaseProviderProps]))
  }
  
  @JSImport("baseui", "BaseProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def overrides(value: BaseProviderOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BaseProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
