package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response to a request to list autoscaling policies in a project.
  */
@js.native
trait SchemaListAutoscalingPoliciesResponse extends StObject {
  
  /**
    * Output only. This token is included in the response if there are more
    * results to fetch.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Output only. Autoscaling policies list.
    */
  var policies: js.UndefOr[js.Array[SchemaAutoscalingPolicy]] = js.native
}
object SchemaListAutoscalingPoliciesResponse {
  
  @scala.inline
  def apply(): SchemaListAutoscalingPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAutoscalingPoliciesResponse]
  }
  
  @scala.inline
  implicit class SchemaListAutoscalingPoliciesResponseMutableBuilder[Self <: SchemaListAutoscalingPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPolicies(value: js.Array[SchemaAutoscalingPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: SchemaAutoscalingPolicy*): Self = StObject.set(x, "policies", js.Array(value :_*))
  }
}
