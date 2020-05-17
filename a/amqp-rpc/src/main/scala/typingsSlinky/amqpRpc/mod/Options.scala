package typingsSlinky.amqpRpc.mod

import typingsSlinky.amqpRpc.anon.AutoDelete
import typingsSlinky.amqpRpc.anon.DefaultExchangeName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var conn_options: js.UndefOr[js.Any] = js.native
  var connection: js.UndefOr[js.Any] = js.native
  var exchange: js.UndefOr[String] = js.native
  var exchangeInstance: js.UndefOr[js.Any] = js.native
  var exchange_options: js.UndefOr[AutoDelete] = js.native
  var ipml_options: js.UndefOr[DefaultExchangeName] = js.native
  var url: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConn_options(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conn_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConn_options: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conn_options")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
    @scala.inline
    def withExchange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchange")(js.undefined)
        ret
    }
    @scala.inline
    def withExchangeInstance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchangeInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withExchange_options(value: AutoDelete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchange_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchange_options: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchange_options")(js.undefined)
        ret
    }
    @scala.inline
    def withIpml_options(value: DefaultExchangeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipml_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpml_options: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipml_options")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

