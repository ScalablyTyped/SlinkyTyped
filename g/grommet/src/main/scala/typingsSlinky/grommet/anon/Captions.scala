package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Captions extends js.Object {
  var captions: js.UndefOr[`1`] = js.native
  var controls: js.UndefOr[`1`] = js.native
  var icons: js.UndefOr[ClosedCaption] = js.native
  var scrubber: js.UndefOr[`0`] = js.native
}

object Captions {
  @scala.inline
  def apply(): Captions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Captions]
  }
  @scala.inline
  implicit class CaptionsOps[Self <: Captions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptions(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captions")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: ClosedCaption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withScrubber(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrubber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrubber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrubber")(js.undefined)
        ret
    }
  }
  
}

