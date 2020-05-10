package typingsSlinky.cliInteract.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberOptions extends js.Object {
  var allowNoAnswer: js.UndefOr[Boolean] = js.native
  var requireInteger: js.UndefOr[Boolean] = js.native
}

object NumberOptions {
  @scala.inline
  def apply(): NumberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberOptions]
  }
  @scala.inline
  implicit class NumberOptionsOps[Self <: NumberOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNoAnswer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNoAnswer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNoAnswer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNoAnswer")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireInteger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireInteger")(js.undefined)
        ret
    }
  }
  
}

