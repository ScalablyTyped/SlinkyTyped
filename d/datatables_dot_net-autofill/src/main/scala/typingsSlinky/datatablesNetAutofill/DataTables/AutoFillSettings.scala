package typingsSlinky.datatablesNetAutofill.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoFillSettings extends js.Object {
  /*
    * Always ask the end user if an action should be taken or not
    */
  var alwaysAsk: js.UndefOr[Boolean] = js.native
  /*
    * Select the columns that can be auto filled
    */
  var columns: String | js.Array[Double] = js.native
  /*
    *
    * Initial enablement state of AutoFill
    */
  var enable: js.UndefOr[Boolean] = js.native
}

object AutoFillSettings {
  @scala.inline
  def apply(columns: String | js.Array[Double]): AutoFillSettings = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFillSettings]
  }
  @scala.inline
  implicit class AutoFillSettingsOps[Self <: AutoFillSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: String | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlwaysAsk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysAsk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysAsk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysAsk")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
  }
  
}

