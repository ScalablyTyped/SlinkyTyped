package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Grid")
@js.native
class Grid protected ()
  extends typingsSlinky.ejWebAll.ej.Grid {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Grid.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Grid.Model) = this()
}
/* static members */
@JSGlobal("ej.Grid")
@js.native
object Grid extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.Grid = js.native
  
  @js.native
  object CellSelectionMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.CellSelectionMode with Double] = js.native
    
    /* 1 */ val Box: typingsSlinky.ejWebAll.ej.Grid.CellSelectionMode.Box with Double = js.native
    
    /* 0 */ val Flow: typingsSlinky.ejWebAll.ej.Grid.CellSelectionMode.Flow with Double = js.native
  }
  
  @js.native
  object ClipMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.ClipMode with Double] = js.native
    
    /* 1 */ val Clip: typingsSlinky.ejWebAll.ej.Grid.ClipMode.Clip with Double = js.native
    
    /* 0 */ val Ellipsis: typingsSlinky.ejWebAll.ej.Grid.ClipMode.Ellipsis with Double = js.native
    
    /* 2 */ val EllipsisWithTooltip: typingsSlinky.ejWebAll.ej.Grid.ClipMode.EllipsisWithTooltip with Double = js.native
  }
  
  @js.native
  object ColumnLayout extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.ColumnLayout with Double] = js.native
    
    /* 0 */ val Auto: typingsSlinky.ejWebAll.ej.Grid.ColumnLayout.Auto with Double = js.native
    
    /* 1 */ val Fixed: typingsSlinky.ejWebAll.ej.Grid.ColumnLayout.Fixed with Double = js.native
  }
  
  @js.native
  object DragBehavior extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.DragBehavior with Double] = js.native
    
    /* 1 */ val Copy: typingsSlinky.ejWebAll.ej.Grid.DragBehavior.Copy with Double = js.native
    
    /* 0 */ val Move: typingsSlinky.ejWebAll.ej.Grid.DragBehavior.Move with Double = js.native
  }
  
  @js.native
  object EditMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.EditMode with Double] = js.native
    
    /* 3 */ val Batch: typingsSlinky.ejWebAll.ej.Grid.EditMode.Batch with Double = js.native
    
    /* 1 */ val Dialog: typingsSlinky.ejWebAll.ej.Grid.EditMode.Dialog with Double = js.native
    
    /* 2 */ val DialogTemplate: typingsSlinky.ejWebAll.ej.Grid.EditMode.DialogTemplate with Double = js.native
    
    /* 6 */ val ExternalForm: typingsSlinky.ejWebAll.ej.Grid.EditMode.ExternalForm with Double = js.native
    
    /* 7 */ val ExternalFormTemplate: typingsSlinky.ejWebAll.ej.Grid.EditMode.ExternalFormTemplate with Double = js.native
    
    /* 4 */ val InlineForm: typingsSlinky.ejWebAll.ej.Grid.EditMode.InlineForm with Double = js.native
    
    /* 5 */ val InlineTemplateForm: typingsSlinky.ejWebAll.ej.Grid.EditMode.InlineTemplateForm with Double = js.native
    
    /* 0 */ val Normal: typingsSlinky.ejWebAll.ej.Grid.EditMode.Normal with Double = js.native
  }
  
  @js.native
  object EditingType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.EditingType with Double] = js.native
    
    /* 1 */ val Boolean: typingsSlinky.ejWebAll.ej.Grid.EditingType.Boolean with Double = js.native
    
    /* 4 */ val DatePicker: typingsSlinky.ejWebAll.ej.Grid.EditingType.DatePicker with Double = js.native
    
    /* 5 */ val DateTimePicker: typingsSlinky.ejWebAll.ej.Grid.EditingType.DateTimePicker with Double = js.native
    
    /* 3 */ val Dropdown: typingsSlinky.ejWebAll.ej.Grid.EditingType.Dropdown with Double = js.native
    
    /* 2 */ val Numeric: typingsSlinky.ejWebAll.ej.Grid.EditingType.Numeric with Double = js.native
    
    /* 0 */ val String: typingsSlinky.ejWebAll.ej.Grid.EditingType.String with Double = js.native
  }
  
  @js.native
  object FilterBarMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.FilterBarMode with Double] = js.native
    
    /* 0 */ val Immediate: typingsSlinky.ejWebAll.ej.Grid.FilterBarMode.Immediate with Double = js.native
    
    /* 1 */ val OnEnter: typingsSlinky.ejWebAll.ej.Grid.FilterBarMode.OnEnter with Double = js.native
  }
  
  @js.native
  object FilterType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.FilterType with Double] = js.native
    
    /* 1 */ val Excel: typingsSlinky.ejWebAll.ej.Grid.FilterType.Excel with Double = js.native
    
    /* 0 */ val Menu: typingsSlinky.ejWebAll.ej.Grid.FilterType.Menu with Double = js.native
  }
  
  @js.native
  object FormPosition extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.FormPosition with Double] = js.native
    
    /* 0 */ val BottomLeft: typingsSlinky.ejWebAll.ej.Grid.FormPosition.BottomLeft with Double = js.native
    
    /* 1 */ val TopRight: typingsSlinky.ejWebAll.ej.Grid.FormPosition.TopRight with Double = js.native
  }
  
  @js.native
  object GridLines extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.GridLines with Double] = js.native
    
    /* 0 */ val Both: typingsSlinky.ejWebAll.ej.Grid.GridLines.Both with Double = js.native
    
    /* 1 */ val Horizontal: typingsSlinky.ejWebAll.ej.Grid.GridLines.Horizontal with Double = js.native
    
    /* 3 */ val None: typingsSlinky.ejWebAll.ej.Grid.GridLines.None with Double = js.native
    
    /* 2 */ val Vertical: typingsSlinky.ejWebAll.ej.Grid.GridLines.Vertical with Double = js.native
  }
  
  @js.native
  object PrintMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.PrintMode with Double] = js.native
    
    /* 0 */ val AllPages: typingsSlinky.ejWebAll.ej.Grid.PrintMode.AllPages with Double = js.native
    
    /* 1 */ val CurrentPage: typingsSlinky.ejWebAll.ej.Grid.PrintMode.CurrentPage with Double = js.native
  }
  
  @js.native
  object ResizeMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.ResizeMode with Double] = js.native
    
    /* 2 */ val Control: typingsSlinky.ejWebAll.ej.Grid.ResizeMode.Control with Double = js.native
    
    /* 1 */ val NextColumn: typingsSlinky.ejWebAll.ej.Grid.ResizeMode.NextColumn with Double = js.native
    
    /* 0 */ val Normal: typingsSlinky.ejWebAll.ej.Grid.ResizeMode.Normal with Double = js.native
  }
  
  @js.native
  object RowPosition extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.RowPosition with Double] = js.native
    
    /* 1 */ val Bottom: typingsSlinky.ejWebAll.ej.Grid.RowPosition.Bottom with Double = js.native
    
    /* 0 */ val Top: typingsSlinky.ejWebAll.ej.Grid.RowPosition.Top with Double = js.native
  }
  
  @js.native
  object SelectionType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.SelectionType with Double] = js.native
    
    /* 1 */ val Multiple: typingsSlinky.ejWebAll.ej.Grid.SelectionType.Multiple with Double = js.native
    
    /* 0 */ val Single: typingsSlinky.ejWebAll.ej.Grid.SelectionType.Single with Double = js.native
  }
  
  @js.native
  object SummaryType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.SummaryType with Double] = js.native
    
    /* 0 */ val Average: typingsSlinky.ejWebAll.ej.Grid.SummaryType.Average with Double = js.native
    
    /* 3 */ val Count: typingsSlinky.ejWebAll.ej.Grid.SummaryType.Count with Double = js.native
    
    /* 5 */ val Custom: typingsSlinky.ejWebAll.ej.Grid.SummaryType.Custom with Double = js.native
    
    /* 7 */ val FalseCount: typingsSlinky.ejWebAll.ej.Grid.SummaryType.FalseCount with Double = js.native
    
    /* 2 */ val Maximum: typingsSlinky.ejWebAll.ej.Grid.SummaryType.Maximum with Double = js.native
    
    /* 1 */ val Minimum: typingsSlinky.ejWebAll.ej.Grid.SummaryType.Minimum with Double = js.native
    
    /* 4 */ val Sum: typingsSlinky.ejWebAll.ej.Grid.SummaryType.Sum with Double = js.native
    
    /* 6 */ val TrueCount: typingsSlinky.ejWebAll.ej.Grid.SummaryType.TrueCount with Double = js.native
  }
  
  @js.native
  object ToolBarItems extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.ToolBarItems with Double] = js.native
    
    /* 0 */ val Add: typingsSlinky.ejWebAll.ej.Grid.ToolBarItems.Add with Double = js.native
    
    /* 4 */ val Cancel: typingsSlinky.ejWebAll.ej.Grid.ToolBarItems.Cancel with Double = js.native
    
    /* 2 */ val Delete: typingsSlinky.ejWebAll.ej.Grid.ToolBarItems.Delete with Double = js.native
    
    /* 1 */ val Edit: typingsSlinky.ejWebAll.ej.Grid.ToolBarItems.Edit with Double = js.native
    
    /* 6 */ val PdfExport: typingsSlinky.ejWebAll.ej.Grid.ToolBarItems.PdfExport with Double = js.native
    
    /* 7 */ val PrintGrid: typingsSlinky.ejWebAll.ej.Grid.ToolBarItems.PrintGrid with Double = js.native
    
    /* 5 */ val Search: typingsSlinky.ejWebAll.ej.Grid.ToolBarItems.Search with Double = js.native
    
    /* 3 */ val Update: typingsSlinky.ejWebAll.ej.Grid.ToolBarItems.Update with Double = js.native
    
    /* 8 */ val WordExport: typingsSlinky.ejWebAll.ej.Grid.ToolBarItems.WordExport with Double = js.native
  }
  
  @js.native
  object UnboundType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.UnboundType with Double] = js.native
    
    /* 3 */ val Cancel: typingsSlinky.ejWebAll.ej.Grid.UnboundType.Cancel with Double = js.native
    
    /* 2 */ val Delete: typingsSlinky.ejWebAll.ej.Grid.UnboundType.Delete with Double = js.native
    
    /* 0 */ val Edit: typingsSlinky.ejWebAll.ej.Grid.UnboundType.Edit with Double = js.native
    
    /* 1 */ val Save: typingsSlinky.ejWebAll.ej.Grid.UnboundType.Save with Double = js.native
  }
  
  @js.native
  object VirtualScrollMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.VirtualScrollMode with Double] = js.native
    
    /* 1 */ val Continuous: typingsSlinky.ejWebAll.ej.Grid.VirtualScrollMode.Continuous with Double = js.native
    
    /* 0 */ val Normal: typingsSlinky.ejWebAll.ej.Grid.VirtualScrollMode.Normal with Double = js.native
  }
  
  @js.native
  object WrapMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Grid.WrapMode with Double] = js.native
    
    /* 0 */ val Both: typingsSlinky.ejWebAll.ej.Grid.WrapMode.Both with Double = js.native
    
    /* 1 */ val Content: typingsSlinky.ejWebAll.ej.Grid.WrapMode.Content with Double = js.native
    
    /* 2 */ val Header: typingsSlinky.ejWebAll.ej.Grid.WrapMode.Header with Double = js.native
  }
}
