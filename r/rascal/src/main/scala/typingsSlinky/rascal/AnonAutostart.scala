package typingsSlinky.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutostart extends js.Object {
  var autostart: Boolean = js.native
  var evictionRunIntervalMillis: Double = js.native
  var idleTimeoutMillis: Double = js.native
  var max: Double = js.native
  var min: Double = js.native
  var testOnBorrow: Boolean = js.native
}

object AnonAutostart {
  @scala.inline
  def apply(
    autostart: Boolean,
    evictionRunIntervalMillis: Double,
    idleTimeoutMillis: Double,
    max: Double,
    min: Double,
    testOnBorrow: Boolean
  ): AnonAutostart = {
    val __obj = js.Dynamic.literal(autostart = autostart.asInstanceOf[js.Any], evictionRunIntervalMillis = evictionRunIntervalMillis.asInstanceOf[js.Any], idleTimeoutMillis = idleTimeoutMillis.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], testOnBorrow = testOnBorrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutostart]
  }
  @scala.inline
  implicit class AnonAutostartOps[Self <: AnonAutostart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutostart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autostart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvictionRunIntervalMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evictionRunIntervalMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdleTimeoutMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeoutMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestOnBorrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testOnBorrow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

