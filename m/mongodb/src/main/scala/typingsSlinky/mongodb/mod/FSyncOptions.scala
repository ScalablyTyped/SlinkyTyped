package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FSyncOptions extends CommonOptions {
  var fsync: js.UndefOr[Boolean] = js.native
}

object FSyncOptions {
  @scala.inline
  def apply(): FSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FSyncOptions]
  }
  @scala.inline
  implicit class FSyncOptionsOps[Self <: FSyncOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsync")(js.undefined)
        ret
    }
  }
  
}

