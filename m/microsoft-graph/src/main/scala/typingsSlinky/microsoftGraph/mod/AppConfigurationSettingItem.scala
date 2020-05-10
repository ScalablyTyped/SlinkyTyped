package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppConfigurationSettingItem extends js.Object {
  // app configuration key.
  var appConfigKey: js.UndefOr[String] = js.native
  // app configuration key type. Possible values are: stringType, integerType, realType, booleanType, tokenType.
  var appConfigKeyType: js.UndefOr[MdmAppConfigKeyType] = js.native
  // app configuration key value.
  var appConfigKeyValue: js.UndefOr[String] = js.native
}

object AppConfigurationSettingItem {
  @scala.inline
  def apply(): AppConfigurationSettingItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppConfigurationSettingItem]
  }
  @scala.inline
  implicit class AppConfigurationSettingItemOps[Self <: AppConfigurationSettingItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppConfigKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appConfigKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppConfigKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appConfigKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAppConfigKeyType(value: MdmAppConfigKeyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appConfigKeyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppConfigKeyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appConfigKeyType")(js.undefined)
        ret
    }
    @scala.inline
    def withAppConfigKeyValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appConfigKeyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppConfigKeyValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appConfigKeyValue")(js.undefined)
        ret
    }
  }
  
}

