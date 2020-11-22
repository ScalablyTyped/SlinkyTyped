package typingsSlinky.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateConsumerOverridesResponse extends js.Object {
  
  /** The overrides that were created. */
  var overrides: js.UndefOr[js.Array[QuotaOverride]] = js.native
}
object BatchCreateConsumerOverridesResponse {
  
  @scala.inline
  def apply(): BatchCreateConsumerOverridesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateConsumerOverridesResponse]
  }
  
  @scala.inline
  implicit class BatchCreateConsumerOverridesResponseOps[Self <: BatchCreateConsumerOverridesResponse] (val x: Self) extends AnyVal {
    
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
    def setOverridesVarargs(value: QuotaOverride*): Self = this.set("overrides", js.Array(value :_*))
    
    @scala.inline
    def setOverrides(value: js.Array[QuotaOverride]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
}
