package typingsSlinky.satnav

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISatnavOptions extends js.Object {
  var force: js.UndefOr[Boolean] = js.native
  var html5: js.UndefOr[Boolean] = js.native
  var matchAll: js.UndefOr[Boolean] = js.native
  var poll: js.UndefOr[Double] = js.native
}

object ISatnavOptions {
  @scala.inline
  def apply(): ISatnavOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISatnavOptions]
  }
  @scala.inline
  implicit class ISatnavOptionsOps[Self <: ISatnavOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml5(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchAll")(js.undefined)
        ret
    }
    @scala.inline
    def withPoll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poll")(js.undefined)
        ret
    }
  }
  
}

