package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.colDefMod.AbstractColDef
import typingsSlinky.agGrid.columnGroupMod.ColumnGroup
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typingsSlinky.agGrid.originalColumnGroupMod.OriginalColumnGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/headerRendering/cssClassApplier", JSImport.Namespace)
@js.native
object cssClassApplierMod extends js.Object {
  
  @js.native
  class CssClassApplier () extends js.Object
  /* static members */
  @js.native
  object CssClassApplier extends js.Object {
    
    def addColumnClassesFromCollDef(
      classesOrFunc: String,
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: ColumnGroup
    ): Unit = js.native
    def addColumnClassesFromCollDef(
      classesOrFunc: String,
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: OriginalColumnGroup
    ): Unit = js.native
    def addColumnClassesFromCollDef(
      classesOrFunc: js.Array[String],
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: ColumnGroup
    ): Unit = js.native
    def addColumnClassesFromCollDef(
      classesOrFunc: js.Array[String],
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: OriginalColumnGroup
    ): Unit = js.native
    def addColumnClassesFromCollDef(
      classesOrFunc: js.Function1[/* params */ js.Any, String | js.Array[String]],
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: ColumnGroup
    ): Unit = js.native
    def addColumnClassesFromCollDef(
      classesOrFunc: js.Function1[/* params */ js.Any, String | js.Array[String]],
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: OriginalColumnGroup
    ): Unit = js.native
    
    def addHeaderClassesFromColDef(
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: ColumnGroup
    ): Unit = js.native
    
    def addToolPanelClassesFromColDef(
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: OriginalColumnGroup
    ): Unit = js.native
  }
}
