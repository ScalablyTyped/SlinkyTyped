package typingsSlinky.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationCompleteTransitionActionPayload extends js.Object {
  var key: js.UndefOr[String] = js.native
  var toChildKey: js.UndefOr[String] = js.native
}

object NavigationCompleteTransitionActionPayload {
  @scala.inline
  def apply(): NavigationCompleteTransitionActionPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationCompleteTransitionActionPayload]
  }
  @scala.inline
  implicit class NavigationCompleteTransitionActionPayloadOps[Self <: NavigationCompleteTransitionActionPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withToChildKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toChildKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToChildKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toChildKey")(js.undefined)
        ret
    }
  }
  
}

