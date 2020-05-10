package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinimumEngineVersionPerAllowedValue extends js.Object {
  /**
    * The allowed value for an option setting.
    */
  var AllowedValue: js.UndefOr[String] = js.native
  /**
    * The minimum DB engine version required for the allowed value.
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.native
}

object MinimumEngineVersionPerAllowedValue {
  @scala.inline
  def apply(): MinimumEngineVersionPerAllowedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimumEngineVersionPerAllowedValue]
  }
  @scala.inline
  implicit class MinimumEngineVersionPerAllowedValueOps[Self <: MinimumEngineVersionPerAllowedValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumEngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumEngineVersion")(js.undefined)
        ret
    }
  }
  
}

