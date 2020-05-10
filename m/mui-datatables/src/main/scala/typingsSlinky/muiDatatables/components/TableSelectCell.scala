package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.MUIDataTableSelectCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableSelectCell {
  @JSImport("mui-datatables", "TableSelectCell")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def expandableOn(value: Boolean): this.type = set("expandableOn", value.asInstanceOf[js.Any])
    @scala.inline
    def isHeaderCell(value: Boolean): this.type = set("isHeaderCell", value.asInstanceOf[js.Any])
    @scala.inline
    def isRowExpanded(value: Boolean): this.type = set("isRowExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def isRowSelectable(value: Boolean): this.type = set("isRowSelectable", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* args */ js.Any => _): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onExpand(value: /* args */ js.Any => _): this.type = set("onExpand", js.Any.fromFunction1(value))
    @scala.inline
    def otherProps(value: js.Any): this.type = set("otherProps", value.asInstanceOf[js.Any])
    @scala.inline
    def selectableOn(value: Boolean): this.type = set("selectableOn", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MUIDataTableSelectCell): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(checked: Boolean, fixedHeader: Boolean): Builder = {
    val __props = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], fixedHeader = fixedHeader.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableSelectCell]))
  }
}

