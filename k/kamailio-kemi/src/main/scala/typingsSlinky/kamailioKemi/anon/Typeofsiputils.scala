package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsiputils extends js.Object {
  def has_totag(): Double = js.native
  def is_alphanum(tval: String): Double = js.native
  def is_alphanumex(tval: String, eset: String): Double = js.native
  def is_first_hop(): Double = js.native
  def is_numeric(tval: String): Double = js.native
  def is_reply(): Double = js.native
  def is_request(): Double = js.native
  def is_tel_number(tval: String): Double = js.native
  def is_uri(suri: String): Double = js.native
  def is_user(suser: String): Double = js.native
  def uri_param(sparam: String): Double = js.native
  def uri_param_value(sparam: String, svalue: String): Double = js.native
}

object Typeofsiputils {
  @scala.inline
  def apply(
    has_totag: () => Double,
    is_alphanum: String => Double,
    is_alphanumex: (String, String) => Double,
    is_first_hop: () => Double,
    is_numeric: String => Double,
    is_reply: () => Double,
    is_request: () => Double,
    is_tel_number: String => Double,
    is_uri: String => Double,
    is_user: String => Double,
    uri_param: String => Double,
    uri_param_value: (String, String) => Double
  ): Typeofsiputils = {
    val __obj = js.Dynamic.literal(has_totag = js.Any.fromFunction0(has_totag), is_alphanum = js.Any.fromFunction1(is_alphanum), is_alphanumex = js.Any.fromFunction2(is_alphanumex), is_first_hop = js.Any.fromFunction0(is_first_hop), is_numeric = js.Any.fromFunction1(is_numeric), is_reply = js.Any.fromFunction0(is_reply), is_request = js.Any.fromFunction0(is_request), is_tel_number = js.Any.fromFunction1(is_tel_number), is_uri = js.Any.fromFunction1(is_uri), is_user = js.Any.fromFunction1(is_user), uri_param = js.Any.fromFunction1(uri_param), uri_param_value = js.Any.fromFunction2(uri_param_value))
    __obj.asInstanceOf[Typeofsiputils]
  }
  @scala.inline
  implicit class TypeofsiputilsOps[Self <: Typeofsiputils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHas_totag(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_totag")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIs_alphanum(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_alphanum")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIs_alphanumex(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_alphanumex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIs_first_hop(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_first_hop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIs_numeric(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_numeric")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIs_reply(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_reply")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIs_request(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_request")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIs_tel_number(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_tel_number")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIs_uri(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_uri")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIs_user(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_user")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUri_param(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri_param")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUri_param_value(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri_param_value")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

