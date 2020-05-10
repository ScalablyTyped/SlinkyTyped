package typingsSlinky.azureSb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEtag extends js.Object {
  var etag: js.Any = js.native
}

object AnonEtag {
  @scala.inline
  def apply(etag: js.Any): AnonEtag = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEtag]
  }
  @scala.inline
  implicit class AnonEtagOps[Self <: AnonEtag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtag(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

