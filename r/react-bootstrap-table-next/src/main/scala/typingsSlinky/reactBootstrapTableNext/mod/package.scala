package typingsSlinky.reactBootstrapTableNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BootstrapTable[T /* <: js.Object */] = slinky.core.ReactComponentClass[typingsSlinky.reactBootstrapTableNext.mod.BootstrapTableProps[T]]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.left
    - typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.center
    - typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.right
    - typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.start
    - typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.end
    - java.lang.String
  */
  type CellAlignment = typingsSlinky.reactBootstrapTableNext.mod._CellAlignment | java.lang.String
  type ColumnFormatter[R, E, C] = js.Function4[
    /* cell */ C, 
    /* row */ R, 
    /* rowIndex */ scala.Double, 
    /* formatExtraData */ E, 
    slinky.core.facade.ReactElement | java.lang.String | scala.Boolean | typingsSlinky.react.mod.ReactText
  ]
  type ColumnSortFunc[T, E /* <: /* keyof T */ java.lang.String */] = js.Function6[
    /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* a */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* b */ js.Any, 
    /* order */ typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.asc | typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.desc, 
    /* dataField */ js.Any, 
    /* rowA */ T, 
    /* rowB */ T, 
    scala.Double
  ]
  type FilterPosition = /* "inline" */ java.lang.String
  type HeaderFormatter[T /* <: js.Object */] = js.Function3[
    /* column */ typingsSlinky.reactBootstrapTableNext.mod.ColumnDescription[T, js.Any], 
    /* colIndex */ scala.Double, 
    /* components */ typingsSlinky.reactBootstrapTableNext.AnonFilterElement, 
    slinky.core.facade.ReactElement | java.lang.String | scala.Double | typingsSlinky.react.mod.ReactText
  ]
  type RowEventHandler[T] = js.Function3[
    /* e */ slinky.core.SyntheticEvent[typingsSlinky.std.Event_, org.scalajs.dom.raw.Element], 
    /* row */ T, 
    /* rowIndex */ scala.Double, 
    scala.Unit
  ]
  type RowSelectionType = /* "radio" */ java.lang.String
  type TableChangeHandler[T] = js.Function2[
    /* type */ typingsSlinky.reactBootstrapTableNext.mod.TableChangeType, 
    /* newState */ typingsSlinky.reactBootstrapTableNext.mod.TableChangeState[T], 
    scala.Unit
  ]
  type TableCheckboxStatus = /* "indeterminate" */ java.lang.String
}
