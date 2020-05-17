package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmsrp extends js.Object {
  def cmap_lookup(): Double = js.native
  def cmap_save(): Double = js.native
  def is_reply(): Double = js.native
  def is_request(): Double = js.native
  def relay(): Double = js.native
  def relay_flags(rtflags: Double): Double = js.native
  def reply(rcode: String, rtext: String, rhdrs: String): Double = js.native
  def reply_flags(rtflags: Double): Double = js.native
  def set_dst(rtaddr: String, rfsock: String): Double = js.native
}

object Typeofmsrp {
  @scala.inline
  def apply(
    cmap_lookup: () => Double,
    cmap_save: () => Double,
    is_reply: () => Double,
    is_request: () => Double,
    relay: () => Double,
    relay_flags: Double => Double,
    reply: (String, String, String) => Double,
    reply_flags: Double => Double,
    set_dst: (String, String) => Double
  ): Typeofmsrp = {
    val __obj = js.Dynamic.literal(cmap_lookup = js.Any.fromFunction0(cmap_lookup), cmap_save = js.Any.fromFunction0(cmap_save), is_reply = js.Any.fromFunction0(is_reply), is_request = js.Any.fromFunction0(is_request), relay = js.Any.fromFunction0(relay), relay_flags = js.Any.fromFunction1(relay_flags), reply = js.Any.fromFunction3(reply), reply_flags = js.Any.fromFunction1(reply_flags), set_dst = js.Any.fromFunction2(set_dst))
    __obj.asInstanceOf[Typeofmsrp]
  }
  @scala.inline
  implicit class TypeofmsrpOps[Self <: Typeofmsrp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmap_lookup(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmap_lookup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCmap_save(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmap_save")(js.Any.fromFunction0(value))
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
    def withRelay(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRelay_flags(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relay_flags")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReply(value: (String, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withReply_flags(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply_flags")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_dst(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_dst")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

