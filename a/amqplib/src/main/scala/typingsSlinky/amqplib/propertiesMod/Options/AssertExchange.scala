package typingsSlinky.amqplib.propertiesMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssertExchange extends js.Object {
  var alternateExchange: js.UndefOr[String] = js.native
  var arguments: js.UndefOr[js.Any] = js.native
  var autoDelete: js.UndefOr[Boolean] = js.native
  var durable: js.UndefOr[Boolean] = js.native
  var internal: js.UndefOr[Boolean] = js.native
}

object AssertExchange {
  @scala.inline
  def apply(): AssertExchange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssertExchange]
  }
  @scala.inline
  implicit class AssertExchangeOps[Self <: AssertExchange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternateExchange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateExchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateExchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateExchange")(js.undefined)
        ret
    }
    @scala.inline
    def withArguments(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(js.undefined)
        ret
    }
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
    def withDurable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durable")(js.undefined)
        ret
    }
    @scala.inline
    def withInternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(js.undefined)
        ret
    }
  }
  
}

