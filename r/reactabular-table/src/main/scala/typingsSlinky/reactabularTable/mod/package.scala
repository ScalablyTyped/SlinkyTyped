package typingsSlinky.reactabularTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CellFormatter = js.Function2[
    /* value */ js.Any, 
    /* props */ typingsSlinky.reactabularTable.anon.RowIndex, 
    java.lang.String | slinky.core.facade.ReactElement
  ]
  type CellTransform = js.Function2[
    /* value */ js.Any, 
    /* props */ typingsSlinky.reactabularTable.anon.ColumnIndex, 
    js.Any
  ]
  type ColumnFormatter = js.Function2[
    /* label */ java.lang.String | slinky.core.facade.ReactElement, 
    /* props */ typingsSlinky.reactabularTable.anon.RowData, 
    java.lang.String | slinky.core.facade.ReactElement
  ]
  type ColumnTransform = js.Function2[
    /* label */ java.lang.String | slinky.core.facade.ReactElement | typingsSlinky.react.mod.ReactInstance, 
    /* props */ typingsSlinky.reactabularTable.anon.Column, 
    js.Any
  ]
}
