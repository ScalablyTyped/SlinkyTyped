package typingsSlinky.nivoTooltip.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoTooltip.basicTooltipMod.BasicTooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BasicTooltip {
  
  @JSImport("@nivo/tooltip", "BasicTooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableChip(value: Boolean): this.type = set("enableChip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def format(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataFormatter */ js.Any
    ): this.type = set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: ReactElement): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderContent(value: () => ReactElement): this.type = set("renderContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def value(value: Double | String | js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueDate(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: BasicTooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BasicTooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
