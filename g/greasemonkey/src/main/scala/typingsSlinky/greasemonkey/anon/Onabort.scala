package typingsSlinky.greasemonkey.anon

import typingsSlinky.greasemonkey.GM.ProgressResponse
import typingsSlinky.greasemonkey.GM.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Onabort[TContext] extends js.Object {
  var onabort: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.native
  var onerror: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.native
  var onload: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.native
  var onprogress: js.UndefOr[js.Function1[/* response */ ProgressResponse[TContext], Unit]] = js.native
}

object Onabort {
  @scala.inline
  def apply[TContext](): Onabort[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Onabort[TContext]]
  }
  @scala.inline
  implicit class OnabortOps[Self[tcontext] <: Onabort[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withOnabort(value: /* response */ Response[TContext] => Unit): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onabort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnabort: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onabort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerror(value: /* response */ Response[TContext] => Unit): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnerror: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOnload(value: /* response */ Response[TContext] => Unit): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnload: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnprogress(value: /* response */ ProgressResponse[TContext] => Unit): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprogress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnprogress: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprogress")(js.undefined)
        ret
    }
  }
  
}

