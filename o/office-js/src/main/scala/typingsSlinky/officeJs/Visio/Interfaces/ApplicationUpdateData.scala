package typingsSlinky.officeJs.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Application object, for use in "application.set({ ... })". */
@js.native
trait ApplicationUpdateData extends js.Object {
  /**
    *
    * Show or hide the iFrame application borders.
    *
    * [Api set:  1.1]
    */
  var showBorders: js.UndefOr[Boolean] = js.native
  /**
    *
    * Show or hide the standard toolbars.
    *
    * [Api set:  1.1]
    */
  var showToolbars: js.UndefOr[Boolean] = js.native
}

object ApplicationUpdateData {
  @scala.inline
  def apply(): ApplicationUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationUpdateData]
  }
  @scala.inline
  implicit class ApplicationUpdateDataOps[Self <: ApplicationUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowBorders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBorders")(js.undefined)
        ret
    }
    @scala.inline
    def withShowToolbars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolbars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowToolbars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolbars")(js.undefined)
        ret
    }
  }
  
}

