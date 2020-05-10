package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemediationParameterValue extends js.Object {
  /**
    * The value is dynamic and changes at run-time.
    */
  var ResourceValue: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ResourceValue] = js.native
  /**
    * The value is static and does not change at run-time.
    */
  var StaticValue: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.StaticValue] = js.native
}

object RemediationParameterValue {
  @scala.inline
  def apply(): RemediationParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationParameterValue]
  }
  @scala.inline
  implicit class RemediationParameterValueOps[Self <: RemediationParameterValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceValue(value: ResourceValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticValue(value: StaticValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticValue")(js.undefined)
        ret
    }
  }
  
}

