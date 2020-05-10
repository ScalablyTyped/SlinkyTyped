package typingsSlinky.baseui.toastMod

import typingsSlinky.baseui.baseuiStrings.`inline`
import typingsSlinky.baseui.baseuiStrings.info
import typingsSlinky.baseui.baseuiStrings.negative
import typingsSlinky.baseui.baseuiStrings.positive
import typingsSlinky.baseui.baseuiStrings.toast
import typingsSlinky.baseui.baseuiStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedStylePropsArg extends js.Object {
  @JSName("$closeable")
  var $closeable: js.UndefOr[Boolean] = js.native
  @JSName("$isRendered")
  var $isRendered: js.UndefOr[Boolean] = js.native
  @JSName("$isVisible")
  var $isVisible: js.UndefOr[Boolean] = js.native
  @JSName("$kind")
  var $kind: js.UndefOr[info | positive | warning | negative] = js.native
  @JSName("$type")
  var $type: js.UndefOr[`inline` | toast] = js.native
}

object SharedStylePropsArg {
  @scala.inline
  def apply(): SharedStylePropsArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedStylePropsArg]
  }
  @scala.inline
  implicit class SharedStylePropsArgOps[Self <: SharedStylePropsArg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$closeable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$closeable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$closeable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$closeable")(js.undefined)
        ret
    }
    @scala.inline
    def with$isRendered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isRendered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$isRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isRendered")(js.undefined)
        ret
    }
    @scala.inline
    def with$isVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$isVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isVisible")(js.undefined)
        ret
    }
    @scala.inline
    def with$kind(value: info | positive | warning | negative): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$kind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$kind")(js.undefined)
        ret
    }
    @scala.inline
    def with$type(value: `inline` | toast): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$type")(js.undefined)
        ret
    }
  }
  
}

