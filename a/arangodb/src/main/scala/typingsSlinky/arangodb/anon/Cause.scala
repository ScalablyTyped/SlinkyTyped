package typingsSlinky.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cause extends js.Object {
  var cause: js.UndefOr[js.Error] = js.native
  var extra: js.UndefOr[js.Any] = js.native
}

object Cause {
  @scala.inline
  def apply(): Cause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cause]
  }
  @scala.inline
  implicit class CauseOps[Self <: Cause] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCause(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(js.undefined)
        ret
    }
    @scala.inline
    def withExtra(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.undefined)
        ret
    }
  }
  
}

