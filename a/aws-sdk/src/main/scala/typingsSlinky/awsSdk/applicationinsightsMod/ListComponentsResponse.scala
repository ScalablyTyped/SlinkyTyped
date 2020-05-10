package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComponentsResponse extends js.Object {
  /**
    * The list of application components.
    */
  var ApplicationComponentList: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ApplicationComponentList] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListComponentsResponse {
  @scala.inline
  def apply(): ListComponentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComponentsResponse]
  }
  @scala.inline
  implicit class ListComponentsResponseOps[Self <: ListComponentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationComponentList(value: ApplicationComponentList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationComponentList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationComponentList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationComponentList")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
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
  }
  
}

