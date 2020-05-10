package typingsSlinky.fetchIo.mod

import org.scalajs.dom.experimental.Response
import typingsSlinky.std.BodyInit
import typingsSlinky.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends RequestInit {
  var afterJSON: js.UndefOr[js.Function1[/* body */ js.Any, Unit]] = js.native
  var afterResponse: js.UndefOr[js.Function1[/* res */ Response, Unit]] = js.native
  var beforeRequest: js.UndefOr[js.Function2[/* url */ TUrl, /* body */ BodyInit, Boolean | Unit]] = js.native
  var header: js.UndefOr[Header] = js.native
  var prefix: js.UndefOr[String] = js.native
  var query: js.UndefOr[Query] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterJSON(value: /* body */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterJSON")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterJSON")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterResponse(value: /* res */ Response => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRequest(value: (/* url */ TUrl, /* body */ BodyInit) => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: Header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: Query): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
  }
  
}

