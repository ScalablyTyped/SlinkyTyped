package typingsSlinky.officeUiFabricReact.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "buildColumns")
@js.native
object buildColumns extends js.Object {
  def apply(
    items: js.Array[_],
    canResizeColumns: js.UndefOr[Boolean],
    onColumnClick: js.UndefOr[
      js.Function2[/* ev */ SyntheticMouseEvent[HTMLElement], /* column */ IColumn, Unit]
    ],
    sortedColumnKey: js.UndefOr[String],
    isSortedDescending: js.UndefOr[Boolean],
    groupedColumnKey: js.UndefOr[String],
    isMultiline: js.UndefOr[Boolean]
  ): js.Array[IColumn] = js.native
}

