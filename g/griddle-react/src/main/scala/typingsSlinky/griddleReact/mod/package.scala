package typingsSlinky.griddleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def ColumnDefinition: org.scalablytyped.runtime.Instantiable0[typingsSlinky.griddleReact.mod.components.ColumnDefinition] = typingsSlinky.griddleReact.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ColumnDefinition").asInstanceOf[org.scalablytyped.runtime.Instantiable0[typingsSlinky.griddleReact.mod.components.ColumnDefinition]]
  
  @scala.inline
  def RowDefinition: org.scalablytyped.runtime.Instantiable0[typingsSlinky.griddleReact.mod.components.RowDefinition] = typingsSlinky.griddleReact.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RowDefinition").asInstanceOf[org.scalablytyped.runtime.Instantiable0[typingsSlinky.griddleReact.mod.components.RowDefinition]]
  
  type ColumnRenderProperties = typingsSlinky.griddleReact.mod.components.ColumnDefinitionProps
  
  type Griddle[T] = slinky.core.ReactComponentClass[typingsSlinky.griddleReact.mod.GriddleProps[T]]
  
  type GriddleComponent[T] = slinky.core.ReactComponentClass[T]
  
  type GriddleFilter = java.lang.String | typingsSlinky.griddleReact.mod.RowFilter | (typingsSlinky.griddleReact.mod.PropertyBag[java.lang.String | typingsSlinky.griddleReact.mod.RowFilter])
  
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
  
  @scala.inline
  def actions: typingsSlinky.griddleReact.mod.GriddleActions = typingsSlinky.griddleReact.mod.^.asInstanceOf[js.Dynamic].selectDynamic("actions").asInstanceOf[typingsSlinky.griddleReact.mod.GriddleActions]
  
  @scala.inline
  def connect: typingsSlinky.reactRedux.mod.Connect_[typingsSlinky.reactRedux.mod.DefaultRootState] = typingsSlinky.griddleReact.mod.^.asInstanceOf[js.Dynamic].selectDynamic("connect").asInstanceOf[typingsSlinky.reactRedux.mod.Connect_[typingsSlinky.reactRedux.mod.DefaultRootState]]
  
  @scala.inline
  def constants: typingsSlinky.griddleReact.mod.PropertyBag[java.lang.String] = typingsSlinky.griddleReact.mod.^.asInstanceOf[js.Dynamic].selectDynamic("constants").asInstanceOf[typingsSlinky.griddleReact.mod.PropertyBag[java.lang.String]]
  
  @scala.inline
  def selectors: typingsSlinky.griddleReact.mod.PropertyBag[typingsSlinky.griddleReact.mod.Selector] = typingsSlinky.griddleReact.mod.^.asInstanceOf[js.Dynamic].selectDynamic("selectors").asInstanceOf[typingsSlinky.griddleReact.mod.PropertyBag[typingsSlinky.griddleReact.mod.Selector]]
  
  @scala.inline
  def settingsComponentObjects: typingsSlinky.griddleReact.mod.PropertyBag[typingsSlinky.griddleReact.mod.SettingsComponentObject] = typingsSlinky.griddleReact.mod.^.asInstanceOf[js.Dynamic].selectDynamic("settingsComponentObjects").asInstanceOf[typingsSlinky.griddleReact.mod.PropertyBag[typingsSlinky.griddleReact.mod.SettingsComponentObject]]
}
