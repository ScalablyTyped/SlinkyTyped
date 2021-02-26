package typingsSlinky.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exclusion extends StObject {
  
  /**
    * The ARN that specifies the exclusion.
    */
  var arn: Arn = js.native
  
  /**
    * The system-defined attributes for the exclusion.
    */
  var attributes: js.UndefOr[AttributeList] = js.native
  
  /**
    * The description of the exclusion.
    */
  var description: Text = js.native
  
  /**
    * The recommendation for the exclusion.
    */
  var recommendation: Text = js.native
  
  /**
    * The AWS resources for which the exclusion pertains.
    */
  var scopes: ScopeList = js.native
  
  /**
    * The name of the exclusion.
    */
  var title: Text = js.native
}
object Exclusion {
  
  @scala.inline
  def apply(arn: Arn, description: Text, recommendation: Text, scopes: ScopeList, title: Text): Exclusion = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exclusion]
  }
  
  @scala.inline
  implicit class ExclusionMutableBuilder[Self <: Exclusion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: AttributeList): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: Text): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendation(value: Text): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopes(value: ScopeList): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesVarargs(value: Scope*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: Text): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
