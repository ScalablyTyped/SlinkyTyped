package typingsSlinky.azdata.mod.nb

import typingsSlinky.azdata.azdataStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IErrorResult
  extends ICellOutput
     with Output {
  /**
  			 * Exception name
  			 */
  var ename: String = js.native
  /**
  			 * Exception value
  			 */
  var evalue: String = js.native
  /**
  			 * Type of cell output.
  			 */
  @JSName("output_type")
  var output_type_IErrorResult: error = js.native
  /**
  			 * Stacktrace equivalent
  			 */
  var traceback: js.UndefOr[js.Array[String]] = js.native
}

object IErrorResult {
  @scala.inline
  def apply(ename: String, evalue: String, output_type: error): IErrorResult = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorResult]
  }
  @scala.inline
  implicit class IErrorResultOps[Self <: IErrorResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvalue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput_type(value: error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraceback(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceback")(js.undefined)
        ret
    }
  }
  
}

