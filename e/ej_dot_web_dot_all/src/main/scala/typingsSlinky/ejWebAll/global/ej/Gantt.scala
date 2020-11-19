package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Gantt")
@js.native
class Gantt protected ()
  extends typingsSlinky.ejWebAll.ej.Gantt {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Gantt.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Gantt.Model) = this()
}
/* static members */
@JSGlobal("ej.Gantt")
@js.native
object Gantt extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.Gantt = js.native
  
  @js.native
  object BeginEditAction extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Gantt.BeginEditAction with Double] = js.native
    
    /* 1 */ val Click: typingsSlinky.ejWebAll.ej.Gantt.BeginEditAction.Click with Double = js.native
    
    /* 0 */ val DblClick: typingsSlinky.ejWebAll.ej.Gantt.BeginEditAction.DblClick with Double = js.native
  }
  
  @js.native
  object DurationUnit extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Gantt.DurationUnit with Double] = js.native
    
    /* 0 */ val Day: typingsSlinky.ejWebAll.ej.Gantt.DurationUnit.Day with Double = js.native
    
    /* 1 */ val Hour: typingsSlinky.ejWebAll.ej.Gantt.DurationUnit.Hour with Double = js.native
    
    /* 2 */ val Minute: typingsSlinky.ejWebAll.ej.Gantt.DurationUnit.Minute with Double = js.native
  }
  
  @js.native
  object RowPosition extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Gantt.RowPosition with Double] = js.native
    
    /* 2 */ val AboveSelectedRow: typingsSlinky.ejWebAll.ej.Gantt.RowPosition.AboveSelectedRow with Double = js.native
    
    /* 3 */ val BelowSelectedRow: typingsSlinky.ejWebAll.ej.Gantt.RowPosition.BelowSelectedRow with Double = js.native
    
    /* 1 */ val Bottom: typingsSlinky.ejWebAll.ej.Gantt.RowPosition.Bottom with Double = js.native
    
    /* 4 */ val Child: typingsSlinky.ejWebAll.ej.Gantt.RowPosition.Child with Double = js.native
    
    /* 0 */ val Top: typingsSlinky.ejWebAll.ej.Gantt.RowPosition.Top with Double = js.native
  }
  
  @js.native
  object ScheduleHeaderType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Gantt.ScheduleHeaderType with Double] = js.native
    
    /* 3 */ val Day: typingsSlinky.ejWebAll.ej.Gantt.ScheduleHeaderType.Day with Double = js.native
    
    /* 4 */ val Hour: typingsSlinky.ejWebAll.ej.Gantt.ScheduleHeaderType.Hour with Double = js.native
    
    /* 1 */ val Month: typingsSlinky.ejWebAll.ej.Gantt.ScheduleHeaderType.Month with Double = js.native
    
    /* 2 */ val Week: typingsSlinky.ejWebAll.ej.Gantt.ScheduleHeaderType.Week with Double = js.native
    
    /* 0 */ val Year: typingsSlinky.ejWebAll.ej.Gantt.ScheduleHeaderType.Year with Double = js.native
  }
  
  @js.native
  object SelectionMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Gantt.SelectionMode with Double] = js.native
    
    /* 1 */ val Cell: typingsSlinky.ejWebAll.ej.Gantt.SelectionMode.Cell with Double = js.native
    
    /* 0 */ val Row: typingsSlinky.ejWebAll.ej.Gantt.SelectionMode.Row with Double = js.native
  }
  
  @js.native
  object SelectionType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Gantt.SelectionType with Double] = js.native
    
    /* 1 */ val Multiple: typingsSlinky.ejWebAll.ej.Gantt.SelectionType.Multiple with Double = js.native
    
    /* 0 */ val Single: typingsSlinky.ejWebAll.ej.Gantt.SelectionType.Single with Double = js.native
  }
  
  @js.native
  object TaskSchedulingMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Gantt.TaskSchedulingMode with Double] = js.native
    
    /* 0 */ val Auto: typingsSlinky.ejWebAll.ej.Gantt.TaskSchedulingMode.Auto with Double = js.native
    
    /* 2 */ val Custom: typingsSlinky.ejWebAll.ej.Gantt.TaskSchedulingMode.Custom with Double = js.native
    
    /* 1 */ val Manual: typingsSlinky.ejWebAll.ej.Gantt.TaskSchedulingMode.Manual with Double = js.native
  }
  
  @js.native
  object TaskType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Gantt.TaskType with Double] = js.native
    
    /* 2 */ val FixedDuration: typingsSlinky.ejWebAll.ej.Gantt.TaskType.FixedDuration with Double = js.native
    
    /* 0 */ val FixedUnit: typingsSlinky.ejWebAll.ej.Gantt.TaskType.FixedUnit with Double = js.native
    
    /* 1 */ val FixedWork: typingsSlinky.ejWebAll.ej.Gantt.TaskType.FixedWork with Double = js.native
  }
  
  @js.native
  object TimescaleRoundMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Gantt.TimescaleRoundMode with Double] = js.native
    
    /* 0 */ val Auto: typingsSlinky.ejWebAll.ej.Gantt.TimescaleRoundMode.Auto with Double = js.native
    
    /* 2 */ val Month: typingsSlinky.ejWebAll.ej.Gantt.TimescaleRoundMode.Month with Double = js.native
    
    /* 1 */ val Week: typingsSlinky.ejWebAll.ej.Gantt.TimescaleRoundMode.Week with Double = js.native
    
    /* 3 */ val Year: typingsSlinky.ejWebAll.ej.Gantt.TimescaleRoundMode.Year with Double = js.native
  }
  
  @js.native
  object ToolbarItems extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Gantt.ToolbarItems with Double] = js.native
    
    /* 0 */ val Add: typingsSlinky.ejWebAll.ej.Gantt.ToolbarItems.Add with Double = js.native
    
    /* 4 */ val Cancel: typingsSlinky.ejWebAll.ej.Gantt.ToolbarItems.Cancel with Double = js.native
    
    /* 9 */ val CollapseAll: typingsSlinky.ejWebAll.ej.Gantt.ToolbarItems.CollapseAll with Double = js.native
    
    /* 12 */ val CriticalPath: typingsSlinky.ejWebAll.ej.Gantt.ToolbarItems.CriticalPath with Double = js.native
    
    /* 2 */ val Delete: typingsSlinky.ejWebAll.ej.Gantt.ToolbarItems.Delete with Double = js.native
    
    /* 1 */ val Edit: typingsSlinky.ejWebAll.ej.Gantt.ToolbarItems.Edit with Double = js.native
    
    /* 13 */ val ExcelExport: typingsSlinky.ejWebAll.ej.Gantt.ToolbarItems.ExcelExport with Double = js.native
    
    /* 8 */ val ExpandAll: typingsSlinky.ejWebAll.ej.Gantt.ToolbarItems.ExpandAll with Double = js.native
    
    /* 6 */ val Indent: typingsSlinky.ejWebAll.ej.Gantt.ToolbarItems.Indent with Double = js.native
    
    /* 11 */ val NextTimeSpan: typingsSlinky.ejWebAll.ej.Gantt.ToolbarItems.NextTimeSpan with Double = js.native
    
    /* 7 */ val Outdent: typingsSlinky.ejWebAll.ej.Gantt.ToolbarItems.Outdent with Double = js.native
    
    /* 14 */ val PdfExport: typingsSlinky.ejWebAll.ej.Gantt.ToolbarItems.PdfExport with Double = js.native
    
    /* 10 */ val PrevTimeSpan: typingsSlinky.ejWebAll.ej.Gantt.ToolbarItems.PrevTimeSpan with Double = js.native
    
    /* 5 */ val Search: typingsSlinky.ejWebAll.ej.Gantt.ToolbarItems.Search with Double = js.native
    
    /* 3 */ val Update: typingsSlinky.ejWebAll.ej.Gantt.ToolbarItems.Update with Double = js.native
  }
  
  @js.native
  object ViewType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Gantt.ViewType with Double] = js.native
    
    /* 2 */ val HistogramView: typingsSlinky.ejWebAll.ej.Gantt.ViewType.HistogramView with Double = js.native
    
    /* 0 */ val ProjectView: typingsSlinky.ejWebAll.ej.Gantt.ViewType.ProjectView with Double = js.native
    
    /* 1 */ val ResourceView: typingsSlinky.ejWebAll.ej.Gantt.ViewType.ResourceView with Double = js.native
  }
  
  @js.native
  object WorkUnit extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Gantt.WorkUnit with Double] = js.native
    
    /* 0 */ val Day: typingsSlinky.ejWebAll.ej.Gantt.WorkUnit.Day with Double = js.native
    
    /* 1 */ val Hour: typingsSlinky.ejWebAll.ej.Gantt.WorkUnit.Hour with Double = js.native
    
    /* 2 */ val Minute: typingsSlinky.ejWebAll.ej.Gantt.WorkUnit.Minute with Double = js.native
  }
  
  @js.native
  object minutesPerInterval extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Gantt.minutesPerInterval with Double] = js.native
    
    /* 0 */ val Auto: typingsSlinky.ejWebAll.ej.Gantt.minutesPerInterval.Auto with Double = js.native
    
    /* 3 */ val FifteenMinutes: typingsSlinky.ejWebAll.ej.Gantt.minutesPerInterval.FifteenMinutes with Double = js.native
    
    /* 2 */ val FiveMinutes: typingsSlinky.ejWebAll.ej.Gantt.minutesPerInterval.FiveMinutes with Double = js.native
    
    /* 1 */ val OneMinute: typingsSlinky.ejWebAll.ej.Gantt.minutesPerInterval.OneMinute with Double = js.native
    
    /* 4 */ val ThirtyMinutes: typingsSlinky.ejWebAll.ej.Gantt.minutesPerInterval.ThirtyMinutes with Double = js.native
  }
  
  @js.native
  object workingTimeScale extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Gantt.workingTimeScale with Double] = js.native
    
    /* 1 */ val TimeScale24Hours: typingsSlinky.ejWebAll.ej.Gantt.workingTimeScale.TimeScale24Hours with Double = js.native
    
    /* 0 */ val TimeScale8Hours: typingsSlinky.ejWebAll.ej.Gantt.workingTimeScale.TimeScale8Hours with Double = js.native
  }
}
