package typingsSlinky.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchPageResult extends js.Object {
  /**
    * Contains details of the fetched page.
    */
  var Page: js.UndefOr[typingsSlinky.awsSdk.qldbsessionMod.Page] = js.native
}

object FetchPageResult {
  @scala.inline
  def apply(): FetchPageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchPageResult]
  }
  @scala.inline
  implicit class FetchPageResultOps[Self <: FetchPageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPage(value: Page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Page")(js.undefined)
        ret
    }
  }
  
}

