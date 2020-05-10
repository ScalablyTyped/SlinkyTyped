package typingsSlinky.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAppid extends js.Object {
  var app_id: String = js.native
  			// 应用id
  var auth_code: String = js.native
  		// 会员卡表单信息请求Id
  var out_string: String = js.native
  	// 会员卡模板Id
  var request_id: String = js.native
  			// 授权的state
  var scope: String = js.native
  		// 授权码，用于换取authtoken
  var state: String = js.native
  			// 授权scope
  var template_id: String = js.native
}

object AnonAppid {
  @scala.inline
  def apply(
    app_id: String,
    auth_code: String,
    out_string: String,
    request_id: String,
    scope: String,
    state: String,
    template_id: String
  ): AnonAppid = {
    val __obj = js.Dynamic.literal(app_id = app_id.asInstanceOf[js.Any], auth_code = auth_code.asInstanceOf[js.Any], out_string = out_string.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppid]
  }
  @scala.inline
  implicit class AnonAppidOps[Self <: AnonAppid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuth_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOut_string(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out_string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

