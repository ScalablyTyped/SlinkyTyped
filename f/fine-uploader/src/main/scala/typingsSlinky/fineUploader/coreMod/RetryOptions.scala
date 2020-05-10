package typingsSlinky.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryOptions extends js.Object {
  /**
    * The number of seconds to wait between auto retry attempts
    *
    * @default `5`
    */
  var autoAttemptDelay: js.UndefOr[Double] = js.native
  /**
    * Enable or disable retrying uploads that receive any error response
    *
    * @default `false`
    */
  var enableAuto: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of times to attempt to retry a failed upload
    *
    * @default `3`
    */
  var maxAutoAttempts: js.UndefOr[Double] = js.native
  /**
    * This property will be looked for in the server response and, if found and `true`, will indicate that no more retries should be attempted for this item
    *
    * @default `'preventRetry'`
    */
  var preventRetryResponseProperty: js.UndefOr[String] = js.native
}

object RetryOptions {
  @scala.inline
  def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  @scala.inline
  implicit class RetryOptionsOps[Self <: RetryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoAttemptDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAttemptDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAttemptDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAttemptDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAuto")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAutoAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAutoAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAutoAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAutoAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventRetryResponseProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventRetryResponseProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventRetryResponseProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventRetryResponseProperty")(js.undefined)
        ret
    }
  }
  
}

