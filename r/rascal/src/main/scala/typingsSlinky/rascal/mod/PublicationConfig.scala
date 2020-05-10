package typingsSlinky.rascal.mod

import typingsSlinky.amqplib.propertiesMod.Options.Publish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicationConfig extends js.Object {
  var autoCreated: js.UndefOr[Boolean] = js.native
  var confirm: js.UndefOr[Boolean] = js.native
  var deprecated: js.UndefOr[Boolean] = js.native
  var encryption: js.UndefOr[String] = js.native
  var exchange: js.UndefOr[String] = js.native
  var options: js.UndefOr[Publish] = js.native
  var queue: js.UndefOr[String] = js.native
  var routingKey: js.UndefOr[String] = js.native
  var vhost: js.UndefOr[String] = js.native
}

object PublicationConfig {
  @scala.inline
  def apply(): PublicationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicationConfig]
  }
  @scala.inline
  implicit class PublicationConfigOps[Self <: PublicationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCreated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryption")(js.undefined)
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
    def withOptions(value: Publish): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withQueue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(js.undefined)
        ret
    }
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
    def withVhost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vhost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVhost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vhost")(js.undefined)
        ret
    }
  }
  
}

