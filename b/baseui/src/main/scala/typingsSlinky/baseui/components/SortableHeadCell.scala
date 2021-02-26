package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.baseuiStrings.ASC
import typingsSlinky.baseui.baseuiStrings.DESC
import typingsSlinky.baseui.tableMod.SortableHeadCellOverrides
import typingsSlinky.baseui.tableMod.SortableHeadCellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SortableHeadCell {
  
  @scala.inline
  def apply(title: String): Builder = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SortableHeadCellProps]))
  }
  
  @JSImport("baseui/table", "SortableHeadCell")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def direction(value: ASC | DESC): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def directionNull: this.type = set("direction", null)
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillClickTarget(value: Boolean): this.type = set("fillClickTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSort(value: () => _): this.type = set("onSort", js.Any.fromFunction0(value))
    
    @scala.inline
    def overrides(value: SortableHeadCellOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SortableHeadCellProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
