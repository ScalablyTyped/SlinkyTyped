package typingsSlinky.adalAngular

import typingsSlinky.adalAngular.adalAngularStrings.adalDotaccessDottokenDotkey
import typingsSlinky.adalAngular.adalAngularStrings.adalDoterror
import typingsSlinky.adalAngular.adalAngularStrings.adalDoterrorDotdescription
import typingsSlinky.adalAngular.adalAngularStrings.adalDotexpirationDotkey
import typingsSlinky.adalAngular.adalAngularStrings.adalDotidtoken
import typingsSlinky.adalAngular.adalAngularStrings.adalDotloginDoterror
import typingsSlinky.adalAngular.adalAngularStrings.adalDotloginDotrequest
import typingsSlinky.adalAngular.adalAngularStrings.adalDotnonceDotidtoken
import typingsSlinky.adalAngular.adalAngularStrings.adalDotsessionDotstate
import typingsSlinky.adalAngular.adalAngularStrings.adalDotstateDotlogin
import typingsSlinky.adalAngular.adalAngularStrings.adalDotstateDotrenew
import typingsSlinky.adalAngular.adalAngularStrings.adalDottokenDotkeys
import typingsSlinky.adalAngular.adalAngularStrings.adalDottokenDotrenewDotstatus
import typingsSlinky.adalAngular.adalAngularStrings.adalDotusername
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonACCESSTOKENKEY extends js.Object {
  var ACCESS_TOKEN_KEY: adalDotaccessDottokenDotkey = js.native
  var ERROR: adalDoterror = js.native
  var ERROR_DESCRIPTION: adalDoterrorDotdescription = js.native
  var EXPIRATION_KEY: adalDotexpirationDotkey = js.native
  var IDTOKEN: adalDotidtoken = js.native
  var LOGIN_ERROR: adalDotloginDoterror = js.native
  var LOGIN_REQUEST: adalDotloginDotrequest = js.native
  var NONCE_IDTOKEN: adalDotnonceDotidtoken = js.native
  var RENEW_STATUS: adalDottokenDotrenewDotstatus = js.native
  var SESSION_STATE: adalDotsessionDotstate = js.native
  var STATE_LOGIN: adalDotstateDotlogin = js.native
  var STATE_RENEW: adalDotstateDotrenew = js.native
  var TOKEN_KEYS: adalDottokenDotkeys = js.native
  var USERNAME: adalDotusername = js.native
}

object AnonACCESSTOKENKEY {
  @scala.inline
  def apply(
    ACCESS_TOKEN_KEY: adalDotaccessDottokenDotkey,
    ERROR: adalDoterror,
    ERROR_DESCRIPTION: adalDoterrorDotdescription,
    EXPIRATION_KEY: adalDotexpirationDotkey,
    IDTOKEN: adalDotidtoken,
    LOGIN_ERROR: adalDotloginDoterror,
    LOGIN_REQUEST: adalDotloginDotrequest,
    NONCE_IDTOKEN: adalDotnonceDotidtoken,
    RENEW_STATUS: adalDottokenDotrenewDotstatus,
    SESSION_STATE: adalDotsessionDotstate,
    STATE_LOGIN: adalDotstateDotlogin,
    STATE_RENEW: adalDotstateDotrenew,
    TOKEN_KEYS: adalDottokenDotkeys,
    USERNAME: adalDotusername
  ): AnonACCESSTOKENKEY = {
    val __obj = js.Dynamic.literal(ACCESS_TOKEN_KEY = ACCESS_TOKEN_KEY.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], ERROR_DESCRIPTION = ERROR_DESCRIPTION.asInstanceOf[js.Any], EXPIRATION_KEY = EXPIRATION_KEY.asInstanceOf[js.Any], IDTOKEN = IDTOKEN.asInstanceOf[js.Any], LOGIN_ERROR = LOGIN_ERROR.asInstanceOf[js.Any], LOGIN_REQUEST = LOGIN_REQUEST.asInstanceOf[js.Any], NONCE_IDTOKEN = NONCE_IDTOKEN.asInstanceOf[js.Any], RENEW_STATUS = RENEW_STATUS.asInstanceOf[js.Any], SESSION_STATE = SESSION_STATE.asInstanceOf[js.Any], STATE_LOGIN = STATE_LOGIN.asInstanceOf[js.Any], STATE_RENEW = STATE_RENEW.asInstanceOf[js.Any], TOKEN_KEYS = TOKEN_KEYS.asInstanceOf[js.Any], USERNAME = USERNAME.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonACCESSTOKENKEY]
  }
  @scala.inline
  implicit class AnonACCESSTOKENKEYOps[Self <: AnonACCESSTOKENKEY] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withACCESS_TOKEN_KEY(value: adalDotaccessDottokenDotkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACCESS_TOKEN_KEY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERROR(value: adalDoterror): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERROR_DESCRIPTION(value: adalDoterrorDotdescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR_DESCRIPTION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEXPIRATION_KEY(value: adalDotexpirationDotkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EXPIRATION_KEY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIDTOKEN(value: adalDotidtoken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IDTOKEN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLOGIN_ERROR(value: adalDotloginDoterror): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOGIN_ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLOGIN_REQUEST(value: adalDotloginDotrequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOGIN_REQUEST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNONCE_IDTOKEN(value: adalDotnonceDotidtoken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NONCE_IDTOKEN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRENEW_STATUS(value: adalDottokenDotrenewDotstatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RENEW_STATUS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSESSION_STATE(value: adalDotsessionDotstate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SESSION_STATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTATE_LOGIN(value: adalDotstateDotlogin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STATE_LOGIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTATE_RENEW(value: adalDotstateDotrenew): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STATE_RENEW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOKEN_KEYS(value: adalDottokenDotkeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOKEN_KEYS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUSERNAME(value: adalDotusername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USERNAME")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

