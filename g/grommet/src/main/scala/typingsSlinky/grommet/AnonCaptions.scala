package typingsSlinky.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCaptions extends js.Object {
  var captions: js.UndefOr[Anon1] = js.native
  var controls: js.UndefOr[Anon1] = js.native
  var icons: js.UndefOr[AnonClosedCaption] = js.native
  var scrubber: js.UndefOr[Anon0] = js.native
}

object AnonCaptions {
  @scala.inline
  def apply(): AnonCaptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCaptions]
  }
  @scala.inline
  implicit class AnonCaptionsOps[Self <: AnonCaptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptions(value: Anon1): Self = {
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
    def withControls(value: Anon1): Self = {
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
    def withIcons(value: AnonClosedCaption): Self = {
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
    def withScrubber(value: Anon0): Self = {
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

