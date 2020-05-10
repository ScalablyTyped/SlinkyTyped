package typingsSlinky.gulpJsonValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GulpJsonValidatorOptions extends js.Object {
  var allowDuplicatedKeys: js.UndefOr[Boolean] = js.native
}

object GulpJsonValidatorOptions {
  @scala.inline
  def apply(): GulpJsonValidatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GulpJsonValidatorOptions]
  }
  @scala.inline
  implicit class GulpJsonValidatorOptionsOps[Self <: GulpJsonValidatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDuplicatedKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDuplicatedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDuplicatedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDuplicatedKeys")(js.undefined)
        ret
    }
  }
  
}

