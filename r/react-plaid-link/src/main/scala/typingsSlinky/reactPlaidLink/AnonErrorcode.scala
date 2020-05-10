package typingsSlinky.reactPlaidLink

import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.API_ERROR
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.ASSET_REPORT_ERROR
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.CONNECTED
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.CREDENTIAL
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.ERROR
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.EXIT
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.INSTITUTION_ERROR
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.INVALID_INPUT
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.INVALID_REQUEST
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.ITEM_ERROR
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.LOADING
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.MFA
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.RATE_LIMIT_EXCEEDED
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.RECAPTCHA
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.SELECT_ACCOUNT
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.SELECT_INSTITUTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrorcode extends js.Object {
  var error_code: js.UndefOr[String | Null] = js.native
  var error_message: js.UndefOr[String | Null] = js.native
  var error_type: js.UndefOr[
    INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR | Null
  ] = js.native
  var exit_status: js.UndefOr[String | Double | Null] = js.native
  var institution_id: String = js.native
  var institution_name: String = js.native
  var institution_search_query: js.UndefOr[String | Null] = js.native
  var link_session_id: String = js.native
  var mfa_type: js.UndefOr[String | Null] = js.native
  var request_id: String = js.native
  var timestamp: String = js.native
  var view_name: js.UndefOr[
    CONNECTED | CREDENTIAL | ERROR | EXIT | LOADING | MFA | RECAPTCHA | SELECT_ACCOUNT | SELECT_INSTITUTION | Null
  ] = js.native
}

object AnonErrorcode {
  @scala.inline
  def apply(
    institution_id: String,
    institution_name: String,
    link_session_id: String,
    request_id: String,
    timestamp: String
  ): AnonErrorcode = {
    val __obj = js.Dynamic.literal(institution_id = institution_id.asInstanceOf[js.Any], institution_name = institution_name.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorcode]
  }
  @scala.inline
  implicit class AnonErrorcodeOps[Self <: AnonErrorcode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstitution_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("institution_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstitution_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("institution_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink_session_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link_session_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_code")(js.undefined)
        ret
    }
    @scala.inline
    def withError_codeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_code")(null)
        ret
    }
    @scala.inline
    def withError_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError_message: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_message")(js.undefined)
        ret
    }
    @scala.inline
    def withError_messageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_message")(null)
        ret
    }
    @scala.inline
    def withError_type(
      value: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_type")(js.undefined)
        ret
    }
    @scala.inline
    def withError_typeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_type")(null)
        ret
    }
    @scala.inline
    def withExit_status(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExit_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit_status")(js.undefined)
        ret
    }
    @scala.inline
    def withExit_statusNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit_status")(null)
        ret
    }
    @scala.inline
    def withInstitution_search_query(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("institution_search_query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstitution_search_query: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("institution_search_query")(js.undefined)
        ret
    }
    @scala.inline
    def withInstitution_search_queryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("institution_search_query")(null)
        ret
    }
    @scala.inline
    def withMfa_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mfa_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMfa_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mfa_type")(js.undefined)
        ret
    }
    @scala.inline
    def withMfa_typeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mfa_type")(null)
        ret
    }
    @scala.inline
    def withView_name(
      value: CONNECTED | CREDENTIAL | ERROR | EXIT | LOADING | MFA | RECAPTCHA | SELECT_ACCOUNT | SELECT_INSTITUTION
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_name")(js.undefined)
        ret
    }
    @scala.inline
    def withView_nameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_name")(null)
        ret
    }
  }
  
}

