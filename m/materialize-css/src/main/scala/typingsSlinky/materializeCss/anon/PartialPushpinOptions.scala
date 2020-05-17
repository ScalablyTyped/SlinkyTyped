package typingsSlinky.materializeCss.anon

import typingsSlinky.materializeCss.materializeCssStrings.`pin-bottom`
import typingsSlinky.materializeCss.materializeCssStrings.`pin-top`
import typingsSlinky.materializeCss.materializeCssStrings.pinned
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.PushpinOptions> */
@js.native
trait PartialPushpinOptions extends js.Object {
  var bottom: js.UndefOr[Double] = js.native
  var offset: js.UndefOr[Double] = js.native
  var onPositionChange: js.UndefOr[
    js.ThisFunction1[/* this */ this.type, /* position */ pinned | `pin-top` | `pin-bottom`, Unit]
  ] = js.native
  var top: js.UndefOr[Double] = js.native
}

object PartialPushpinOptions {
  @scala.inline
  def apply(): PartialPushpinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPushpinOptions]
  }
  @scala.inline
  implicit class PartialPushpinOptionsOps[Self <: PartialPushpinOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPositionChange(
      value: js.ThisFunction1[PartialPushpinOptions, /* position */ pinned | `pin-top` | `pin-bottom`, Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPositionChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPositionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPositionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
  }
  
}

