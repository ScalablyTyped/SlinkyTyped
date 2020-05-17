package typingsSlinky.koaRatelimitLru.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Remaining extends js.Object {
  val remaining: js.UndefOr[String] = js.native
  val reset: js.UndefOr[String] = js.native
  val total: js.UndefOr[String] = js.native
}

object Remaining {
  @scala.inline
  def apply(): Remaining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Remaining]
  }
  @scala.inline
  implicit class RemainingOps[Self <: Remaining] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemaining(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemaining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remaining")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
  }
  
}

