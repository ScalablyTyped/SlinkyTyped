package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshSchemasResponse extends js.Object {
  /**
    * The status of the refreshed schema.
    */
  var RefreshSchemasStatus: js.UndefOr[typingsSlinky.awsSdk.dmsMod.RefreshSchemasStatus] = js.native
}

object RefreshSchemasResponse {
  @scala.inline
  def apply(): RefreshSchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshSchemasResponse]
  }
  @scala.inline
  implicit class RefreshSchemasResponseOps[Self <: RefreshSchemasResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRefreshSchemasStatus(value: RefreshSchemasStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshSchemasStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshSchemasStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshSchemasStatus")(js.undefined)
        ret
    }
  }
  
}

