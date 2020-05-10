package typingsSlinky.ddTrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPort extends js.Object {
  /**
    * The port of the Dogstatsd agent that the metrics will submitted to.
    * @default 8125
    */
  var port: js.UndefOr[Double] = js.native
}

object AnonPort {
  @scala.inline
  def apply(): AnonPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPort]
  }
  @scala.inline
  implicit class AnonPortOps[Self <: AnonPort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
  }
  
}

