package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.execute_result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of executing a code cell.
  */
@js.native
trait IExecuteResult
  extends IBaseOutput
     with IOutput {
  /**
    * A mime-type keyed dictionary of data.
    */
  var data: IMimeBundle = js.native
  /**
    * A result's prompt number.
    */
  var execution_count: ExecutionCount = js.native
  /**
    * Cell output metadata.
    */
  var metadata: OutputMetadata = js.native
  /**
    * Type of cell output.
    */
  @JSName("output_type")
  var output_type_IExecuteResult: execute_result = js.native
}

object IExecuteResult {
  @scala.inline
  def apply(data: IMimeBundle, metadata: OutputMetadata, output_type: execute_result): IExecuteResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteResult]
  }
  @scala.inline
  implicit class IExecuteResultOps[Self <: IExecuteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: IMimeBundle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: OutputMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput_type(value: execute_result): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_type")(value.asInstanceOf[js.Any])
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

