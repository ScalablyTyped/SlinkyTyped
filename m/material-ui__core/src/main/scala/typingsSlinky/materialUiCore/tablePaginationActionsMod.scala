package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
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
    def onChangePage(event: SyntheticMouseEvent[HTMLButtonElement], page: Double): Unit = js.native
  }
  
  @js.native
  class default protected ()
    extends Component[TablePaginationActionsProps, js.Object, js.Any] {
    def this(props: TablePaginationActionsProps) = this()
    def this(props: TablePaginationActionsProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ReactComponentClass[TablePaginationActionsProps]]
  
}

