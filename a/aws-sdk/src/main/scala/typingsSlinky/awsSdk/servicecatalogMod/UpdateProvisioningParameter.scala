package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProvisioningParameter extends js.Object {
  /**
    * The parameter key.
    */
  var Key: js.UndefOr[ParameterKey] = js.native
  /**
    * If set to true, Value is ignored and the previous parameter value is kept.
    */
  var UsePreviousValue: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.UsePreviousValue] = js.native
  /**
    * The parameter value.
    */
  var Value: js.UndefOr[ParameterValue] = js.native
}

object UpdateProvisioningParameter {
  @scala.inline
  def apply(): UpdateProvisioningParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProvisioningParameter]
  }
  @scala.inline
  implicit class UpdateProvisioningParameterOps[Self <: UpdateProvisioningParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: ParameterKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePreviousValue(value: UsePreviousValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsePreviousValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePreviousValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsePreviousValue")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: ParameterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

