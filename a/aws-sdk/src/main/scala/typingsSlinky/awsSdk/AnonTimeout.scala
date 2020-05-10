package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTimeout extends js.Object {
  /**
    * a timeout value in milliseconds to wait before aborting the connection. Set to 0 for no timeout.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object AnonTimeout {
  @scala.inline
  def apply(): AnonTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTimeout]
  }
  @scala.inline
  implicit class AnonTimeoutOps[Self <: AnonTimeout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

