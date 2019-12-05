package typingsSlinky.griddleDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object griddleDashReactMod {
  import org.scalablytyped.runtime.StringDictionary
  import slinky.core.ReactComponentClass
  import typingsSlinky.griddleDashReact.griddleDashReactMod.components.ColumnDefinitionProps
  import typingsSlinky.griddleDashReact.griddleDashReactMod.components.RowDefinitionProps
  import typingsSlinky.immutable.Immutable.List

  type ColumnRenderProperties = ColumnDefinitionProps
  type Griddle[T] = ReactComponentClass[GriddleProps[T]]
  type GriddleComponent[T] = ReactComponentClass[T] | ReactComponentClass[T]
  type GriddleFilter = String | RowFilter | (PropertyBag[String | RowFilter])
  type Listener = js.Function3[
    /* prevState */ js.Any, 
    /* nextState */ js.Any, 
    /* otherArgs */ js.UndefOr[js.Any], 
    js.Any
  ]
  type PropertyBag[T] = StringDictionary[T]
  type Reducer = js.Function2[/* state */ js.Any, /* action */ js.UndefOr[js.Any], Unit]
  type RowFilter = js.Function3[/* row */ js.Any, /* index */ Double, /* data */ List[js.Any], Boolean]
  type RowRenderProperties = RowDefinitionProps
  type Selector = js.Function2[/* state */ js.Any, /* props */ js.UndefOr[js.Any], js.Any]
}
