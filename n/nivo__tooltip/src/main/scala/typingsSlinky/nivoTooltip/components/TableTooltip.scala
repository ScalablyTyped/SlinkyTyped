package typingsSlinky.nivoTooltip.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoTooltip.mod.TableTooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableTooltip {
  
  @JSImport("@nivo/tooltip", "TableTooltip")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.nivoTooltip.mod.TableTooltip] {
    
    @scala.inline
    def renderContent(value: () => ReactElement): this.type = set("renderContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableTooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(rows: js.Array[js.Array[ReactElement]]): Builder = {
    val __props = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TableTooltipProps]))
  }
}
