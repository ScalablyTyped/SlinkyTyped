package typingsSlinky.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueAxisSettingsFont extends js.Object {
  /** Text in axis render with the specified size.
    * @Default {0px}
    */
  var size: js.UndefOr[String] = js.native
}

object ValueAxisSettingsFont {
  @scala.inline
  def apply(): ValueAxisSettingsFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueAxisSettingsFont]
  }
  @scala.inline
  implicit class ValueAxisSettingsFontOps[Self <: ValueAxisSettingsFont] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

