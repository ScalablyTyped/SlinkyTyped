package typingsSlinky.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBeep extends js.Object {
  var beep: js.UndefOr[Boolean] = js.native
  var bridgeId: String = js.native
  var format: String = js.native
  var ifExists: js.UndefOr[String] = js.native
  var maxDurationSeconds: js.UndefOr[Double] = js.native
  var maxSilenceSeconds: js.UndefOr[Double] = js.native
  var name: String = js.native
  var terminateOn: js.UndefOr[String] = js.native
}

object AnonBeep {
  @scala.inline
  def apply(bridgeId: String, format: String, name: String): AnonBeep = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBeep]
  }
  @scala.inline
  implicit class AnonBeepOps[Self <: AnonBeep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBridgeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridgeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beep")(js.undefined)
        ret
    }
    @scala.inline
    def withIfExists(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifExists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifExists")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDurationSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDurationSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSilenceSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSilenceSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSilenceSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSilenceSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminateOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminateOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminateOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminateOn")(js.undefined)
        ret
    }
  }
  
}

