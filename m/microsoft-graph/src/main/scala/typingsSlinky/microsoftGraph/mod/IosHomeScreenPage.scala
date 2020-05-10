package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosHomeScreenPage extends js.Object {
  // Name of the page
  var displayName: js.UndefOr[String] = js.native
  // A list of apps and folders to appear on a page. This collection can contain a maximum of 500 elements.
  var icons: js.UndefOr[js.Array[IosHomeScreenItem]] = js.native
}

object IosHomeScreenPage {
  @scala.inline
  def apply(): IosHomeScreenPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosHomeScreenPage]
  }
  @scala.inline
  implicit class IosHomeScreenPageOps[Self <: IosHomeScreenPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: js.Array[IosHomeScreenItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
  }
  
}

