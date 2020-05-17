package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import typingsSlinky.jupyterlabCoreutils.anon.PartialICodeCellMetadata
import typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A code cell.
  */
@js.native
trait ICodeCell
  extends IBaseCell
     with ICell {
  /**
    * String identifying the type of cell.
    */
  @JSName("cell_type")
  var cell_type_ICodeCell: code = js.native
  /**
    * The code cell's prompt number. Will be null if the cell has not been run.
    */
  var execution_count: ExecutionCount = js.native
  /**
    * Cell-level metadata.
    */
  @JSName("metadata")
  var metadata_ICodeCell: PartialICodeCellMetadata = js.native
  /**
    * Execution, display, or stream outputs.
    */
  var outputs: js.Array[IOutput] = js.native
}

object ICodeCell {
  @scala.inline
  def apply(
    cell_type: code,
    metadata: PartialICodeCellMetadata,
    outputs: js.Array[IOutput],
    source: MultilineString
  ): ICodeCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeCell]
  }
  @scala.inline
  implicit class ICodeCellOps[Self <: ICodeCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCell_type(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: PartialICodeCellMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputs(value: js.Array[IOutput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecution_count(value: ExecutionCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecution_countNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution_count")(null)
        ret
    }
  }
  
}

