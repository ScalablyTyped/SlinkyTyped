package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueueMessagesOptions extends PeekQueueMessagesOptions {
  var peekonly: js.UndefOr[Boolean] = js.native
  var visibilitytimeout: js.UndefOr[Double] = js.native
}

object GetQueueMessagesOptions {
  @scala.inline
  def apply(): GetQueueMessagesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueueMessagesOptions]
  }
  @scala.inline
  implicit class GetQueueMessagesOptionsOps[Self <: GetQueueMessagesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPeekonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peekonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeekonly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peekonly")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibilitytimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilitytimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibilitytimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilitytimeout")(js.undefined)
        ret
    }
  }
  
}

