package typingsSlinky.pulumiAws.outputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderAssumeRole extends StObject {
  
  var durationSeconds: js.UndefOr[Double] = js.native
  
  var externalId: js.UndefOr[String] = js.native
  
  var policy: js.UndefOr[String] = js.native
  
  var policyArns: js.UndefOr[js.Array[String]] = js.native
  
  var roleArn: js.UndefOr[String] = js.native
  
  var sessionName: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  
  var transitiveTagKeys: js.UndefOr[js.Array[String]] = js.native
}
object ProviderAssumeRole {
  
  @scala.inline
  def apply(): ProviderAssumeRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderAssumeRole]
  }
  
  @scala.inline
  implicit class ProviderAssumeRoleMutableBuilder[Self <: ProviderAssumeRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationSeconds(value: Double): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
    
    @scala.inline
    def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyArns(value: js.Array[String]): Self = StObject.set(x, "policyArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyArnsUndefined: Self = StObject.set(x, "policyArns", js.undefined)
    
    @scala.inline
    def setPolicyArnsVarargs(value: String*): Self = StObject.set(x, "policyArns", js.Array(value :_*))
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    @scala.inline
    def setSessionName(value: String): Self = StObject.set(x, "sessionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionNameUndefined: Self = StObject.set(x, "sessionName", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTransitiveTagKeys(value: js.Array[String]): Self = StObject.set(x, "transitiveTagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitiveTagKeysUndefined: Self = StObject.set(x, "transitiveTagKeys", js.undefined)
    
    @scala.inline
    def setTransitiveTagKeysVarargs(value: String*): Self = StObject.set(x, "transitiveTagKeys", js.Array(value :_*))
  }
}
