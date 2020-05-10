package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterConstraints extends js.Object {
  /**
    * Whether or not the parameter is required.
    */
  var Required: js.UndefOr[boolean] = js.native
}

object ParameterConstraints {
  @scala.inline
  def apply(): ParameterConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterConstraints]
  }
  @scala.inline
  implicit class ParameterConstraintsOps[Self <: ParameterConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequired(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Required")(js.undefined)
        ret
    }
  }
  
}

