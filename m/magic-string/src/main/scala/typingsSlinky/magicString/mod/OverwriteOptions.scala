package typingsSlinky.magicString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverwriteOptions extends js.Object {
  var contentOnly: js.UndefOr[Boolean] = js.native
  var storeName: js.UndefOr[Boolean] = js.native
}

object OverwriteOptions {
  @scala.inline
  def apply(): OverwriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverwriteOptions]
  }
  @scala.inline
  implicit class OverwriteOptionsOps[Self <: OverwriteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeName")(js.undefined)
        ret
    }
  }
  
}

