package typingsSlinky.expoFileSystem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Md5 extends js.Object {
  var md5: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[Boolean] = js.native
}

object Md5 {
  @scala.inline
  def apply(): Md5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Md5]
  }
  @scala.inline
  implicit class Md5Ops[Self <: Md5] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMd5(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

