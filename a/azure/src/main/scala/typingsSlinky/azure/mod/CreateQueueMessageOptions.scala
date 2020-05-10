package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateQueueMessageOptions extends TimeoutIntervalOptions {
  var messagettl: js.UndefOr[Double] = js.native
  var visibilitytimeout: js.UndefOr[Double] = js.native
}

object CreateQueueMessageOptions {
  @scala.inline
  def apply(): CreateQueueMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQueueMessageOptions]
  }
  @scala.inline
  implicit class CreateQueueMessageOptionsOps[Self <: CreateQueueMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessagettl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagettl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagettl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagettl")(js.undefined)
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

