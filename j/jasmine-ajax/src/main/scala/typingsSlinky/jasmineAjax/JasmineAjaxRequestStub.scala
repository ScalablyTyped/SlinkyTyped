package typingsSlinky.jasmineAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JasmineAjaxRequestStub extends js.Object {
  var data: String = js.native
  var method: String = js.native
  var query: String = js.native
  var url: js.RegExp | String = js.native
  def andCallFunction(functionToCall: js.Function1[/* request */ JasmineAjaxRequest, Unit]): Unit = js.native
  def andError(options: JasmineAjaxRequestStubErrorOptions): Unit = js.native
  def andReturn(options: JasmineAjaxRequestStubReturnOptions): Unit = js.native
  def andTimeout(): Unit = js.native
  def matches(fullUrl: String, data: String, method: String): Boolean = js.native
}

object JasmineAjaxRequestStub {
  @scala.inline
  def apply(
    andCallFunction: js.Function1[/* request */ JasmineAjaxRequest, Unit] => Unit,
    andError: JasmineAjaxRequestStubErrorOptions => Unit,
    andReturn: JasmineAjaxRequestStubReturnOptions => Unit,
    andTimeout: () => Unit,
    data: String,
    matches: (String, String, String) => Boolean,
    method: String,
    query: String,
    url: js.RegExp | String
  ): JasmineAjaxRequestStub = {
    val __obj = js.Dynamic.literal(andCallFunction = js.Any.fromFunction1(andCallFunction), andError = js.Any.fromFunction1(andError), andReturn = js.Any.fromFunction1(andReturn), andTimeout = js.Any.fromFunction0(andTimeout), data = data.asInstanceOf[js.Any], matches = js.Any.fromFunction3(matches), method = method.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[JasmineAjaxRequestStub]
  }
  @scala.inline
  implicit class JasmineAjaxRequestStubOps[Self <: JasmineAjaxRequestStub] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndCallFunction(value: js.Function1[/* request */ JasmineAjaxRequest, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("andCallFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAndError(value: JasmineAjaxRequestStubErrorOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("andError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAndReturn(value: JasmineAjaxRequestStubReturnOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("andReturn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAndTimeout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("andTimeout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatches(value: (String, String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: js.RegExp | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

