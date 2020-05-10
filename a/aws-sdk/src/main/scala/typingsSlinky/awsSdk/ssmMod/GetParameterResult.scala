package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParameterResult extends js.Object {
  /**
    * Information about a parameter.
    */
  var Parameter: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Parameter] = js.native
}

object GetParameterResult {
  @scala.inline
  def apply(): GetParameterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParameterResult]
  }
  @scala.inline
  implicit class GetParameterResultOps[Self <: GetParameterResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameter(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameter")(js.undefined)
        ret
    }
  }
  
}

