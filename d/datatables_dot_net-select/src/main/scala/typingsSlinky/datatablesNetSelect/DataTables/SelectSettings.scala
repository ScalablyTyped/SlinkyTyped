package typingsSlinky.datatablesNetSelect.DataTables

import typingsSlinky.datatablesNetSelect.datatablesNetSelectStrings.api
import typingsSlinky.datatablesNetSelect.datatablesNetSelectStrings.multi
import typingsSlinky.datatablesNetSelect.datatablesNetSelectStrings.multiPlussignshift
import typingsSlinky.datatablesNetSelect.datatablesNetSelectStrings.os
import typingsSlinky.datatablesNetSelect.datatablesNetSelectStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectSettings extends js.Object {
  /*
    * Indicate if the selected items will be removed when clicking outside of the table
    */
  var blurable: js.UndefOr[Boolean] = js.native
  /*
    * Set the class name that will be applied to selected items
    */
  var className: js.UndefOr[String] = js.native
  /*
    * Enable / disable the display for item selection information in the table summary
    */
  var info: js.UndefOr[Boolean] = js.native
  /*
    * Set which table items to select (rows, columns or cells)
    */
  var items: js.UndefOr[String] = js.native
  /*
    * Set the element selector used for mouse event capture to select items
    */
  var selector: js.UndefOr[String] = js.native
  /*
    * Set the selection style for end user interaction with the table
    */
  var style: js.UndefOr[api | single | multi | os | multiPlussignshift] = js.native
}

object SelectSettings {
  @scala.inline
  def apply(): SelectSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectSettings]
  }
  @scala.inline
  implicit class SelectSettingsOps[Self <: SelectSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlurable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurable")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: api | single | multi | os | multiPlussignshift): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

