package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRefreshSchemasStatusResponse extends js.Object {
  /**
    * The status of the schema.
    */
  var RefreshSchemasStatus: js.UndefOr[typingsSlinky.awsSdk.dmsMod.RefreshSchemasStatus] = js.native
}

object DescribeRefreshSchemasStatusResponse {
  @scala.inline
  def apply(): DescribeRefreshSchemasStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRefreshSchemasStatusResponse]
  }
  @scala.inline
  implicit class DescribeRefreshSchemasStatusResponseOps[Self <: DescribeRefreshSchemasStatusResponse] (val x: Self) extends AnyVal {
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

