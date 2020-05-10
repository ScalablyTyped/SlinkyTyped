package typingsSlinky.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderSettings extends js.Object {
  /** Allows you to enable/disable the column header names in the PivotGrid control.
    * @Default {false}
    */
  var showColumnItems: js.UndefOr[Boolean] = js.native
  /** Allows you to enable/disable the row header names in the PivotGrid control.
    * @Default {false}
    */
  var showRowItems: js.UndefOr[Boolean] = js.native
}

object HeaderSettings {
  @scala.inline
  def apply(): HeaderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderSettings]
  }
  @scala.inline
  implicit class HeaderSettingsOps[Self <: HeaderSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowColumnItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColumnItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnItems")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRowItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRowItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowItems")(js.undefined)
        ret
    }
  }
  
}

