package typingsSlinky.griddleReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ColumnRenderProperties = typingsSlinky.griddleReact.mod.components.ColumnDefinitionProps
  type Griddle[T] = slinky.core.ReactComponentClass[typingsSlinky.griddleReact.mod.GriddleProps[T]]
  type Listener = js.Function3[
    /* prevState */ js.Any, 
    /* nextState */ js.Any, 
    /* otherArgs */ js.UndefOr[js.Any], 
    js.Any
  ]
  type PropertyBag[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Reducer = js.Function2[/* state */ js.Any, /* action */ js.UndefOr[js.Any], scala.Unit]
  type RowFilter = js.Function3[
    /* row */ js.Any, 
    /* index */ scala.Double, 
    /* data */ typingsSlinky.immutable.Immutable.List[js.Any], 
    scala.Boolean
  ]
  type RowRenderProperties = typingsSlinky.griddleReact.mod.components.RowDefinitionProps
  type Selector = js.Function2[/* state */ js.Any, /* props */ js.UndefOr[js.Any], js.Any]
}
