package typingsSlinky.reactabularTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CellFormatter = js.Function2[
    /* value */ js.Any, 
    /* props */ typingsSlinky.reactabularTable.AnonRowIndex, 
    java.lang.String | slinky.core.facade.ReactElement
  ]
  type CellTransform = js.Function2[
    /* value */ js.Any, 
    /* props */ typingsSlinky.reactabularTable.AnonColumnIndex, 
    js.Any
  ]
  type ColumnFormatter = js.Function2[
    /* label */ java.lang.String | slinky.core.facade.ReactElement, 
    /* props */ typingsSlinky.reactabularTable.AnonRowData, 
    java.lang.String | slinky.core.facade.ReactElement
  ]
  type ColumnTransform = js.Function2[
    /* label */ java.lang.String | slinky.core.facade.ReactElement | typingsSlinky.react.mod.ReactInstance, 
    /* props */ typingsSlinky.reactabularTable.AnonColumn, 
    js.Any
  ]
}
