package typingsSlinky.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourceInventoryResponse extends js.Object {
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the resources.
    */
  var ResourceInventoryList: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.ResourceInventoryList] = js.native
}

object ListResourceInventoryResponse {
  @scala.inline
  def apply(): ListResourceInventoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceInventoryResponse]
  }
  @scala.inline
  implicit class ListResourceInventoryResponseOps[Self <: ListResourceInventoryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceInventoryList(value: ResourceInventoryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceInventoryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceInventoryList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceInventoryList")(js.undefined)
        ret
    }
  }
  
}

