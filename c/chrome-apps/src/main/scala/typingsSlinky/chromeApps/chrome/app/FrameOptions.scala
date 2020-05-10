package typingsSlinky.chromeApps.chrome.app

import typingsSlinky.chromeApps.chromeAppsStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameOptions extends js.Object {
  /**
    * @requires(dev) Chrome dev only
    * @requires Permissions: 'app.window.alpha'
    * @description
    * Enable alpha on frame 'none'
    */
  var alphaEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Frame type: none or chrome (defaults to chrome).
    *
    * For none, the -webkit-app-region CSS property can be used to apply draggability to the app's window.
    * -webkit-app-region: drag can be used to mark regions draggable. no-drag can be used to disable this style on nested elements.
    */
  var `type`: none_ = js.native
}

object FrameOptions {
  @scala.inline
  def apply(`type`: none_): FrameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameOptions]
  }
  @scala.inline
  implicit class FrameOptionsOps[Self <: FrameOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: none_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlphaEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphaEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaEnabled")(js.undefined)
        ret
    }
  }
  
}

