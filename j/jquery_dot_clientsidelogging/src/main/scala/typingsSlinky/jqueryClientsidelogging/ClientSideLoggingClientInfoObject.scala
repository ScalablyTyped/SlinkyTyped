package typingsSlinky.jqueryClientsidelogging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientSideLoggingClientInfoObject extends js.Object {
  var location: js.UndefOr[Boolean] = js.native
  	//  The url to the page on which the error occurred.
  var screen_size: js.UndefOr[Boolean] = js.native
  	//  The size of the user's screen (different to the window size because the window might not be maximized)
  var user_agent: js.UndefOr[Boolean] = js.native
  	//  The user agent string.
  var window_size: js.UndefOr[Boolean] = js.native
}

object ClientSideLoggingClientInfoObject {
  @scala.inline
  def apply(): ClientSideLoggingClientInfoObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSideLoggingClientInfoObject]
  }
  @scala.inline
  implicit class ClientSideLoggingClientInfoObjectOps[Self <: ClientSideLoggingClientInfoObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withScreen_size(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreen_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen_size")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_agent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_agent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_agent")(js.undefined)
        ret
    }
    @scala.inline
    def withWindow_size(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindow_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window_size")(js.undefined)
        ret
    }
  }
  
}

