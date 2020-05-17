package typingsSlinky.iobroker.anon

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestEnum extends js.Object {
  var requestEnum: String = js.native
  var result: Record[String, _] = js.native
}

object RequestEnum {
  @scala.inline
  def apply(requestEnum: String, result: Record[String, _]): RequestEnum = {
    val __obj = js.Dynamic.literal(requestEnum = requestEnum.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEnum]
  }
  @scala.inline
  implicit class RequestEnumOps[Self <: RequestEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestEnum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestEnum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

