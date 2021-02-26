package typingsSlinky.googleCloudStorage.fileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateSignedPostPolicyV4Options extends StObject {
  
  var bucketBoundHostname: js.UndefOr[String] = js.native
  
  var conditions: js.UndefOr[js.Array[js.Object]] = js.native
  
  var expires: String | Double | js.Date = js.native
  
  var fields: js.UndefOr[PolicyFields] = js.native
  
  var virtualHostedStyle: js.UndefOr[Boolean] = js.native
}
object GenerateSignedPostPolicyV4Options {
  
  @scala.inline
  def apply(expires: String | Double | js.Date): GenerateSignedPostPolicyV4Options = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateSignedPostPolicyV4Options]
  }
  
  @scala.inline
  implicit class GenerateSignedPostPolicyV4OptionsMutableBuilder[Self <: GenerateSignedPostPolicyV4Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketBoundHostname(value: String): Self = StObject.set(x, "bucketBoundHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketBoundHostnameUndefined: Self = StObject.set(x, "bucketBoundHostname", js.undefined)
    
    @scala.inline
    def setConditions(value: js.Array[js.Object]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: js.Object*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setExpires(value: String | Double | js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresDate(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: PolicyFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setVirtualHostedStyle(value: Boolean): Self = StObject.set(x, "virtualHostedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualHostedStyleUndefined: Self = StObject.set(x, "virtualHostedStyle", js.undefined)
  }
}
