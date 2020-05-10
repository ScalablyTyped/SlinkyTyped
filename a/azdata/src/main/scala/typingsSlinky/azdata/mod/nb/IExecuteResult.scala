package typingsSlinky.azdata.mod.nb

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.azdata.azdataStrings.execute_result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExecuteResult
  extends IDisplayResult
     with Output {
  /**
  			 * Number of times the cell was executed
  			 */
  var execution_count: Double = js.native
  /**
  			 * Type of cell output.
  			 */
  @JSName("output_type")
  var output_type_IExecuteResult: execute_result = js.native
}

object IExecuteResult {
  @scala.inline
  def apply(data: StringDictionary[js.Any], execution_count: Double, output_type: execute_result): IExecuteResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], execution_count = execution_count.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteResult]
  }
  @scala.inline
  implicit class IExecuteResultOps[Self <: IExecuteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecution_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput_type(value: execute_result): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

