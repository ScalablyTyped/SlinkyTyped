package typingsSlinky.podcast.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageUrl_ extends js.Object {
  var imageUrl: js.UndefOr[String] = js.native
}

object ImageUrl_ {
  @scala.inline
  def apply(): ImageUrl_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageUrl_]
  }
  @scala.inline
  implicit class ImageUrl_Ops[Self <: ImageUrl_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
  }
  
}

