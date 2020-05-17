package typingsSlinky.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearExistingCallbacks extends js.Object {
  var clearExistingCallbacks: js.UndefOr[Boolean] = js.native
  var oneTimeCallback: js.UndefOr[Boolean] = js.native
}

object ClearExistingCallbacks {
  @scala.inline
  def apply(): ClearExistingCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearExistingCallbacks]
  }
  @scala.inline
  implicit class ClearExistingCallbacksOps[Self <: ClearExistingCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearExistingCallbacks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearExistingCallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearExistingCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearExistingCallbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withOneTimeCallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneTimeCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneTimeCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneTimeCallback")(js.undefined)
        ret
    }
  }
  
}

