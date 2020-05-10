package typingsSlinky.beanstalkdWorker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeanstalkdHandleOptions extends js.Object {
  /** Backoff handling options */
  var backoff: js.UndefOr[BeanstalkdHandleBackoff] = js.native
  /** Total amount of tries including the first one. */
  var tries: js.UndefOr[Double] = js.native
  /** Total number of watcher handling this Tube simultaneously. */
  var width: js.UndefOr[Double] = js.native
}

object BeanstalkdHandleOptions {
  @scala.inline
  def apply(): BeanstalkdHandleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeanstalkdHandleOptions]
  }
  @scala.inline
  implicit class BeanstalkdHandleOptionsOps[Self <: BeanstalkdHandleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackoff(value: BeanstalkdHandleBackoff): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoff")(js.undefined)
        ret
    }
    @scala.inline
    def withTries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tries")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

