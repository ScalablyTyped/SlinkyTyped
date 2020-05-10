package typingsSlinky.debouncePromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebounceOptions extends js.Object {
  var accumulate: js.UndefOr[Boolean] = js.native
  var leading: js.UndefOr[Boolean] = js.native
}

object DebounceOptions {
  @scala.inline
  def apply(): DebounceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebounceOptions]
  }
  @scala.inline
  implicit class DebounceOptionsOps[Self <: DebounceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccumulate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accumulate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccumulate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accumulate")(js.undefined)
        ret
    }
    @scala.inline
    def withLeading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leading")(js.undefined)
        ret
    }
  }
  
}

