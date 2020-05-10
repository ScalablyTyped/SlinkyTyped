package typingsSlinky.instagramPrivateApi.directThreadBroadcastOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExistingThreadOptions extends js.Object {
  var threadIds: (js.Array[String | Double]) | String | Double = js.native
}

object ExistingThreadOptions {
  @scala.inline
  def apply(threadIds: (js.Array[String | Double]) | String | Double): ExistingThreadOptions = {
    val __obj = js.Dynamic.literal(threadIds = threadIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistingThreadOptions]
  }
  @scala.inline
  implicit class ExistingThreadOptionsOps[Self <: ExistingThreadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThreadIds(value: (js.Array[String | Double]) | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

