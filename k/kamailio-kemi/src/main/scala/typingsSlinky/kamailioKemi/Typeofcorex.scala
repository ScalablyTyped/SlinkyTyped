package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcorex extends js.Object {
  def append_branch(): Double = js.native
  def append_branch_uri(uri: String): Double = js.native
  def append_branch_uri_q(uri: String, q: String): Double = js.native
  def has_ruri_user(): Double = js.native
  def has_user_agent(): Double = js.native
  def isxflagset(fval: Double): Double = js.native
  def resetxflag(fval: Double): Double = js.native
  def send_data(uri: String, data: String): Double = js.native
  def sendx(uri: String, sock: String, data: String): Double = js.native
  def set_recv_socket(ssock: String): Double = js.native
  def set_send_socket(ssock: String): Double = js.native
  def set_source_address(saddr: String): Double = js.native
  def setxflag(fval: Double): Double = js.native
  def via_add_srvid(fval: Double): Double = js.native
  def via_add_xavp_params(fval: Double): Double = js.native
  def via_use_xavp_fields(fval: Double): Double = js.native
}

object Typeofcorex {
  @scala.inline
  def apply(
    append_branch: () => Double,
    append_branch_uri: String => Double,
    append_branch_uri_q: (String, String) => Double,
    has_ruri_user: () => Double,
    has_user_agent: () => Double,
    isxflagset: Double => Double,
    resetxflag: Double => Double,
    send_data: (String, String) => Double,
    sendx: (String, String, String) => Double,
    set_recv_socket: String => Double,
    set_send_socket: String => Double,
    set_source_address: String => Double,
    setxflag: Double => Double,
    via_add_srvid: Double => Double,
    via_add_xavp_params: Double => Double,
    via_use_xavp_fields: Double => Double
  ): Typeofcorex = {
    val __obj = js.Dynamic.literal(append_branch = js.Any.fromFunction0(append_branch), append_branch_uri = js.Any.fromFunction1(append_branch_uri), append_branch_uri_q = js.Any.fromFunction2(append_branch_uri_q), has_ruri_user = js.Any.fromFunction0(has_ruri_user), has_user_agent = js.Any.fromFunction0(has_user_agent), isxflagset = js.Any.fromFunction1(isxflagset), resetxflag = js.Any.fromFunction1(resetxflag), send_data = js.Any.fromFunction2(send_data), sendx = js.Any.fromFunction3(sendx), set_recv_socket = js.Any.fromFunction1(set_recv_socket), set_send_socket = js.Any.fromFunction1(set_send_socket), set_source_address = js.Any.fromFunction1(set_source_address), setxflag = js.Any.fromFunction1(setxflag), via_add_srvid = js.Any.fromFunction1(via_add_srvid), via_add_xavp_params = js.Any.fromFunction1(via_add_xavp_params), via_use_xavp_fields = js.Any.fromFunction1(via_use_xavp_fields))
    __obj.asInstanceOf[Typeofcorex]
  }
  @scala.inline
  implicit class TypeofcorexOps[Self <: Typeofcorex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppend_branch(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append_branch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAppend_branch_uri(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append_branch_uri")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAppend_branch_uri_q(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append_branch_uri_q")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHas_ruri_user(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_ruri_user")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHas_user_agent(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_user_agent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsxflagset(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isxflagset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetxflag(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetxflag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSend_data(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_data")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSendx(value: (String, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendx")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSet_recv_socket(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_recv_socket")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_send_socket(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_send_socket")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_source_address(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_source_address")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetxflag(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setxflag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVia_add_srvid(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("via_add_srvid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVia_add_xavp_params(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("via_add_xavp_params")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVia_use_xavp_fields(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("via_use_xavp_fields")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

