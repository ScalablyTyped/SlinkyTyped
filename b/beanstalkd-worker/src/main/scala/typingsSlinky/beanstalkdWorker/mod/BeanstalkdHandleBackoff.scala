package typingsSlinky.beanstalkdWorker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeanstalkdHandleBackoff extends js.Object {
  /** Multiple backoff by N each try. */
  var exponential: js.UndefOr[Double] = js.native
  /** Initial time to wait (in milliseconds). */
  var initial: js.UndefOr[Double] = js.native
}

object BeanstalkdHandleBackoff {
  @scala.inline
  def apply(): BeanstalkdHandleBackoff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeanstalkdHandleBackoff]
  }
  @scala.inline
  implicit class BeanstalkdHandleBackoffOps[Self <: BeanstalkdHandleBackoff] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExponential(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExponential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponential")(js.undefined)
        ret
    }
    @scala.inline
    def withInitial(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(js.undefined)
        ret
    }
  }
  
}

