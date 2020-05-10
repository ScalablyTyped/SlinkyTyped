package typingsSlinky.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationOptions extends js.Object {
  /**
    * The page number of results you wish to return
    * @default 1
    */
  var Page: js.UndefOr[Double] = js.native
  /**
    * The number of results to return per page: Max 100;
    * @default 10
    */
  var Per_Page: js.UndefOr[Double] = js.native
}

object PaginationOptions {
  @scala.inline
  def apply(): PaginationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationOptions]
  }
  @scala.inline
  implicit class PaginationOptionsOps[Self <: PaginationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPage(value: Double): Self = {
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
    @scala.inline
    def withPer_Page(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Per_Page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPer_Page: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Per_Page")(js.undefined)
        ret
    }
  }
  
}

