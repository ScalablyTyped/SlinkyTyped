package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficPolicy extends StObject {
  
  /**
    * The comment that you specify in the CreateTrafficPolicy request, if any.
    */
  var Comment: js.UndefOr[TrafficPolicyComment] = js.native
  
  /**
    * The definition of a traffic policy in JSON format. You specify the JSON document to use for a new traffic policy in the CreateTrafficPolicy request. For more information about the JSON format, see Traffic Policy Document Format.
    */
  var Document: TrafficPolicyDocument = js.native
  
  /**
    * The ID that Amazon Route 53 assigned to a traffic policy when you created it.
    */
  var Id: TrafficPolicyId = js.native
  
  /**
    * The name that you specified when you created the traffic policy.
    */
  var Name: TrafficPolicyName = js.native
  
  /**
    * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a traffic policy instance.
    */
  var Type: RRType = js.native
  
  /**
    * The version number that Amazon Route 53 assigns to a traffic policy. For a new traffic policy, the value of Version is always 1.
    */
  var Version: TrafficPolicyVersion = js.native
}
object TrafficPolicy {
  
  @scala.inline
  def apply(
    Document: TrafficPolicyDocument,
    Id: TrafficPolicyId,
    Name: TrafficPolicyName,
    Type: RRType,
    Version: TrafficPolicyVersion
  ): TrafficPolicy = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficPolicy]
  }
  
  @scala.inline
  implicit class TrafficPolicyMutableBuilder[Self <: TrafficPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: TrafficPolicyComment): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setDocument(value: TrafficPolicyDocument): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TrafficPolicyId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: TrafficPolicyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: RRType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: TrafficPolicyVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
