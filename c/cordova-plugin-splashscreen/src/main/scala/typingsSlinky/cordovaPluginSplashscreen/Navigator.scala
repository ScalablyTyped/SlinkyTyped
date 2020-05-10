package typingsSlinky.cordovaPluginSplashscreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator extends js.Object {
  /** This plugin displays and hides a splash screen during application launch. */
  var splashscreen: AnonHide = js.native
}

object Navigator {
  @scala.inline
  def apply(splashscreen: AnonHide): Navigator = {
    val __obj = js.Dynamic.literal(splashscreen = splashscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSplashscreen(value: AnonHide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splashscreen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

