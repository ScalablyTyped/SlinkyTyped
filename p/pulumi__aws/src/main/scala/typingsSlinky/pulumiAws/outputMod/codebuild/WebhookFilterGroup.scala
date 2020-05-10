package typingsSlinky.pulumiAws.outputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookFilterGroup extends js.Object {
  /**
    * A webhook filter for the group. Filter blocks are documented below.
    */
  var filters: js.UndefOr[js.Array[WebhookFilterGroupFilter]] = js.native
}

object WebhookFilterGroup {
  @scala.inline
  def apply(): WebhookFilterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookFilterGroup]
  }
  @scala.inline
  implicit class WebhookFilterGroupOps[Self <: WebhookFilterGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: js.Array[WebhookFilterGroupFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
  }
  
}

