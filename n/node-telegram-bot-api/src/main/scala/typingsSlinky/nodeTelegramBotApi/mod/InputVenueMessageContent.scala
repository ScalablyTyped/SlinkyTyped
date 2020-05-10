package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputVenueMessageContent extends InputLocationMessageContent {
  var address: String = js.native
  var foursquare_id: js.UndefOr[String] = js.native
  var title: String = js.native
}

object InputVenueMessageContent {
  @scala.inline
  def apply(address: String, latitude: Double, longitude: Double, title: String): InputVenueMessageContent = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputVenueMessageContent]
  }
  @scala.inline
  implicit class InputVenueMessageContentOps[Self <: InputVenueMessageContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFoursquare_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foursquare_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoursquare_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foursquare_id")(js.undefined)
        ret
    }
  }
  
}

