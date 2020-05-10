package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnCheckForUpdateCallbackResult extends js.Object {
  /** 是否有新版本 */
  var hasUpdate: Boolean = js.native
}

object OnCheckForUpdateCallbackResult {
  @scala.inline
  def apply(hasUpdate: Boolean): OnCheckForUpdateCallbackResult = {
    val __obj = js.Dynamic.literal(hasUpdate = hasUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCheckForUpdateCallbackResult]
  }
  @scala.inline
  implicit class OnCheckForUpdateCallbackResultOps[Self <: OnCheckForUpdateCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasUpdate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

