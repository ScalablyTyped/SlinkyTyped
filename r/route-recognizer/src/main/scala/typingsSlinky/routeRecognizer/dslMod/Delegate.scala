package typingsSlinky.routeRecognizer.dslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delegate extends js.Object {
  var contextEntered: js.UndefOr[js.Function2[/* context */ String, /* route */ MatchDSL, Unit]] = js.native
  var willAddRoute: js.UndefOr[js.Function2[/* context */ js.UndefOr[String], /* route */ String, String]] = js.native
}

object Delegate {
  @scala.inline
  def apply(): Delegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delegate]
  }
  @scala.inline
  implicit class DelegateOps[Self <: Delegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextEntered(value: (/* context */ String, /* route */ MatchDSL) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextEntered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutContextEntered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextEntered")(js.undefined)
        ret
    }
    @scala.inline
    def withWillAddRoute(value: (/* context */ js.UndefOr[String], /* route */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willAddRoute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWillAddRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willAddRoute")(js.undefined)
        ret
    }
  }
  
}

