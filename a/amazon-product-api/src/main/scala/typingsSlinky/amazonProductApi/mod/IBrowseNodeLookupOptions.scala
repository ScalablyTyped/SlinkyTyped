package typingsSlinky.amazonProductApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBrowseNodeLookupOptions extends js.Object {
  var browseNodeId: js.UndefOr[String] = js.native
  var responseGroup: js.UndefOr[String] = js.native
}

object IBrowseNodeLookupOptions {
  @scala.inline
  def apply(): IBrowseNodeLookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBrowseNodeLookupOptions]
  }
  @scala.inline
  implicit class IBrowseNodeLookupOptionsOps[Self <: IBrowseNodeLookupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowseNodeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browseNodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowseNodeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browseNodeId")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseGroup")(js.undefined)
        ret
    }
  }
  
}

