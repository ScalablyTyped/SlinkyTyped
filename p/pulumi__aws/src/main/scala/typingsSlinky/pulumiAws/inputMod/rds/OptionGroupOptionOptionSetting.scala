package typingsSlinky.pulumiAws.inputMod.rds

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroupOptionOptionSetting extends js.Object {
  /**
    * The Name of the setting.
    */
  var name: Input[String] = js.native
  /**
    * The Value of the setting.
    */
  var value: Input[String] = js.native
}

object OptionGroupOptionOptionSetting {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): OptionGroupOptionOptionSetting = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionGroupOptionOptionSetting]
  }
  @scala.inline
  implicit class OptionGroupOptionOptionSettingOps[Self <: OptionGroupOptionOptionSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

