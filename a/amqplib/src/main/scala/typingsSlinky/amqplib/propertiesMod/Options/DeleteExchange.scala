package typingsSlinky.amqplib.propertiesMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteExchange extends js.Object {
  var ifUnused: js.UndefOr[Boolean] = js.native
}

object DeleteExchange {
  @scala.inline
  def apply(): DeleteExchange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteExchange]
  }
  @scala.inline
  implicit class DeleteExchangeOps[Self <: DeleteExchange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

