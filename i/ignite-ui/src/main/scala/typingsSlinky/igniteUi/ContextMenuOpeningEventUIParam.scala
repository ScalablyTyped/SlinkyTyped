package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuOpeningEventUIParam extends js.Object {
  /**
  	 * Get the [area](ig.spreadsheet.SpreadsheetContextMenuArea) for which the menu is being displayed.
  	 */
  var menuArea: js.UndefOr[String] = js.native
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object ContextMenuOpeningEventUIParam {
  @scala.inline
  def apply(): ContextMenuOpeningEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuOpeningEventUIParam]
  }
  @scala.inline
  implicit class ContextMenuOpeningEventUIParamOps[Self <: ContextMenuOpeningEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMenuArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuArea")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

