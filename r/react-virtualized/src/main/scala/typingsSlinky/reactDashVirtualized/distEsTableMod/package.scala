package typingsSlinky.reactDashVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEsTableMod {
  import org.scalablytyped.runtime.StringDictionary
  import slinky.core.TagMod
  import typingsSlinky.reactDashVirtualized.Anon_ArialabelAutoHeightChildren
  import typingsSlinky.reactDashVirtualized.distEsGridMod.GridCoreProps

  type SortDirectionMap = StringDictionary[SortDirectionType]
  type TableCellDataGetter = js.Function1[/* params */ TableCellDataGetterParams, js.Any]
  type TableCellRenderer = js.Function1[/* props */ TableCellProps, TagMod[Any]]
  type TableHeaderRenderer = js.Function1[/* props */ TableHeaderProps, TagMod[Any]]
  type TableHeaderRowRenderer = js.Function1[/* props */ TableHeaderRowProps, TagMod[Any]]
  type TableProps = GridCoreProps with Anon_ArialabelAutoHeightChildren
  type TableRowRenderer = js.Function1[/* props */ TableRowProps, TagMod[Any]]
}
