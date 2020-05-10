package typingsSlinky.phonegapPluginPush.PhonegapPluginPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoryAction extends js.Object {
  var maybe: js.UndefOr[CategoryActionData] = js.native
  var no: js.UndefOr[CategoryActionData] = js.native
  var yes: js.UndefOr[CategoryActionData] = js.native
}

object CategoryAction {
  @scala.inline
  def apply(): CategoryAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoryAction]
  }
  @scala.inline
  implicit class CategoryActionOps[Self <: CategoryAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaybe(value: CategoryActionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maybe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaybe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maybe")(js.undefined)
        ret
    }
    @scala.inline
    def withNo(value: CategoryActionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no")(js.undefined)
        ret
    }
    @scala.inline
    def withYes(value: CategoryActionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yes")(js.undefined)
        ret
    }
  }
  
}

