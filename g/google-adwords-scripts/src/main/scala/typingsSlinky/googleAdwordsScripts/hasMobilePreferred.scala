package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hasMobilePreferred extends js.Object {
  def isMobilePreferred(): Boolean = js.native
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
}

object hasMobilePreferred {
  @scala.inline
  def apply(isMobilePreferred: () => Boolean, setMobilePreferred: Boolean => Unit): hasMobilePreferred = {
    val __obj = js.Dynamic.literal(isMobilePreferred = js.Any.fromFunction0(isMobilePreferred), setMobilePreferred = js.Any.fromFunction1(setMobilePreferred))
    __obj.asInstanceOf[hasMobilePreferred]
  }
  @scala.inline
  implicit class hasMobilePreferredOps[Self <: hasMobilePreferred] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMobilePreferred(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobilePreferred")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetMobilePreferred(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMobilePreferred")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

