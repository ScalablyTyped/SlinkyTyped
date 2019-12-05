package typingsSlinky.agDashGrid.agDashGridMod

import typingsSlinky.agDashGrid.distLibExportParamsMod.ProcessCellForExportParams
import typingsSlinky.agDashGrid.distLibExportParamsMod.ProcessHeaderForExportParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "BaseGridSerializingSession")
@js.native
abstract class BaseGridSerializingSession[T] protected ()
  extends typingsSlinky.agDashGrid.distLibGridSerializerMod.BaseGridSerializingSession[T] {
  def this(
    columnController: typingsSlinky.agDashGrid.distLibColumnControllerColumnControllerMod.ColumnController,
    valueService: typingsSlinky.agDashGrid.distLibValueServiceValueServiceMod.ValueService,
    gridOptionsWrapper: typingsSlinky.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper
  ) = this()
  def this(
    columnController: typingsSlinky.agDashGrid.distLibColumnControllerColumnControllerMod.ColumnController,
    valueService: typingsSlinky.agDashGrid.distLibValueServiceValueServiceMod.ValueService,
    gridOptionsWrapper: typingsSlinky.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String]
  ) = this()
  def this(
    columnController: typingsSlinky.agDashGrid.distLibColumnControllerColumnControllerMod.ColumnController,
    valueService: typingsSlinky.agDashGrid.distLibValueServiceValueServiceMod.ValueService,
    gridOptionsWrapper: typingsSlinky.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String]
  ) = this()
  def this(
    columnController: typingsSlinky.agDashGrid.distLibColumnControllerColumnControllerMod.ColumnController,
    valueService: typingsSlinky.agDashGrid.distLibValueServiceValueServiceMod.ValueService,
    gridOptionsWrapper: typingsSlinky.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String],
    cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
  ) = this()
}

