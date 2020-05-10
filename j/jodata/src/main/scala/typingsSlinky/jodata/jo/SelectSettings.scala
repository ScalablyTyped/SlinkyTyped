package typingsSlinky.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectSettings extends ISettings {
  var DefaultSelect: js.Array[String] = js.native
  var Select: js.Array[String] = js.native
}

object SelectSettings {
  @scala.inline
  def apply(DefaultSelect: js.Array[String], Select: js.Array[String], isSet: () => Boolean, reset: () => Unit): SelectSettings = {
    val __obj = js.Dynamic.literal(DefaultSelect = DefaultSelect.asInstanceOf[js.Any], Select = Select.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[SelectSettings]
  }
  @scala.inline
  implicit class SelectSettingsOps[Self <: SelectSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultSelect(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

