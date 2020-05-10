package typingsSlinky.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnEventMetaData extends js.Object {
  var error_code: String = js.native
  var error_message: String = js.native
  var error_type: String = js.native
  var exit_status: ExitStatus = js.native
  var institution_id: String = js.native
  var institution_name: String = js.native
  var institution_search_query: String = js.native
  var link_session_id: String = js.native
  var mfa_type: String = js.native
  var request_id: String = js.native
  var timestamp: String = js.native
  var view_name: ViewName = js.native
}

object OnEventMetaData {
  @scala.inline
  def apply(
    error_code: String,
    error_message: String,
    error_type: String,
    exit_status: ExitStatus,
    institution_id: String,
    institution_name: String,
    institution_search_query: String,
    link_session_id: String,
    mfa_type: String,
    request_id: String,
    timestamp: String,
    view_name: ViewName
  ): OnEventMetaData = {
    val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any], exit_status = exit_status.asInstanceOf[js.Any], institution_id = institution_id.asInstanceOf[js.Any], institution_name = institution_name.asInstanceOf[js.Any], institution_search_query = institution_search_query.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any], mfa_type = mfa_type.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], view_name = view_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEventMetaData]
  }
  @scala.inline
  implicit class OnEventMetaDataOps[Self <: OnEventMetaData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExit_status(value: ExitStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit_status")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withInstitution_search_query(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("institution_search_query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink_session_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link_session_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMfa_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mfa_type")(value.asInstanceOf[js.Any])
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
    def withView_name(value: ViewName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

