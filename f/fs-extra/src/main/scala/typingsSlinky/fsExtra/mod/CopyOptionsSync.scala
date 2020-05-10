package typingsSlinky.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyOptionsSync extends CopyOptions {
  @JSName("filter")
  var filter_CopyOptionsSync: js.UndefOr[CopyFilterSync] = js.native
}

object CopyOptionsSync {
  @scala.inline
  def apply(): CopyOptionsSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptionsSync]
  }
  @scala.inline
  implicit class CopyOptionsSyncOps[Self <: CopyOptionsSync] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: (/* src */ String, /* dest */ String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
  }
  
}

