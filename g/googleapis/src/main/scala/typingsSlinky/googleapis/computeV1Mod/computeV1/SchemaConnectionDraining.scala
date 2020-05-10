package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message containing connection draining configuration.
  */
@js.native
trait SchemaConnectionDraining extends js.Object {
  /**
    * Time for which instance will be drained (not accept new connections, but
    * still work to finish started).
    */
  var drainingTimeoutSec: js.UndefOr[Double] = js.native
}

object SchemaConnectionDraining {
  @scala.inline
  def apply(): SchemaConnectionDraining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectionDraining]
  }
  @scala.inline
  implicit class SchemaConnectionDrainingOps[Self <: SchemaConnectionDraining] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrainingTimeoutSec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drainingTimeoutSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrainingTimeoutSec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drainingTimeoutSec")(js.undefined)
        ret
    }
  }
  
}

