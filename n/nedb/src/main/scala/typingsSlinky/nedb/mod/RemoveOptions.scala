package typingsSlinky.nedb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * options only one option for now: multi which allows the removal of multiple documents if set to true. Default is false
  */
@js.native
trait RemoveOptions extends js.Object {
  var multi: js.UndefOr[Boolean] = js.native
}

object RemoveOptions {
  @scala.inline
  def apply(): RemoveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveOptions]
  }
  @scala.inline
  implicit class RemoveOptionsOps[Self <: RemoveOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(js.undefined)
        ret
    }
  }
  
}

