package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendVenueOptions extends SendBasicOptions {
  var foursquare_id: js.UndefOr[String] = js.native
}

object SendVenueOptions {
  @scala.inline
  def apply(): SendVenueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendVenueOptions]
  }
  @scala.inline
  implicit class SendVenueOptionsOps[Self <: SendVenueOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

