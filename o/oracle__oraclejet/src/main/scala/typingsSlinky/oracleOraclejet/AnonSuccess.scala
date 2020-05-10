package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSuccess
  extends /* key */ StringDictionary[js.Any] {
  var error: js.UndefOr[js.Function3[/* xhr */ js.Any, /* status */ js.Any, /* error */ js.Any, Unit]] = js.native
  var success: js.UndefOr[js.Function1[/* json */ js.UndefOr[js.Array[_]], Unit]] = js.native
}

object AnonSuccess {
  @scala.inline
  def apply(): AnonSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSuccess]
  }
  @scala.inline
  implicit class AnonSuccessOps[Self <: AnonSuccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: (/* xhr */ js.Any, /* status */ js.Any, /* error */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* json */ js.UndefOr[js.Array[_]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

