package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterNameValue extends js.Object {
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.native
  /**
    * The value of the parameter.
    */
  var ParameterValue: js.UndefOr[String] = js.native
}

object ParameterNameValue {
  @scala.inline
  def apply(): ParameterNameValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterNameValue]
  }
  @scala.inline
  implicit class ParameterNameValueOps[Self <: ParameterNameValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterValue")(js.undefined)
        ret
    }
  }
  
}

