package typingsSlinky.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonALERT extends js.Object {
  var ALERT: String = js.native
  var CRITICAL: String = js.native
  var DEBUG: String = js.native
  var EMERGENCY: String = js.native
  var ERROR: String = js.native
  var INFO: String = js.native
  var NOTICE: String = js.native
  var WARNING: String = js.native
}

object AnonALERT {
  @scala.inline
  def apply(
    ALERT: String,
    CRITICAL: String,
    DEBUG: String,
    EMERGENCY: String,
    ERROR: String,
    INFO: String,
    NOTICE: String,
    WARNING: String
  ): AnonALERT = {
    val __obj = js.Dynamic.literal(ALERT = ALERT.asInstanceOf[js.Any], CRITICAL = CRITICAL.asInstanceOf[js.Any], DEBUG = DEBUG.asInstanceOf[js.Any], EMERGENCY = EMERGENCY.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], NOTICE = NOTICE.asInstanceOf[js.Any], WARNING = WARNING.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonALERT]
  }
  @scala.inline
  implicit class AnonALERTOps[Self <: AnonALERT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withALERT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALERT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCRITICAL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CRITICAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDEBUG(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEMERGENCY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EMERGENCY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERROR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINFO(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INFO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOTICE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOTICE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWARNING(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

