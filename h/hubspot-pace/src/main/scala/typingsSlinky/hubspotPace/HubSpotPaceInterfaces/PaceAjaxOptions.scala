package typingsSlinky.hubspotPace.HubSpotPaceInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaceAjaxOptions extends js.Object {
  /**
    * A list of regular expressions or substrings of URLS we should ignore (for both tracking and restarting)
    */
  var ignoreURLs: js.UndefOr[js.Array[String | js.RegExp]] = js.native
  /**
    * Which HTTP methods should we track?
    */
  var trackMethods: js.UndefOr[js.Array[String]] = js.native
  /**
    * Should we track web socket connections?
    */
  var trackWebSockets: js.UndefOr[Boolean] = js.native
}

object PaceAjaxOptions {
  @scala.inline
  def apply(): PaceAjaxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaceAjaxOptions]
  }
  @scala.inline
  implicit class PaceAjaxOptionsOps[Self <: PaceAjaxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreURLs(value: js.Array[String | js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreURLs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreURLs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreURLs")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackWebSockets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackWebSockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackWebSockets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackWebSockets")(js.undefined)
        ret
    }
  }
  
}

