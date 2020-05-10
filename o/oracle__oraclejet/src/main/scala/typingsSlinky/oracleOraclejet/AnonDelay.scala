package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDelay extends js.Object {
  var delay: js.UndefOr[String] = js.native
  var direction: js.UndefOr[String] = js.native
  var duration: js.UndefOr[String] = js.native
  var endMaxHeight: js.UndefOr[String] = js.native
  var endMaxWidth: js.UndefOr[String] = js.native
  var persist: js.UndefOr[String] = js.native
  var startMaxHeight: js.UndefOr[String] = js.native
  var startMaxWidth: js.UndefOr[String] = js.native
  var timingFunction: js.UndefOr[String] = js.native
}

object AnonDelay {
  @scala.inline
  def apply(): AnonDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDelay]
  }
  @scala.inline
  implicit class AnonDelayOps[Self <: AnonDelay] (val x: Self) extends AnyVal {
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
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
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
    def withEndMaxHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endMaxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endMaxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withEndMaxWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endMaxWidth")(js.undefined)
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
    def withStartMaxHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMaxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMaxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMaxWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMaxWidth")(js.undefined)
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

