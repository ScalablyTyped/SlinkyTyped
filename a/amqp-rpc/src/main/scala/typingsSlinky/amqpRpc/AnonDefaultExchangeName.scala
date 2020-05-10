package typingsSlinky.amqpRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultExchangeName extends js.Object {
  var defaultExchangeName: js.UndefOr[String] = js.native
}

object AnonDefaultExchangeName {
  @scala.inline
  def apply(): AnonDefaultExchangeName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDefaultExchangeName]
  }
  @scala.inline
  implicit class AnonDefaultExchangeNameOps[Self <: AnonDefaultExchangeName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultExchangeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExchangeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultExchangeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExchangeName")(js.undefined)
        ret
    }
  }
  
}

