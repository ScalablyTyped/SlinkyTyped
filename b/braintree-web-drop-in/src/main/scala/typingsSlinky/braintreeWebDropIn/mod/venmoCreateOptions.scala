package typingsSlinky.braintreeWebDropIn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait venmoCreateOptions extends js.Object {
  var allowNewBrowserTab: js.UndefOr[Boolean] = js.native
}

object venmoCreateOptions {
  @scala.inline
  def apply(): venmoCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[venmoCreateOptions]
  }
  @scala.inline
  implicit class venmoCreateOptionsOps[Self <: venmoCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNewBrowserTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNewBrowserTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNewBrowserTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNewBrowserTab")(js.undefined)
        ret
    }
  }
  
}

