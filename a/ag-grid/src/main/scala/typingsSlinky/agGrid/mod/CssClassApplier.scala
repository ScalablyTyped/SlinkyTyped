package typingsSlinky.agGrid.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.colDefMod.AbstractColDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "CssClassApplier")
@js.native
class CssClassApplier ()
  extends typingsSlinky.agGrid.cssClassApplierMod.CssClassApplier

/* static members */
@JSImport("ag-grid", "CssClassApplier")
@js.native
object CssClassApplier extends js.Object {
  def addColumnClassesFromCollDef(
    classesOrFunc: String,
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typingsSlinky.agGrid.columnMod.Column,
    columnGroup: typingsSlinky.agGrid.columnGroupMod.ColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: String,
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typingsSlinky.agGrid.columnMod.Column,
    columnGroup: typingsSlinky.agGrid.originalColumnGroupMod.OriginalColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Array[String],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typingsSlinky.agGrid.columnMod.Column,
    columnGroup: typingsSlinky.agGrid.columnGroupMod.ColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Array[String],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typingsSlinky.agGrid.columnMod.Column,
    columnGroup: typingsSlinky.agGrid.originalColumnGroupMod.OriginalColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Function1[/* params */ js.Any, String | js.Array[String]],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typingsSlinky.agGrid.columnMod.Column,
    columnGroup: typingsSlinky.agGrid.columnGroupMod.ColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Function1[/* params */ js.Any, String | js.Array[String]],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typingsSlinky.agGrid.columnMod.Column,
    columnGroup: typingsSlinky.agGrid.originalColumnGroupMod.OriginalColumnGroup
  ): Unit = js.native
  def addHeaderClassesFromColDef(
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typingsSlinky.agGrid.columnMod.Column,
    columnGroup: typingsSlinky.agGrid.columnGroupMod.ColumnGroup
  ): Unit = js.native
  def addToolPanelClassesFromColDef(
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typingsSlinky.agGrid.columnMod.Column,
    columnGroup: typingsSlinky.agGrid.originalColumnGroupMod.OriginalColumnGroup
  ): Unit = js.native
}

