package typingsSlinky.gapiClientSurveys.gapi.client.surveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SurveysStopResponse extends js.Object {
  
  /** Unique request ID used for logging and debugging. Please include in any error reporting or troubleshooting requests. */
  var requestId: js.UndefOr[String] = js.native
}
object SurveysStopResponse {
  
  @scala.inline
  def apply(): SurveysStopResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurveysStopResponse]
  }
  
  @scala.inline
  implicit class SurveysStopResponseOps[Self <: SurveysStopResponse] (val x: Self) extends AnyVal {
    
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
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
}
