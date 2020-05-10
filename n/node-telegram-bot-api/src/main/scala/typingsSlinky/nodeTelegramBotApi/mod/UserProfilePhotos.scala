package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProfilePhotos extends js.Object {
  var photos: js.Array[js.Array[PhotoSize]] = js.native
  var total_count: Double = js.native
}

object UserProfilePhotos {
  @scala.inline
  def apply(photos: js.Array[js.Array[PhotoSize]], total_count: Double): UserProfilePhotos = {
    val __obj = js.Dynamic.literal(photos = photos.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfilePhotos]
  }
  @scala.inline
  implicit class UserProfilePhotosOps[Self <: UserProfilePhotos] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhotos(value: js.Array[js.Array[PhotoSize]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

