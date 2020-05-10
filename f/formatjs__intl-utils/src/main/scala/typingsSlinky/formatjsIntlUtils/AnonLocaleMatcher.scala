package typingsSlinky.formatjsIntlUtils

import typingsSlinky.formatjsIntlUtils.formatjsIntlUtilsStrings.`best fit`
import typingsSlinky.formatjsIntlUtils.formatjsIntlUtilsStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocaleMatcher extends js.Object {
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.native
}

object AnonLocaleMatcher {
  @scala.inline
  def apply(): AnonLocaleMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLocaleMatcher]
  }
  @scala.inline
  implicit class AnonLocaleMatcherOps[Self <: AnonLocaleMatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocaleMatcher(value: (`best fit`) | lookup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeMatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaleMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeMatcher")(js.undefined)
        ret
    }
  }
  
}

