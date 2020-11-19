package typingsSlinky.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoAttemptDelay(value: Double): Self = this.set("autoAttemptDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAttemptDelay: Self = this.set("autoAttemptDelay", js.undefined)
    
    @scala.inline
    def setEnableAuto(value: Boolean): Self = this.set("enableAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAuto: Self = this.set("enableAuto", js.undefined)
    
    @scala.inline
    def setMaxAutoAttempts(value: Double): Self = this.set("maxAutoAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAutoAttempts: Self = this.set("maxAutoAttempts", js.undefined)
    
    @scala.inline
    def setPreventRetryResponseProperty(value: String): Self = this.set("preventRetryResponseProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventRetryResponseProperty: Self = this.set("preventRetryResponseProperty", js.undefined)
  }
}
