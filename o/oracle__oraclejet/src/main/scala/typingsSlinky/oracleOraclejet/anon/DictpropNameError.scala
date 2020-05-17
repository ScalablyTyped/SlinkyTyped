package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.ojmodelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictpropNameError
  extends /* key */ StringDictionary[js.Any] {
  var error: js.UndefOr[js.Function3[/* model */ Model, /* xhr */ js.Any, /* options */ js.Object, Unit]] = js.native
  var success: js.UndefOr[
    js.Function3[/* model */ Model, /* response */ js.Any, /* options */ js.Object, Unit]
  ] = js.native
}

object DictpropNameError {
  @scala.inline
  def apply(): DictpropNameError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictpropNameError]
  }
  @scala.inline
  implicit class DictpropNameErrorOps[Self <: DictpropNameError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: (/* model */ Model, /* xhr */ js.Any, /* options */ js.Object) => Unit): Self = {
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
    def withSuccess(value: (/* model */ Model, /* response */ js.Any, /* options */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction3(value))
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

