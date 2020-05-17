package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofuac extends js.Object {
  def uac_auth(): Double = js.native
  def uac_reg_disable(attr: String, `val`: String): Double = js.native
  def uac_reg_enable(attr: String, `val`: String): Double = js.native
  def uac_reg_lookup(userid: String, sdst: String): Double = js.native
  def uac_reg_refresh(l_uuid: String): Double = js.native
  def uac_reg_request_to(userid: String, imode: Double): Double = js.native
  def uac_reg_status(sruuid: String): Double = js.native
  def uac_replace_from(pdsp: String, puri: String): Double = js.native
  def uac_replace_from_uri(puri: String): Double = js.native
  def uac_replace_to(pdsp: String, puri: String): Double = js.native
  def uac_replace_to_uri(puri: String): Double = js.native
  def uac_req_send(): Double = js.native
  def uac_restore_from(): Double = js.native
  def uac_restore_to(): Double = js.native
}

object Typeofuac {
  @scala.inline
  def apply(
    uac_auth: () => Double,
    uac_reg_disable: (String, String) => Double,
    uac_reg_enable: (String, String) => Double,
    uac_reg_lookup: (String, String) => Double,
    uac_reg_refresh: String => Double,
    uac_reg_request_to: (String, Double) => Double,
    uac_reg_status: String => Double,
    uac_replace_from: (String, String) => Double,
    uac_replace_from_uri: String => Double,
    uac_replace_to: (String, String) => Double,
    uac_replace_to_uri: String => Double,
    uac_req_send: () => Double,
    uac_restore_from: () => Double,
    uac_restore_to: () => Double
  ): Typeofuac = {
    val __obj = js.Dynamic.literal(uac_auth = js.Any.fromFunction0(uac_auth), uac_reg_disable = js.Any.fromFunction2(uac_reg_disable), uac_reg_enable = js.Any.fromFunction2(uac_reg_enable), uac_reg_lookup = js.Any.fromFunction2(uac_reg_lookup), uac_reg_refresh = js.Any.fromFunction1(uac_reg_refresh), uac_reg_request_to = js.Any.fromFunction2(uac_reg_request_to), uac_reg_status = js.Any.fromFunction1(uac_reg_status), uac_replace_from = js.Any.fromFunction2(uac_replace_from), uac_replace_from_uri = js.Any.fromFunction1(uac_replace_from_uri), uac_replace_to = js.Any.fromFunction2(uac_replace_to), uac_replace_to_uri = js.Any.fromFunction1(uac_replace_to_uri), uac_req_send = js.Any.fromFunction0(uac_req_send), uac_restore_from = js.Any.fromFunction0(uac_restore_from), uac_restore_to = js.Any.fromFunction0(uac_restore_to))
    __obj.asInstanceOf[Typeofuac]
  }
  @scala.inline
  implicit class TypeofuacOps[Self <: Typeofuac] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUac_auth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uac_auth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUac_reg_disable(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uac_reg_disable")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUac_reg_enable(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uac_reg_enable")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUac_reg_lookup(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uac_reg_lookup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUac_reg_refresh(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uac_reg_refresh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUac_reg_request_to(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uac_reg_request_to")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUac_reg_status(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uac_reg_status")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUac_replace_from(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uac_replace_from")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUac_replace_from_uri(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uac_replace_from_uri")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUac_replace_to(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uac_replace_to")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUac_replace_to_uri(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uac_replace_to_uri")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUac_req_send(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uac_req_send")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUac_restore_from(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uac_restore_from")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUac_restore_to(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uac_restore_to")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

