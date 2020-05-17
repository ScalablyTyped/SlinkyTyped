package typingsSlinky.giphyApi.mod

import typingsSlinky.giphyApi.anon.Count
import typingsSlinky.giphyApi.anon.Msg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleResponse extends BaseResponse {
  var data: GIFObject = js.native
}

object SingleResponse {
  @scala.inline
  def apply(data: GIFObject, meta: Msg, pagination: Count): SingleResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleResponse]
  }
  @scala.inline
  implicit class SingleResponseOps[Self <: SingleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: GIFObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

