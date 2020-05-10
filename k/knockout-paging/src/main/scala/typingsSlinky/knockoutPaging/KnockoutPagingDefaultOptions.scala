package typingsSlinky.knockoutPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutPagingDefaultOptions extends js.Object {
  var pageNumber: Double = js.native
  var pageSize: Double = js.native
}

object KnockoutPagingDefaultOptions {
  @scala.inline
  def apply(pageNumber: Double, pageSize: Double): KnockoutPagingDefaultOptions = {
    val __obj = js.Dynamic.literal(pageNumber = pageNumber.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutPagingDefaultOptions]
  }
  @scala.inline
  implicit class KnockoutPagingDefaultOptionsOps[Self <: KnockoutPagingDefaultOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

