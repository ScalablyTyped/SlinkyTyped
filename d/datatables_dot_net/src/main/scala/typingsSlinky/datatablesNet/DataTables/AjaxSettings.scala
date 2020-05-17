package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxSettings
  extends typingsSlinky.jquery.JQuery.AjaxSettings[js.Any] {
  /**
    * Data property or manipulation method for table data. Since: 1.10
    */
  var dataSrc: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Array[_]])] = js.native
}

object AjaxSettings {
  @scala.inline
  def apply(): AjaxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxSettings]
  }
  @scala.inline
  implicit class AjaxSettingsOps[Self <: AjaxSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSrcFunction1(value: /* data */ js.Any => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSrc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDataSrc(value: String | (js.Function1[/* data */ js.Any, js.Array[_]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSrc")(js.undefined)
        ret
    }
  }
  
}

