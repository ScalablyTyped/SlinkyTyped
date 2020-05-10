package typingsSlinky.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Setting object, for use in "setting.set({ ... })". */
@js.native
trait SettingUpdateData extends js.Object {
  /**
    *
    * Gets or sets the value of the setting.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var value: js.UndefOr[js.Any] = js.native
}

object SettingUpdateData {
  @scala.inline
  def apply(): SettingUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingUpdateData]
  }
  @scala.inline
  implicit class SettingUpdateDataOps[Self <: SettingUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

