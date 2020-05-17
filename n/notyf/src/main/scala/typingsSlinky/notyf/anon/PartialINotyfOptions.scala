package typingsSlinky.notyf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<notyf.notyf/notyf.options.INotyfOptions> */
@js.native
trait PartialINotyfOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.native
  var ripple: js.UndefOr[Boolean] = js.native
  var types: js.UndefOr[js.Array[DeepPartialINotyfNotifica]] = js.native
}

object PartialINotyfOptions {
  @scala.inline
  def apply(): PartialINotyfOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialINotyfOptions]
  }
  @scala.inline
  implicit class PartialINotyfOptionsOps[Self <: PartialINotyfOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withRipple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ripple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRipple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ripple")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[DeepPartialINotyfNotifica]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
  }
  
}

