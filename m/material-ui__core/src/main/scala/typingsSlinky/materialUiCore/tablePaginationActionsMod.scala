package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.MouseEvent
import typingsSlinky.react.mod.NativeMouseEvent
import typingsSlinky.std.HTMLButtonElement
import typingsSlinky.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/TablePagination/TablePaginationActions", JSImport.Namespace)
@js.native
object tablePaginationActionsMod extends js.Object {
  @js.native
  trait TablePaginationActionsProps extends HTMLAttributes[HTMLDivElement] {
    var backIconButtonProps: js.UndefOr[PartialIconButtonProps] = js.native
    var count: Double = js.native
    var nextIconButtonProps: js.UndefOr[PartialIconButtonProps] = js.native
    var page: Double = js.native
    var rowsPerPage: Double = js.native
    def onChangePage(event: Null, page: Double): Unit = js.native
    def onChangePage(event: MouseEvent[HTMLButtonElement, NativeMouseEvent], page: Double): Unit = js.native
  }
  
  @js.native
  class default protected ()
    extends Component[TablePaginationActionsProps, ComponentState, js.Any] {
    def this(props: TablePaginationActionsProps) = this()
    def this(props: TablePaginationActionsProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ComponentType[TablePaginationActionsProps]]
  
}

