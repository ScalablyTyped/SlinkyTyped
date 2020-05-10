package typingsSlinky.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/equalizer.html#optional-javascript-configuration
@js.native
trait EqualizerOptions extends js.Object {
  var equalize_on_stack: js.UndefOr[Boolean] = js.native
  var use_tallest: js.UndefOr[Boolean] = js.native
}

object EqualizerOptions {
  @scala.inline
  def apply(): EqualizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EqualizerOptions]
  }
  @scala.inline
  implicit class EqualizerOptionsOps[Self <: EqualizerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEqualize_on_stack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalize_on_stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqualize_on_stack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalize_on_stack")(js.undefined)
        ret
    }
    @scala.inline
    def withUse_tallest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_tallest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse_tallest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_tallest")(js.undefined)
        ret
    }
  }
  
}

