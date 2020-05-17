package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ascending extends js.Object {
  var ascending: js.UndefOr[js.Any] = js.native
  var contract: js.UndefOr[js.Any] = js.native
  var descending: js.UndefOr[js.Any] = js.native
  var expand: js.UndefOr[js.Any] = js.native
}

object Ascending {
  @scala.inline
  def apply(): Ascending = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ascending]
  }
  @scala.inline
  implicit class AscendingOps[Self <: Ascending] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscending(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAscending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascending")(js.undefined)
        ret
    }
    @scala.inline
    def withContract(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contract")(js.undefined)
        ret
    }
    @scala.inline
    def withDescending(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descending")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
  }
  
}

