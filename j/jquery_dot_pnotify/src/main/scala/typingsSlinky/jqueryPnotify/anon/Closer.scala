package typingsSlinky.jqueryPnotify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Closer extends js.Object {
  var closer: js.UndefOr[String] = js.native
  var pin_down: js.UndefOr[String] = js.native
  var pin_up: js.UndefOr[String] = js.native
}

object Closer {
  @scala.inline
  def apply(): Closer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Closer]
  }
  @scala.inline
  implicit class CloserOps[Self <: Closer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closer")(js.undefined)
        ret
    }
    @scala.inline
    def withPin_down(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin_down")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPin_down: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin_down")(js.undefined)
        ret
    }
    @scala.inline
    def withPin_up(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin_up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPin_up: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin_up")(js.undefined)
        ret
    }
  }
  
}

