package typingsSlinky.backboneMarionette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioMixinOptions extends js.Object {
  /**
    * Defines the Radio channel that will be used for the requests and/or
    * events.
    */
  var channelName: js.UndefOr[String] = js.native
  /**
    * Defines an events hash with the events to be listened and its respective
    * handlers.
    */
  var radioEvents: js.UndefOr[js.Any] = js.native
  /**
    * Defines an events hash with the requests to be replied and its respective
    * handlers
    */
  var radioRequests: js.UndefOr[js.Any] = js.native
}

object RadioMixinOptions {
  @scala.inline
  def apply(): RadioMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioMixinOptions]
  }
  @scala.inline
  implicit class RadioMixinOptionsOps[Self <: RadioMixinOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelName")(js.undefined)
        ret
    }
    @scala.inline
    def withRadioEvents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadioEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withRadioRequests(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadioRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioRequests")(js.undefined)
        ret
    }
  }
  
}

