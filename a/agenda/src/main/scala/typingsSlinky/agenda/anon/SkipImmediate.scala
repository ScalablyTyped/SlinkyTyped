package typingsSlinky.agenda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkipImmediate extends js.Object {
  var skipImmediate: js.UndefOr[Boolean] = js.native
  var timezone: js.UndefOr[String] = js.native
}

object SkipImmediate {
  @scala.inline
  def apply(): SkipImmediate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipImmediate]
  }
  @scala.inline
  implicit class SkipImmediateOps[Self <: SkipImmediate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkipImmediate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipImmediate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipImmediate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipImmediate")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
  }
  
}

