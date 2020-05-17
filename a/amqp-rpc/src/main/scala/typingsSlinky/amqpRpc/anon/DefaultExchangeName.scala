package typingsSlinky.amqpRpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultExchangeName extends js.Object {
  var defaultExchangeName: js.UndefOr[String] = js.native
}

object DefaultExchangeName {
  @scala.inline
  def apply(): DefaultExchangeName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultExchangeName]
  }
  @scala.inline
  implicit class DefaultExchangeNameOps[Self <: DefaultExchangeName] (val x: Self) extends AnyVal {
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

