package typingsSlinky.amqpRpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoDelete extends js.Object {
  var autoDelete: js.UndefOr[Boolean] = js.native
  var exclusive: js.UndefOr[Boolean] = js.native
}

object AutoDelete {
  @scala.inline
  def apply(): AutoDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoDelete]
  }
  @scala.inline
  implicit class AutoDeleteOps[Self <: AutoDelete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withExclusive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(js.undefined)
        ret
    }
  }
  
}

