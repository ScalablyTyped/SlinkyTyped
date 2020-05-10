package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDuration extends js.Object {
  var delay: js.UndefOr[String] = js.native
  var duration: js.UndefOr[String] = js.native
  var endOpacity: js.UndefOr[Double] = js.native
  var persist: js.UndefOr[String] = js.native
  var startOpacity: js.UndefOr[Double] = js.native
  var timingFunction: js.UndefOr[String] = js.native
}

object AnonDuration {
  @scala.inline
  def apply(): AnonDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDuration]
  }
  @scala.inline
  implicit class AnonDurationOps[Self <: AnonDuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEndOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withPersist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(js.undefined)
        ret
    }
    @scala.inline
    def withStartOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withTimingFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingFunction")(js.undefined)
        ret
    }
  }
  
}

