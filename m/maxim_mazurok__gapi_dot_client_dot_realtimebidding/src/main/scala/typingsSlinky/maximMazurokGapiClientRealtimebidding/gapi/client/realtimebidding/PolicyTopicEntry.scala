package typingsSlinky.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyTopicEntry extends StObject {
  
  /** Pieces of evidence associated with this policy topic entry. */
  var evidences: js.UndefOr[js.Array[PolicyTopicEvidence]] = js.native
  
  /** URL of the help center article describing this policy topic. */
  var helpCenterUrl: js.UndefOr[String] = js.native
  
  /**
    * Policy topic this entry refers to. For example, "ALCOHOL", "TRADEMARKS_IN_AD_TEXT", or "DESTINATION_NOT_WORKING". The set of possible policy topics is not fixed for a particular API
    * version and may change at any time. Can be used to filter the response of the creatives.list method
    */
  var policyTopic: js.UndefOr[String] = js.native
}
object PolicyTopicEntry {
  
  @scala.inline
  def apply(): PolicyTopicEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyTopicEntry]
  }
  
  @scala.inline
  implicit class PolicyTopicEntryMutableBuilder[Self <: PolicyTopicEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvidences(value: js.Array[PolicyTopicEvidence]): Self = StObject.set(x, "evidences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvidencesUndefined: Self = StObject.set(x, "evidences", js.undefined)
    
    @scala.inline
    def setEvidencesVarargs(value: PolicyTopicEvidence*): Self = StObject.set(x, "evidences", js.Array(value :_*))
    
    @scala.inline
    def setHelpCenterUrl(value: String): Self = StObject.set(x, "helpCenterUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpCenterUrlUndefined: Self = StObject.set(x, "helpCenterUrl", js.undefined)
    
    @scala.inline
    def setPolicyTopic(value: String): Self = StObject.set(x, "policyTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTopicUndefined: Self = StObject.set(x, "policyTopic", js.undefined)
  }
}
