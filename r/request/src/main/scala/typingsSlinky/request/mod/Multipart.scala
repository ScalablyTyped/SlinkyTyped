package typingsSlinky.request.mod

import typingsSlinky.request.AnonBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Multipart extends js.Object {
  var chunked: js.UndefOr[Boolean] = js.native
  var data: js.UndefOr[js.Array[AnonBody]] = js.native
}

object Multipart {
  @scala.inline
  def apply(): Multipart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Multipart]
  }
  @scala.inline
  implicit class MultipartOps[Self <: Multipart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunked")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[AnonBody]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
  }
  
}

