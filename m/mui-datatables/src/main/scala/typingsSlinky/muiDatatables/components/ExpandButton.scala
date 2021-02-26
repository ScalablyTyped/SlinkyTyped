package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.MUIDataTableExpandButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExpandButton {
  
  @scala.inline
  def apply(
    areAllRowsExpanded: () => Boolean,
    buttonClass: String,
    expandableRowsHeader: Boolean,
    iconClass: String,
    iconIndeterminateClass: String,
    isHeaderCell: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(areAllRowsExpanded = js.Any.fromFunction0(areAllRowsExpanded), buttonClass = buttonClass.asInstanceOf[js.Any], expandableRowsHeader = expandableRowsHeader.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], iconIndeterminateClass = iconIndeterminateClass.asInstanceOf[js.Any], isHeaderCell = isHeaderCell.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableExpandButton]))
  }
  
  @JSImport("mui-datatables", "ExpandButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def dataIndex(value: Double): this.type = set("dataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandedRows(value: js.Any): this.type = set("expandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onExpand(value: /* args */ js.Any => _): this.type = set("onExpand", js.Any.fromFunction1(value))
  }
  
  def withProps(p: MUIDataTableExpandButton): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
