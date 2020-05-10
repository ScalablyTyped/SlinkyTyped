package typingsSlinky.handsontable.mod.Handsontable.copyPaste

import typingsSlinky.handsontable.mod.Handsontable.plugins.PasteModeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var columnsLimit: js.UndefOr[Double] = js.native
  var pasteMode: js.UndefOr[PasteModeType] = js.native
  var rowsLimit: js.UndefOr[Double] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnsLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnsLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteMode(value: PasteModeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsLimit")(js.undefined)
        ret
    }
  }
  
}

