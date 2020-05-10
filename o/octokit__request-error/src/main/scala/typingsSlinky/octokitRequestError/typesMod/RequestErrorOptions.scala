package typingsSlinky.octokitRequestError.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestErrorOptions extends js.Object {
  var headers: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponseHeaders */ js.Any
  ] = js.native
  var request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestOptions */ js.Any = js.native
}

object RequestErrorOptions {
  @scala.inline
  def apply(
    request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestOptions */ js.Any
  ): RequestErrorOptions = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestErrorOptions]
  }
  @scala.inline
  implicit class RequestErrorOptionsOps[Self <: RequestErrorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestOptions */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponseHeaders */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
  }
  
}

