package typingsSlinky.reactNativeFirebase.mod.RNFirebase.links

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationParameters extends js.Object {
  def setForcedRedirectEnabled(forcedRedirectEnabled: Boolean): DynamicLink = js.native
}

object NavigationParameters {
  @scala.inline
  def apply(setForcedRedirectEnabled: Boolean => DynamicLink): NavigationParameters = {
    val __obj = js.Dynamic.literal(setForcedRedirectEnabled = js.Any.fromFunction1(setForcedRedirectEnabled))
    __obj.asInstanceOf[NavigationParameters]
  }
  @scala.inline
  implicit class NavigationParametersOps[Self <: NavigationParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetForcedRedirectEnabled(value: Boolean => DynamicLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setForcedRedirectEnabled")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

