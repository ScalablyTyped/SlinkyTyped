package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofxlog extends js.Object {
  def xalert(lmsg: String): Double = js.native
  def xcrit(lmsg: String): Double = js.native
  def xdbg(lmsg: String): Double = js.native
  def xerr(lmsg: String): Double = js.native
  def xinfo(lmsg: String): Double = js.native
  def xlog(slevel: String, lmsg: String): Double = js.native
  def xnotice(lmsg: String): Double = js.native
  def xwarn(lmsg: String): Double = js.native
}

object Typeofxlog {
  @scala.inline
  def apply(
    xalert: String => Double,
    xcrit: String => Double,
    xdbg: String => Double,
    xerr: String => Double,
    xinfo: String => Double,
    xlog: (String, String) => Double,
    xnotice: String => Double,
    xwarn: String => Double
  ): Typeofxlog = {
    val __obj = js.Dynamic.literal(xalert = js.Any.fromFunction1(xalert), xcrit = js.Any.fromFunction1(xcrit), xdbg = js.Any.fromFunction1(xdbg), xerr = js.Any.fromFunction1(xerr), xinfo = js.Any.fromFunction1(xinfo), xlog = js.Any.fromFunction2(xlog), xnotice = js.Any.fromFunction1(xnotice), xwarn = js.Any.fromFunction1(xwarn))
    __obj.asInstanceOf[Typeofxlog]
  }
  @scala.inline
  implicit class TypeofxlogOps[Self <: Typeofxlog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXalert(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xalert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXcrit(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xcrit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXdbg(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xdbg")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXerr(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xerr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXinfo(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xinfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXlog(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlog")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withXnotice(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xnotice")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXwarn(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xwarn")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

