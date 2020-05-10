package typingsSlinky.ngTable.ngTableDefaultsMod

import typingsSlinky.ngTable.ngTableParamsMod.IParamValues
import typingsSlinky.ngTable.ngTableSettingsMod.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDefaults extends js.Object {
  var params: js.UndefOr[IParamValues[_]] = js.native
  var settings: js.UndefOr[ISettings[_]] = js.native
}

object IDefaults {
  @scala.inline
  def apply(): IDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDefaults]
  }
  @scala.inline
  implicit class IDefaultsOps[Self <: IDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParams(value: IParamValues[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: ISettings[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
  }
  
}

