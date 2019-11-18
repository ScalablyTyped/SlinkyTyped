package typingsSlinky.atMaterialDashUiCore

import slinky.core.ReactComponentClass
import typingsSlinky.atMaterialDashUiCore.tablePaginationTablePaginationActionsMod.TablePaginationActionsProps
import typingsSlinky.react.NativeMouseEvent
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.HTMLAttributes
import typingsSlinky.react.reactMod.MouseEvent
import typingsSlinky.std.HTMLButtonElement
import typingsSlinky.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/TablePagination/TablePaginationActions", JSImport.Namespace)
@js.native
object tablePaginationTablePaginationActionsMod extends js.Object {
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
  
  val default: ReactComponentClass[TablePaginationActionsProps] = js.native
}

