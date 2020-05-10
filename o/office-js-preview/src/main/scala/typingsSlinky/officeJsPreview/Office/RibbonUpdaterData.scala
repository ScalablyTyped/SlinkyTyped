package typingsSlinky.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies changes to the ribbon, such as the enabled or disabled status of a button.
  */
@js.native
trait RibbonUpdaterData extends js.Object {
  /**
    * Collection of tabs whose state is set with the call of `requestUpdate`.
    */
  var tabs: js.Array[Tab] = js.native
}

object RibbonUpdaterData {
  @scala.inline
  def apply(tabs: js.Array[Tab]): RibbonUpdaterData = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RibbonUpdaterData]
  }
  @scala.inline
  implicit class RibbonUpdaterDataOps[Self <: RibbonUpdaterData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTabs(value: js.Array[Tab]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

