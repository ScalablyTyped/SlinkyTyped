package typingsSlinky.chromeApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaFileSystemsOptions extends js.Object {
  /**
    * Whether to prompt the user for permission to additional media galleries before returning
    * the permitted set. Default is silent. If the value 'yes' is passed, or if the application
    * has not been granted access to any media galleries and the value 'if_needed' is passed,
    * then the media gallery configuration dialog will be displayed.
    *
    * **no**
    * Do not act interactively.
    * **yes**
    * Ask the user to manage permitted media galleries.
    * **if_needed**
    * Ask the user to manage permitted galleries only if the return set would otherwise be empty.
    */
  var interactive: js.UndefOr[Interactive] = js.native
}

object MediaFileSystemsOptions {
  @scala.inline
  def apply(): MediaFileSystemsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaFileSystemsOptions]
  }
  @scala.inline
  implicit class MediaFileSystemsOptionsOps[Self <: MediaFileSystemsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInteractive(value: Interactive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.undefined)
        ret
    }
  }
  
}

