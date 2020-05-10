package typingsSlinky.extjs.Ext.form.action

import typingsSlinky.extjs.Ext.IBase
import typingsSlinky.extjs.Ext.form.IBasic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAction extends IBase {
  /** [Property] (String) */
  var CLIENT_INVALID: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var CONNECT_FAILURE: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var LOAD_FAILURE: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var SERVER_INVALID: js.UndefOr[String] = js.native
  /** [Config Option] (Function) */
  var failure: js.UndefOr[js.Any] = js.native
  /** [Property] (String) */
  var failureType: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.form.Basic) */
  var form: js.UndefOr[IBasic] = js.native
  /** [Config Option] (Object) */
  var headers: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.native
  /** [Config Option] (Object/String) */
  var params: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var reset: js.UndefOr[Boolean] = js.native
  /** [Property] (Object) */
  var response: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var result: js.UndefOr[js.Any] = js.native
  /** [Method] Invokes this action using the current configuration  */
  var run: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var submitEmptyText: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Function) */
  var success: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  /** [Property] (String) */
  var `type`: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var waitMsg: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var waitTitle: js.UndefOr[String] = js.native
}

object IAction {
  @scala.inline
  def apply(): IAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAction]
  }
  @scala.inline
  implicit class IActionOps[Self <: IAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCLIENT_INVALID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_INVALID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCLIENT_INVALID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_INVALID")(js.undefined)
        ret
    }
    @scala.inline
    def withCONNECT_FAILURE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECT_FAILURE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCONNECT_FAILURE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECT_FAILURE")(js.undefined)
        ret
    }
    @scala.inline
    def withLOAD_FAILURE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOAD_FAILURE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLOAD_FAILURE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOAD_FAILURE")(js.undefined)
        ret
    }
    @scala.inline
    def withSERVER_INVALID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SERVER_INVALID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSERVER_INVALID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SERVER_INVALID")(js.undefined)
        ret
    }
    @scala.inline
    def withFailure(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureType")(js.undefined)
        ret
    }
    @scala.inline
    def withForm(value: IBasic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withRun(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitEmptyText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitEmptyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitEmptyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitEmptyText")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
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
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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
    @scala.inline
    def withWaitMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitTitle")(js.undefined)
        ret
    }
  }
  
}

