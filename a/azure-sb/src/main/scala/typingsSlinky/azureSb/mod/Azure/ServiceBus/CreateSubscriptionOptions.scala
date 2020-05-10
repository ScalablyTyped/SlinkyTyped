package typingsSlinky.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateSubscriptionOptions> */
@js.native
trait CreateSubscriptionOptions extends js.Object {
  var DefaultMessageTimeToLive: js.UndefOr[String] = js.native
  var EnableDeadLetteringOnFilterEvaluationExceptions: js.UndefOr[Boolean] = js.native
  var EnableDeadLetteringOnMessageExpiration: js.UndefOr[Boolean] = js.native
  var LockDuration: js.UndefOr[String] = js.native
  var RequiresSession: js.UndefOr[Boolean] = js.native
}

object CreateSubscriptionOptions {
  @scala.inline
  def apply(): CreateSubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSubscriptionOptions]
  }
  @scala.inline
  implicit class CreateSubscriptionOptionsOps[Self <: CreateSubscriptionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultMessageTimeToLive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultMessageTimeToLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMessageTimeToLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultMessageTimeToLive")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDeadLetteringOnFilterEvaluationExceptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDeadLetteringOnFilterEvaluationExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDeadLetteringOnFilterEvaluationExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDeadLetteringOnFilterEvaluationExceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDeadLetteringOnMessageExpiration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDeadLetteringOnMessageExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDeadLetteringOnMessageExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDeadLetteringOnMessageExpiration")(js.undefined)
        ret
    }
    @scala.inline
    def withLockDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiresSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiresSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresSession")(js.undefined)
        ret
    }
  }
  
}

