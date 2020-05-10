package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable or disable page setup support for printing in Spreadsheet.
    * @Default {true}
    */
  var allowPageSetup: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable page size support for printing in Spreadsheet.
    * @Default {false}
    */
  var allowPageSize: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable print feature in the Spreadsheet.
    * @Default {true}
    */
  var allowPrinting: js.UndefOr[Boolean] = js.native
}

object PrintSettings {
  @scala.inline
  def apply(): PrintSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintSettings]
  }
  @scala.inline
  implicit class PrintSettingsOps[Self <: PrintSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowPageSetup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPageSetup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPageSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPageSetup")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowPageSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowPrinting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPrinting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPrinting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPrinting")(js.undefined)
        ret
    }
  }
  
}

