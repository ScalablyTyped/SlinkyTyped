package typingsSlinky.rcFieldForm.anon

import typingsSlinky.rcFieldForm.interfaceMod.ValidateMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Len extends js.Object {
  var len: js.UndefOr[ValidateMessage] = js.native
  var max: js.UndefOr[ValidateMessage] = js.native
  var min: js.UndefOr[ValidateMessage] = js.native
  var range: js.UndefOr[ValidateMessage] = js.native
}

object Len {
  @scala.inline
  def apply(): Len = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Len]
  }
  @scala.inline
  implicit class LenOps[Self <: Len] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLenFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("len")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLen(value: ValidateMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("len")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("len")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMax(value: ValidateMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMin(value: ValidateMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRange(value: ValidateMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
  }
  
}

