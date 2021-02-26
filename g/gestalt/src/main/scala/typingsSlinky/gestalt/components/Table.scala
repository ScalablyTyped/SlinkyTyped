package typingsSlinky.gestalt.components

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLTableCellElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.gestalt.anon.Event
import typingsSlinky.gestalt.gestaltStrings.active
import typingsSlinky.gestalt.gestaltStrings.asc
import typingsSlinky.gestalt.gestaltStrings.col
import typingsSlinky.gestalt.gestaltStrings.colgroup
import typingsSlinky.gestalt.gestaltStrings.desc
import typingsSlinky.gestalt.gestaltStrings.gray
import typingsSlinky.gestalt.gestaltStrings.inactive
import typingsSlinky.gestalt.gestaltStrings.none
import typingsSlinky.gestalt.gestaltStrings.number
import typingsSlinky.gestalt.gestaltStrings.row
import typingsSlinky.gestalt.gestaltStrings.rowgroup
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.gestaltStrings.string
import typingsSlinky.gestalt.mod.TableBodyProps
import typingsSlinky.gestalt.mod.TableCellProps
import typingsSlinky.gestalt.mod.TableFooterProps
import typingsSlinky.gestalt.mod.TableHeaderCellProps
import typingsSlinky.gestalt.mod.TableHeaderProps
import typingsSlinky.gestalt.mod.TableProps
import typingsSlinky.gestalt.mod.TableRowExpandableProps
import typingsSlinky.gestalt.mod.TableRowProps
import typingsSlinky.gestalt.mod.TableSortableHeaderCellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  object Body {
    
    @JSImport("gestalt", "Table.Body")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Body.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TableBodyProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Cell {
    
    @JSImport("gestalt", "Table.Cell")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Cell.type): typingsSlinky.gestalt.components.Table.Cell.Builder = new typingsSlinky.gestalt.components.Table.Cell.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TableCellProps): typingsSlinky.gestalt.components.Table.Cell.Builder = new typingsSlinky.gestalt.components.Table.Cell.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Footer {
    
    @JSImport("gestalt", "Table.Footer")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Footer.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TableFooterProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Header {
    
    @JSImport("gestalt", "Table.Header")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def sticky(value: Boolean): this.type = set("sticky", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Header.type): typingsSlinky.gestalt.components.Table.Header.Builder = new typingsSlinky.gestalt.components.Table.Header.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TableHeaderProps): typingsSlinky.gestalt.components.Table.Header.Builder = new typingsSlinky.gestalt.components.Table.Header.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object HeaderCell {
    
    @JSImport("gestalt", "Table.HeaderCell")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def scope(value: col | row | colgroup | rowgroup): this.type = set("scope", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: HeaderCell.type): typingsSlinky.gestalt.components.Table.HeaderCell.Builder = new typingsSlinky.gestalt.components.Table.HeaderCell.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TableHeaderCellProps): typingsSlinky.gestalt.components.Table.HeaderCell.Builder = new typingsSlinky.gestalt.components.Table.HeaderCell.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Row {
    
    @JSImport("gestalt", "Table.Row")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Row.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TableRowProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object RowExpandable {
    
    @scala.inline
    def apply(accessibilityCollapseLabel: String, accessibilityExpandLabel: String, id: String): typingsSlinky.gestalt.components.Table.RowExpandable.Builder = {
      val __props = js.Dynamic.literal(accessibilityCollapseLabel = accessibilityCollapseLabel.asInstanceOf[js.Any], accessibilityExpandLabel = accessibilityExpandLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      new typingsSlinky.gestalt.components.Table.RowExpandable.Builder(js.Array(this.component, __props.asInstanceOf[TableRowExpandableProps]))
    }
    
    @JSImport("gestalt", "Table.RowExpandable")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[slinky.web.html.button.tag.type, js.Object] {
      
      @scala.inline
      def expandedContents(value: ReactElement): this.type = set("expandedContents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hoverStyle(value: none | gray): this.type = set("hoverStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onExpand(
        value: /* arg */ js.Object with (Event[
              (SyntheticMouseEvent[HTMLAnchorElement | HTMLButtonElement]) | (SyntheticKeyboardEvent[HTMLAnchorElement | HTMLButtonElement])
            ]) => Unit
      ): this.type = set("onExpand", js.Any.fromFunction1(value))
    }
    
    def withProps(p: TableRowExpandableProps): typingsSlinky.gestalt.components.Table.RowExpandable.Builder = new typingsSlinky.gestalt.components.Table.RowExpandable.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object SortableHeaderCell {
    
    @scala.inline
    def apply(
      onSortChange: /* arg */ js.Object with (Event[
          SyntheticMouseEvent[HTMLTableCellElement] | SyntheticKeyboardEvent[HTMLTableCellElement]
        ]) => Unit,
      sortOrder: asc | desc,
      status: active | inactive
    ): typingsSlinky.gestalt.components.Table.SortableHeaderCell.Builder = {
      val __props = js.Dynamic.literal(onSortChange = js.Any.fromFunction1(onSortChange), sortOrder = sortOrder.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      new typingsSlinky.gestalt.components.Table.SortableHeaderCell.Builder(js.Array(this.component, __props.asInstanceOf[TableSortableHeaderCellProps]))
    }
    
    @JSImport("gestalt", "Table.SortableHeaderCell")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def scope(value: col | row | colgroup | rowgroup): this.type = set("scope", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: TableSortableHeaderCellProps): typingsSlinky.gestalt.components.Table.SortableHeaderCell.Builder = new typingsSlinky.gestalt.components.Table.SortableHeaderCell.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("gestalt", "Table")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Table] {
    
    @scala.inline
    def borderStyle(value: sm | none): this.type = set("borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxHeight(value: number | string): this.type = set("maxHeight", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Table.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
