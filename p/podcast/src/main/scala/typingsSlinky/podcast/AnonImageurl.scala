package typingsSlinky.podcast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImageurl extends js.Object {
  var image_url: js.UndefOr[String] = js.native
}

object AnonImageurl {
  @scala.inline
  def apply(): AnonImageurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonImageurl]
  }
  @scala.inline
  implicit class AnonImageurlOps[Self <: AnonImageurl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_url")(js.undefined)
        ret
    }
  }
  
}

