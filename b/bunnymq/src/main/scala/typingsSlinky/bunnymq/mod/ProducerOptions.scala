package typingsSlinky.bunnymq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProducerOptions extends js.Object {
  var routingKey: js.UndefOr[String] = js.native
  var rpc: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object ProducerOptions {
  @scala.inline
  def apply(): ProducerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProducerOptions]
  }
  @scala.inline
  implicit class ProducerOptionsOps[Self <: ProducerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoutingKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutingKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRpc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRpc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpc")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

