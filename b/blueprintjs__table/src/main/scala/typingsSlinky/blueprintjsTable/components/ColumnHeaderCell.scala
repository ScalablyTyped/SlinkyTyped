package typingsSlinky.blueprintjsTable.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.blueprintjsTable.columnHeaderCellMod.IColumnHeaderCellProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColumnHeaderCell {
  
  @JSImport("@blueprintjs/table", "ColumnHeaderCell")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.mod.ColumnHeaderCell] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableColumnReordering(value: Boolean): this.type = set("enableColumnReordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isActive(value: Boolean): this.type = set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isColumnSelected(value: Boolean): this.type = set("isColumnSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuIconReactElement(value: ReactElement): this.type = set("menuIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuIcon(value: IconName | ReactElement): this.type = set("menuIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuRenderer(value: /* index */ js.UndefOr[Double] => ReactElement): this.type = set("menuRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nameRenderer(value: (/* name */ String, /* index */ js.UndefOr[Double]) => ReactElement): this.type = set("nameRenderer", js.Any.fromFunction2(value))
    
    @scala.inline
    def reorderHandle(value: ReactElement): this.type = set("reorderHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resizeHandle(value: typingsSlinky.blueprintjsTable.resizeHandleMod.ResizeHandle): this.type = set("resizeHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IColumnHeaderCellProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ColumnHeaderCell.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
