package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Conditions extends js.Object {
  
  /** A collection of conditions. */
  var conditions: js.UndefOr[js.Array[GooglePrivacyDlpV2Condition]] = js.native
}
object GooglePrivacyDlpV2Conditions {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Conditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Conditions]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ConditionsOps[Self <: GooglePrivacyDlpV2Conditions] (val x: Self) extends AnyVal {
    
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
    def setConditionsVarargs(value: GooglePrivacyDlpV2Condition*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[GooglePrivacyDlpV2Condition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
  }
}
