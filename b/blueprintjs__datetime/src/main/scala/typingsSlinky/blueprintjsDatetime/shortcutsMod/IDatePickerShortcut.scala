package typingsSlinky.blueprintjsDatetime.shortcutsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePickerShortcut extends IDateShortcutBase {
  /**
    * Date represented by this shortcut. Note that time components of a
    * shortcut are ignored by default; set `includeTime: true` to respect them.
    */
  var date: js.Date = js.native
}

object IDatePickerShortcut {
  @scala.inline
  def apply(date: js.Date, label: String): IDatePickerShortcut = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerShortcut]
  }
  @scala.inline
  implicit class IDatePickerShortcutOps[Self <: IDatePickerShortcut] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

