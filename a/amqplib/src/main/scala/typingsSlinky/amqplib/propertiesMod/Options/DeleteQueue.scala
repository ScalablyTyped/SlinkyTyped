package typingsSlinky.amqplib.propertiesMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteQueue extends js.Object {
  var ifEmpty: js.UndefOr[Boolean] = js.native
  var ifUnused: js.UndefOr[Boolean] = js.native
}

object DeleteQueue {
  @scala.inline
  def apply(): DeleteQueue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteQueue]
  }
  @scala.inline
  implicit class DeleteQueueOps[Self <: DeleteQueue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIfEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withIfUnused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifUnused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfUnused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifUnused")(js.undefined)
        ret
    }
  }
  
}

