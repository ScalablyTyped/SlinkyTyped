package typingsSlinky.recurlyRecurlyJs.configureMod

import typingsSlinky.recurlyRecurlyJs.anon.Braintree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurlyOptions extends js.Object {
  var cors: js.UndefOr[Boolean] = js.native
  var currency: js.UndefOr[String] = js.native
  var fraud: js.UndefOr[Braintree] = js.native
  var publicKey: String = js.native
  var required: js.UndefOr[js.Array[String]] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object RecurlyOptions {
  @scala.inline
  def apply(publicKey: String): RecurlyOptions = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurlyOptions]
  }
  @scala.inline
  implicit class RecurlyOptionsOps[Self <: RecurlyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withFraud(value: Braintree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fraud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFraud: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fraud")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
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

