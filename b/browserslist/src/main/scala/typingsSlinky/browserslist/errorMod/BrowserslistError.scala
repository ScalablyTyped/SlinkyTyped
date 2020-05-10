package typingsSlinky.browserslist.errorMod

import typingsSlinky.browserslist.browserslistBooleans.`true`
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserslistError extends Error {
  var browserslist: `true` = js.native
}

object BrowserslistError {
  @scala.inline
  def apply(browserslist: `true`, message: String, name: String): BrowserslistError = {
    val __obj = js.Dynamic.literal(browserslist = browserslist.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserslistError]
  }
  @scala.inline
  implicit class BrowserslistErrorOps[Self <: BrowserslistError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserslist(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserslist")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

