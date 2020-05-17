package typingsSlinky.loadjs.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.loadjs.loadjsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined loadjs.loadjs.LoadOptions & {  returnPromise  :true} */
@js.native
trait LoadOptionsreturnPromiset extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var before: js.UndefOr[js.Function2[/* path */ String, /* scriptEl */ HTMLElement, Unit]] = js.native
   // Arguments provided are different in case of returnPromise: true / false
  var error: js.UndefOr[js.Function1[/* depsNotFound */ js.Array[String], Unit]] = js.native
  var numRetries: js.UndefOr[Double] = js.native
  var returnPromise: `true` = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}

object LoadOptionsreturnPromiset {
  @scala.inline
  def apply(returnPromise: `true`): LoadOptionsreturnPromiset = {
    val __obj = js.Dynamic.literal(returnPromise = returnPromise.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadOptionsreturnPromiset]
  }
  @scala.inline
  implicit class LoadOptionsreturnPromisetOps[Self <: LoadOptionsreturnPromiset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReturnPromise(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnPromise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: (/* path */ String, /* scriptEl */ HTMLElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* depsNotFound */ js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withNumRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction0(value))
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

