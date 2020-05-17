package typingsSlinky.passportWindowsauth.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailAfter extends js.Object {
  var failAfter: js.UndefOr[Double] = js.native
  var initialDelay: js.UndefOr[Double] = js.native
  var maxDelay: js.UndefOr[Double] = js.native
}

object FailAfter {
  @scala.inline
  def apply(): FailAfter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailAfter]
  }
  @scala.inline
  implicit class FailAfterOps[Self <: FailAfter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelay")(js.undefined)
        ret
    }
  }
  
}

