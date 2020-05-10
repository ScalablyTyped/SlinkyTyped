package typingsSlinky.passportAzureAd.commonMod

import typingsSlinky.passportAzureAd.passportAzureAdStrings.error
import typingsSlinky.passportAzureAd.passportAzureAdStrings.info
import typingsSlinky.passportAzureAd.passportAzureAdStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseStrategyOption extends js.Object {
  var clientID: String = js.native
  var clockSkew: js.UndefOr[Double] = js.native
  var identityMetadata: String = js.native
  var isB2C: js.UndefOr[Boolean] = js.native
  var issuer: js.UndefOr[String | js.Array[String]] = js.native
  var loggingLevel: js.UndefOr[info | warn | error] = js.native
  var loggingNoPII: js.UndefOr[Boolean] = js.native
  var validateIssuer: js.UndefOr[Boolean] = js.native
}

object IBaseStrategyOption {
  @scala.inline
  def apply(clientID: String, identityMetadata: String): IBaseStrategyOption = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseStrategyOption]
  }
  @scala.inline
  implicit class IBaseStrategyOptionOps[Self <: IBaseStrategyOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentityMetadata(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClockSkew(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockSkew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClockSkew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockSkew")(js.undefined)
        ret
    }
    @scala.inline
    def withIsB2C(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isB2C")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsB2C: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isB2C")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuer(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingLevel(value: info | warn | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingNoPII(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingNoPII")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingNoPII: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingNoPII")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateIssuer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateIssuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateIssuer")(js.undefined)
        ret
    }
  }
  
}

