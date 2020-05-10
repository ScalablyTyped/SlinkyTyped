package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserContextEventObj extends js.Object {
  /** Emitted when the url of a target inside the browser context changes. */
  var targetchanged: Target = js.native
  /** Emitted when a target is created, for example when a new page is opened by `window.open` or `browserContext.newPage`. */
  var targetcreated: Target = js.native
  /** Emitted when a target is destroyed, for example when a page is closed. */
  var targetdestroyed: Target = js.native
}

object BrowserContextEventObj {
  @scala.inline
  def apply(targetchanged: Target, targetcreated: Target, targetdestroyed: Target): BrowserContextEventObj = {
    val __obj = js.Dynamic.literal(targetchanged = targetchanged.asInstanceOf[js.Any], targetcreated = targetcreated.asInstanceOf[js.Any], targetdestroyed = targetdestroyed.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserContextEventObj]
  }
  @scala.inline
  implicit class BrowserContextEventObjOps[Self <: BrowserContextEventObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetchanged(value: Target): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetchanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetcreated(value: Target): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetcreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetdestroyed(value: Target): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetdestroyed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

