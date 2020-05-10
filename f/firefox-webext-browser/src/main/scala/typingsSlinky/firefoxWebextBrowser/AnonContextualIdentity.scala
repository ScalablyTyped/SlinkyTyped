package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContextualIdentity extends js.Object {
  /** Contextual identity that has been removed */
  var contextualIdentity: ContextualIdentity = js.native
}

object AnonContextualIdentity {
  @scala.inline
  def apply(contextualIdentity: ContextualIdentity): AnonContextualIdentity = {
    val __obj = js.Dynamic.literal(contextualIdentity = contextualIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContextualIdentity]
  }
  @scala.inline
  implicit class AnonContextualIdentityOps[Self <: AnonContextualIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextualIdentity(value: ContextualIdentity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualIdentity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

