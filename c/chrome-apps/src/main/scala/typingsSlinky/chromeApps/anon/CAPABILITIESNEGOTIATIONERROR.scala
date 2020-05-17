package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.capabilities_negotiation_error_
import typingsSlinky.chromeApps.chromeAppsStrings.connection_error_
import typingsSlinky.chromeApps.chromeAppsStrings.media_pipeline_error_
import typingsSlinky.chromeApps.chromeAppsStrings.timeout_error_
import typingsSlinky.chromeApps.chromeAppsStrings.unknown_error_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CAPABILITIESNEGOTIATIONERROR extends js.Object {
  var CAPABILITIES_NEGOTIATION_ERROR: capabilities_negotiation_error_ = js.native
  var CONNECTION_ERROR: connection_error_ = js.native
  var MEDIA_PIPELINE_ERROR: media_pipeline_error_ = js.native
  var TIMEOUT_ERROR: timeout_error_ = js.native
  var UNKNOWN_ERROR: unknown_error_ = js.native
}

object CAPABILITIESNEGOTIATIONERROR {
  @scala.inline
  def apply(
    CAPABILITIES_NEGOTIATION_ERROR: capabilities_negotiation_error_,
    CONNECTION_ERROR: connection_error_,
    MEDIA_PIPELINE_ERROR: media_pipeline_error_,
    TIMEOUT_ERROR: timeout_error_,
    UNKNOWN_ERROR: unknown_error_
  ): CAPABILITIESNEGOTIATIONERROR = {
    val __obj = js.Dynamic.literal(CAPABILITIES_NEGOTIATION_ERROR = CAPABILITIES_NEGOTIATION_ERROR.asInstanceOf[js.Any], CONNECTION_ERROR = CONNECTION_ERROR.asInstanceOf[js.Any], MEDIA_PIPELINE_ERROR = MEDIA_PIPELINE_ERROR.asInstanceOf[js.Any], TIMEOUT_ERROR = TIMEOUT_ERROR.asInstanceOf[js.Any], UNKNOWN_ERROR = UNKNOWN_ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAPABILITIESNEGOTIATIONERROR]
  }
  @scala.inline
  implicit class CAPABILITIESNEGOTIATIONERROROps[Self <: CAPABILITIESNEGOTIATIONERROR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCAPABILITIES_NEGOTIATION_ERROR(value: capabilities_negotiation_error_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CAPABILITIES_NEGOTIATION_ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCONNECTION_ERROR(value: connection_error_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMEDIA_PIPELINE_ERROR(value: media_pipeline_error_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_PIPELINE_ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTIMEOUT_ERROR(value: timeout_error_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT_ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNKNOWN_ERROR(value: unknown_error_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ERROR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

