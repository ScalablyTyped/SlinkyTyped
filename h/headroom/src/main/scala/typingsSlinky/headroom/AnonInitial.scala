package typingsSlinky.headroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInitial extends js.Object {
  var initial: js.UndefOr[String] = js.native
  var notBottom: js.UndefOr[String] = js.native
  var notTop: js.UndefOr[String] = js.native
  var pinned: js.UndefOr[String] = js.native
  var top: js.UndefOr[String] = js.native
  var unpinned: js.UndefOr[String] = js.native
}

object AnonInitial {
  @scala.inline
  def apply(): AnonInitial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInitial]
  }
  @scala.inline
  implicit class AnonInitialOps[Self <: AnonInitial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(js.undefined)
        ret
    }
    @scala.inline
    def withNotBottom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withNotTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notTop")(js.undefined)
        ret
    }
    @scala.inline
    def withPinned(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: String): Self = {
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
    @scala.inline
    def withUnpinned(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnpinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpinned")(js.undefined)
        ret
    }
  }
  
}

