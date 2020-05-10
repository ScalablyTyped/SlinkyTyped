package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteParametersResult extends js.Object {
  /**
    * The names of the deleted parameters.
    */
  var DeletedParameters: js.UndefOr[ParameterNameList] = js.native
  /**
    * The names of parameters that weren't deleted because the parameters are not valid.
    */
  var InvalidParameters: js.UndefOr[ParameterNameList] = js.native
}

object DeleteParametersResult {
  @scala.inline
  def apply(): DeleteParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteParametersResult]
  }
  @scala.inline
  implicit class DeleteParametersResultOps[Self <: DeleteParametersResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedParameters(value: ParameterNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletedParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletedParameters")(js.undefined)
        ret
    }
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
  }
  
}

