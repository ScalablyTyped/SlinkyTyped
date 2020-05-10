package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.bulk_
import typingsSlinky.chromeApps.chromeAppsStrings.control_
import typingsSlinky.chromeApps.chromeAppsStrings.interrupt_
import typingsSlinky.chromeApps.chromeAppsStrings.isochronous_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBULK extends js.Object {
  var BULK: bulk_ = js.native
  var CONTROL: control_ = js.native
  var INTERRUPT: interrupt_ = js.native
  var ISOCHRONOUS: isochronous_ = js.native
}

object AnonBULK {
  @scala.inline
  def apply(BULK: bulk_, CONTROL: control_, INTERRUPT: interrupt_, ISOCHRONOUS: isochronous_): AnonBULK = {
    val __obj = js.Dynamic.literal(BULK = BULK.asInstanceOf[js.Any], CONTROL = CONTROL.asInstanceOf[js.Any], INTERRUPT = INTERRUPT.asInstanceOf[js.Any], ISOCHRONOUS = ISOCHRONOUS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBULK]
  }
  @scala.inline
  implicit class AnonBULKOps[Self <: AnonBULK] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBULK(value: bulk_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BULK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCONTROL(value: control_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONTROL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINTERRUPT(value: interrupt_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INTERRUPT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withISOCHRONOUS(value: isochronous_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISOCHRONOUS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

