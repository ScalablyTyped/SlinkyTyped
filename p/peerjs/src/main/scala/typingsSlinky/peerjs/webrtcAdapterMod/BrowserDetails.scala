package typingsSlinky.peerjs.webrtcAdapterMod

import typingsSlinky.peerjs.peerjsStrings.`Not a browserDot`
import typingsSlinky.peerjs.peerjsStrings.`Not a supported browserDot`
import typingsSlinky.peerjs.peerjsStrings.chrome
import typingsSlinky.peerjs.peerjsStrings.edge
import typingsSlinky.peerjs.peerjsStrings.firefox
import typingsSlinky.peerjs.peerjsStrings.safari
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserDetails extends js.Object {
  var browser: (`Not a browserDot`) | (`Not a supported browserDot`) | firefox | chrome | safari | edge = js.native
  var supportsUnifiedPlan: js.UndefOr[Boolean] = js.native
  var version: Double | Null = js.native
}

object BrowserDetails {
  @scala.inline
  def apply(browser: (`Not a browserDot`) | (`Not a supported browserDot`) | firefox | chrome | safari | edge): BrowserDetails = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserDetails]
  }
  @scala.inline
  implicit class BrowserDetailsOps[Self <: BrowserDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowser(value: (`Not a browserDot`) | (`Not a supported browserDot`) | firefox | chrome | safari | edge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsUnifiedPlan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsUnifiedPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsUnifiedPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsUnifiedPlan")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(null)
        ret
    }
  }
  
}

