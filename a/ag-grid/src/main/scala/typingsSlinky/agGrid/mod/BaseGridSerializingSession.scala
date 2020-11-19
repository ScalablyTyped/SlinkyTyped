package typingsSlinky.agGrid.mod

import typingsSlinky.agGrid.exportParamsMod.ProcessCellForExportParams
import typingsSlinky.agGrid.exportParamsMod.ProcessHeaderForExportParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid", "BaseGridSerializingSession")
@js.native
abstract class BaseGridSerializingSession[T] protected ()
  extends typingsSlinky.agGrid.gridSerializerMod.BaseGridSerializingSession[T] {
  def this(
    columnController: typingsSlinky.agGrid.columnControllerMod.ColumnController,
    valueService: typingsSlinky.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
  ) = this()
  def this(
    columnController: typingsSlinky.agGrid.columnControllerMod.ColumnController,
    valueService: typingsSlinky.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String]
  ) = this()
  def this(
    columnController: typingsSlinky.agGrid.columnControllerMod.ColumnController,
    valueService: typingsSlinky.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.UndefOr[scala.Nothing],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String]
  ) = this()
  def this(
    columnController: typingsSlinky.agGrid.columnControllerMod.ColumnController,
    valueService: typingsSlinky.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String]
  ) = this()
  def this(
    columnController: typingsSlinky.agGrid.columnControllerMod.ColumnController,
    valueService: typingsSlinky.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.UndefOr[scala.Nothing],
    processHeaderCallback: js.UndefOr[scala.Nothing],
    cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
  ) = this()
  def this(
    columnController: typingsSlinky.agGrid.columnControllerMod.ColumnController,
    valueService: typingsSlinky.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.UndefOr[scala.Nothing],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String],
    cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
  ) = this()
  def this(
    columnController: typingsSlinky.agGrid.columnControllerMod.ColumnController,
    valueService: typingsSlinky.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
    processHeaderCallback: js.UndefOr[scala.Nothing],
    cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
  ) = this()
  def this(
    columnController: typingsSlinky.agGrid.columnControllerMod.ColumnController,
    valueService: typingsSlinky.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String],
    cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
  ) = this()
}
