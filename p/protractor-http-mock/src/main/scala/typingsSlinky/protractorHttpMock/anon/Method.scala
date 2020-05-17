package typingsSlinky.protractorHttpMock.anon

import typingsSlinky.protractorHttpMock.protractorHttpMockStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Method[TPayload] extends js.Object {
  var data: TPayload = js.native
  var method: POST = js.native
  var path: String = js.native
  var regex: js.UndefOr[Boolean] = js.native
}

object Method {
  @scala.inline
  def apply[TPayload](data: TPayload, method: POST, path: String): Method[TPayload] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method[TPayload]]
  }
  @scala.inline
  implicit class MethodOps[Self[tpayload] <: Method[tpayload], TPayload] (val x: Self[TPayload]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TPayload] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TPayload]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TPayload] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TPayload] with Other]
    @scala.inline
    def withData(value: TPayload): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: POST): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegex(value: Boolean): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegex: Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(js.undefined)
        ret
    }
  }
  
}

