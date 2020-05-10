package typingsSlinky.requestPromiseNative.mod

import typingsSlinky.request.mod.CoreOptions
import typingsSlinky.request.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPromiseOptions extends CoreOptions {
  var resolveWithFullResponse: js.UndefOr[Boolean] = js.native
  var simple: js.UndefOr[Boolean] = js.native
  var transform: js.UndefOr[
    js.Function3[
      /* body */ js.Any, 
      /* response */ Response, 
      /* resolveWithFullResponse */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  var transform2xxOnly: js.UndefOr[Boolean] = js.native
}

object RequestPromiseOptions {
  @scala.inline
  def apply(): RequestPromiseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestPromiseOptions]
  }
  @scala.inline
  implicit class RequestPromiseOptionsOps[Self <: RequestPromiseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolveWithFullResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveWithFullResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveWithFullResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveWithFullResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withSimple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simple")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(
      value: (/* body */ js.Any, /* response */ Response, /* resolveWithFullResponse */ js.UndefOr[Boolean]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform2xxOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform2xxOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform2xxOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform2xxOnly")(js.undefined)
        ret
    }
  }
  
}

