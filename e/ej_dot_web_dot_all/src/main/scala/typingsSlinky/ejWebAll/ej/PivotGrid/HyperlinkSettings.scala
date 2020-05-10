package typingsSlinky.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperlinkSettings extends js.Object {
  /** Allows you to enable/disable the hyperlink for the column header.
    * @Default {false}
    */
  var enableColumnHeaderHyperlink: js.UndefOr[Boolean] = js.native
  /** Allows you to enable/disable the hyperlink for the row header.
    * @Default {false}
    */
  var enableRowHeaderHyperlink: js.UndefOr[Boolean] = js.native
  /** Allows you to enable/disable the hyperlink for summary cells.
    * @Default {false}
    */
  var enableSummaryCellHyperlink: js.UndefOr[Boolean] = js.native
  /** Allows you to enable/disable the hyperlink for value cells.
    * @Default {false}
    */
  var enableValueCellHyperlink: js.UndefOr[Boolean] = js.native
}

object HyperlinkSettings {
  @scala.inline
  def apply(): HyperlinkSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperlinkSettings]
  }
  @scala.inline
  implicit class HyperlinkSettingsOps[Self <: HyperlinkSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableColumnHeaderHyperlink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnHeaderHyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnHeaderHyperlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnHeaderHyperlink")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRowHeaderHyperlink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowHeaderHyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowHeaderHyperlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowHeaderHyperlink")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSummaryCellHyperlink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSummaryCellHyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSummaryCellHyperlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSummaryCellHyperlink")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableValueCellHyperlink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableValueCellHyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableValueCellHyperlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableValueCellHyperlink")(js.undefined)
        ret
    }
  }
  
}

