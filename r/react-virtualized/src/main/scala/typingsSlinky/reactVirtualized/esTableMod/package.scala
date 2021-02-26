package typingsSlinky.reactVirtualized

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object esTableMod {
  
  @scala.inline
  def SortDirection: typingsSlinky.reactVirtualized.esTableMod.SortDirectionStatic = typingsSlinky.reactVirtualized.esTableMod.^.asInstanceOf[js.Dynamic].selectDynamic("SortDirection").asInstanceOf[typingsSlinky.reactVirtualized.esTableMod.SortDirectionStatic]
  
  type SortDirectionMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reactVirtualized.esTableMod.SortDirectionType]
  
  @scala.inline
  def SortIndicator: slinky.core.ReactComponentClass[typingsSlinky.reactVirtualized.anon.SortDirection] = typingsSlinky.reactVirtualized.esTableMod.^.asInstanceOf[js.Dynamic].selectDynamic("SortIndicator").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactVirtualized.anon.SortDirection]]
  
  type TableCellDataGetter = js.Function1[
    /* params */ typingsSlinky.reactVirtualized.esTableMod.TableCellDataGetterParams, 
    js.Any
  ]
  
  type TableCellRenderer = js.Function1[
    /* props */ typingsSlinky.reactVirtualized.esTableMod.TableCellProps, 
    slinky.core.facade.ReactElement
  ]
  
  type TableHeaderRenderer = js.Function1[
    /* props */ typingsSlinky.reactVirtualized.esTableMod.TableHeaderProps, 
    slinky.core.facade.ReactElement
  ]
  
  type TableHeaderRowRenderer = js.Function1[
    /* props */ typingsSlinky.reactVirtualized.esTableMod.TableHeaderRowProps, 
    slinky.core.facade.ReactElement
  ]
  
  type TableRowRenderer = js.Function1[
    /* props */ typingsSlinky.reactVirtualized.esTableMod.TableRowProps, 
    slinky.core.facade.ReactElement
  ]
  
  @scala.inline
  def createMultiSort(sortCallback: js.Function1[/* params */ typingsSlinky.reactVirtualized.anon.SortBy, scala.Unit]): typingsSlinky.reactVirtualized.esTableMod.MultiSortReturn = typingsSlinky.reactVirtualized.esTableMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMultiSort")(sortCallback.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactVirtualized.esTableMod.MultiSortReturn]
  @scala.inline
  def createMultiSort(
    sortCallback: js.Function1[/* params */ typingsSlinky.reactVirtualized.anon.SortBy, scala.Unit],
    options: typingsSlinky.reactVirtualized.esTableMod.MultiSortOptions
  ): typingsSlinky.reactVirtualized.esTableMod.MultiSortReturn = (typingsSlinky.reactVirtualized.esTableMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMultiSort")(sortCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactVirtualized.esTableMod.MultiSortReturn]
  
  @scala.inline
  def defaultCellDataGetter: typingsSlinky.reactVirtualized.esTableMod.TableCellDataGetter = typingsSlinky.reactVirtualized.esTableMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultCellDataGetter").asInstanceOf[typingsSlinky.reactVirtualized.esTableMod.TableCellDataGetter]
  
  @scala.inline
  def defaultCellRenderer: typingsSlinky.reactVirtualized.esTableMod.TableCellRenderer = typingsSlinky.reactVirtualized.esTableMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultCellRenderer").asInstanceOf[typingsSlinky.reactVirtualized.esTableMod.TableCellRenderer]
  
  @scala.inline
  def defaultHeaderRenderer(): js.Array[slinky.core.facade.ReactElement] = typingsSlinky.reactVirtualized.esTableMod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultHeaderRenderer")().asInstanceOf[js.Array[slinky.core.facade.ReactElement]]
  
  @scala.inline
  def defaultHeaderRowRenderer: typingsSlinky.reactVirtualized.esTableMod.TableHeaderRowRenderer = typingsSlinky.reactVirtualized.esTableMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultHeaderRowRenderer").asInstanceOf[typingsSlinky.reactVirtualized.esTableMod.TableHeaderRowRenderer]
  
  @scala.inline
  def defaultRowRenderer: typingsSlinky.reactVirtualized.esTableMod.TableRowRenderer = typingsSlinky.reactVirtualized.esTableMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultRowRenderer").asInstanceOf[typingsSlinky.reactVirtualized.esTableMod.TableRowRenderer]
}
