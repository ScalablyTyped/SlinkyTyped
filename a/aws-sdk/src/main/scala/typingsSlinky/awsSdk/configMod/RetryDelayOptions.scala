package typingsSlinky.awsSdk.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryDelayOptions extends js.Object {
  /**
    * The base number of milliseconds to use in the exponential backoff for operation retries.
    * Defaults to 100 ms.
    */
  var base: js.UndefOr[Double] = js.native
  /**
    * A custom function that accepts a retry count and error and returns the amount of time to delay in milliseconds. If the result is a non-zero negative value, no further retry attempts will be made.
    * The base option will be ignored if this option is supplied.
    */
  var customBackoff: js.UndefOr[js.Function2[/* retryCount */ Double, /* err */ js.UndefOr[js.Error], Double]] = js.native
}

object RetryDelayOptions {
  @scala.inline
  def apply(): RetryDelayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryDelayOptions]
  }
  @scala.inline
  implicit class RetryDelayOptionsOps[Self <: RetryDelayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomBackoff(value: (/* retryCount */ Double, /* err */ js.UndefOr[js.Error]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBackoff")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCustomBackoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBackoff")(js.undefined)
        ret
    }
  }
  
}

