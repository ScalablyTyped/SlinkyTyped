package typingsSlinky.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayUniqueOptions extends js.Object {
  var ignoreUndefined: js.UndefOr[Boolean] = js.native
}

object ArrayUniqueOptions {
  @scala.inline
  def apply(): ArrayUniqueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayUniqueOptions]
  }
  @scala.inline
  implicit class ArrayUniqueOptionsOps[Self <: ArrayUniqueOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreUndefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUndefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUndefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUndefined")(js.undefined)
        ret
    }
  }
  
}

