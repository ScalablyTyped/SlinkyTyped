package typingsSlinky.knockoutPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutPagedOptions extends js.Object {
  var pageGenerator: js.UndefOr[String] = js.native
  var pageNumber: js.UndefOr[Double] = js.native
  var pageSize: js.UndefOr[Double] = js.native
}

object KnockoutPagedOptions {
  @scala.inline
  def apply(): KnockoutPagedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutPagedOptions]
  }
  @scala.inline
  implicit class KnockoutPagedOptionsOps[Self <: KnockoutPagedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageGenerator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageGenerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageGenerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageGenerator")(js.undefined)
        ret
    }
    @scala.inline
    def withPageNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
  }
  
}

