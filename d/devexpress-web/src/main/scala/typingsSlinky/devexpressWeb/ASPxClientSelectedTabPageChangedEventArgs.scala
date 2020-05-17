package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.SelectedTabPageChanged event.
  */
@js.native
trait ASPxClientSelectedTabPageChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the tab page that was selected.
    */
  var PreviousPage: String = js.native
  /**
    * Gets the tab page that is selected.
    */
  var SelectedPage: String = js.native
  /**
    * Gets the name of the tab container that contains the selected tab page.
    */
  var TabContainerName: String = js.native
}

object ASPxClientSelectedTabPageChangedEventArgs {
  @scala.inline
  def apply(PreviousPage: String, SelectedPage: String, TabContainerName: String): ASPxClientSelectedTabPageChangedEventArgs = {
    val __obj = js.Dynamic.literal(PreviousPage = PreviousPage.asInstanceOf[js.Any], SelectedPage = SelectedPage.asInstanceOf[js.Any], TabContainerName = TabContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSelectedTabPageChangedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientSelectedTabPageChangedEventArgsOps[Self <: ASPxClientSelectedTabPageChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreviousPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabContainerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabContainerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

