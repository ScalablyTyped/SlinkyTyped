package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRibbon.ActiveTabChanged event.
  */
@js.native
trait ASPxClientRibbonTabEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the tab object related to the event.
    */
  var tab: ASPxClientRibbonTab = js.native
}

object ASPxClientRibbonTabEventArgs {
  @scala.inline
  def apply(tab: ASPxClientRibbonTab): ASPxClientRibbonTabEventArgs = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonTabEventArgs]
  }
  @scala.inline
  implicit class ASPxClientRibbonTabEventArgsOps[Self <: ASPxClientRibbonTabEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTab(value: ASPxClientRibbonTab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

