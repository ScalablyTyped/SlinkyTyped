package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Venue extends js.Object {
  var address: String = js.native
  var foursquare_id: js.UndefOr[String] = js.native
  var foursquare_type: js.UndefOr[String] = js.native
  var location: Location = js.native
  var title: String = js.native
}

object Venue {
  @scala.inline
  def apply(address: String, location: Location, title: String): Venue = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Venue]
  }
  @scala.inline
  implicit class VenueOps[Self <: Venue] (val x: Self) extends AnyVal {
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
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withFoursquare_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foursquare_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoursquare_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foursquare_type")(js.undefined)
        ret
    }
  }
  
}

