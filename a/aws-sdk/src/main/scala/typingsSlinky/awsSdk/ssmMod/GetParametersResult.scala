package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParametersResult extends js.Object {
  /**
    * A list of parameters that are not formatted correctly or do not run during an execution.
    */
  var InvalidParameters: js.UndefOr[ParameterNameList] = js.native
  /**
    * A list of details for a parameter.
    */
  var Parameters: js.UndefOr[ParameterList] = js.native
}

object GetParametersResult {
  @scala.inline
  def apply(): GetParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParametersResult]
  }
  @scala.inline
  implicit class GetParametersResultOps[Self <: GetParametersResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvalidParameters(value: ParameterNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvalidParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvalidParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: ParameterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
  }
  
}

