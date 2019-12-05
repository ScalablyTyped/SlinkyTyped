package typingsSlinky.reactabularDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactabularDashTableMod {
  import typingsSlinky.react.reactMod.ReactInstance
  import typingsSlinky.react.reactMod._Global_.JSX.Element
  import typingsSlinky.reactabularDashTable.Anon_Column
  import typingsSlinky.reactabularDashTable.Anon_ColumnColumnIndex
  import typingsSlinky.reactabularDashTable.Anon_ColumnColumnIndexRowData
  import typingsSlinky.reactabularDashTable.Anon_ColumnColumnIndexRowDataRowIndex

  type CellFormatter = js.Function2[
    /* value */ js.Any, 
    /* props */ Anon_ColumnColumnIndexRowDataRowIndex, 
    String | Element
  ]
  type CellTransform = js.Function2[/* value */ js.Any, /* props */ Anon_ColumnColumnIndex, js.Any]
  type ColumnFormatter = js.Function2[
    /* label */ String | Element, 
    /* props */ Anon_ColumnColumnIndexRowData, 
    String | Element
  ]
  type ColumnTransform = js.Function2[/* label */ String | Element | ReactInstance, /* props */ Anon_Column, js.Any]
}
