package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccessPolicyResponse extends StObject {
  
  /**
    * The ARN of the access policy, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId} 
    */
  var accessPolicyArn: ARN = js.native
  
  /**
    * The date the access policy was created, in Unix epoch time.
    */
  var accessPolicyCreationDate: js.Date = js.native
  
  /**
    * The ID of the access policy.
    */
  var accessPolicyId: ID = js.native
  
  /**
    * The identity (AWS SSO user, AWS SSO group, or IAM user) to which this access policy applies.
    */
  var accessPolicyIdentity: Identity = js.native
  
  /**
    * The date the access policy was last updated, in Unix epoch time.
    */
  var accessPolicyLastUpdateDate: js.Date = js.native
  
  /**
    * The access policy permission. Note that a project ADMINISTRATOR is also known as a project owner.
    */
  var accessPolicyPermission: Permission = js.native
  
  /**
    * The AWS IoT SiteWise Monitor resource (portal or project) to which this access policy provides access.
    */
  var accessPolicyResource: Resource = js.native
}
object DescribeAccessPolicyResponse {
  
  @scala.inline
  def apply(
    accessPolicyArn: ARN,
    accessPolicyCreationDate: js.Date,
    accessPolicyId: ID,
    accessPolicyIdentity: Identity,
    accessPolicyLastUpdateDate: js.Date,
    accessPolicyPermission: Permission,
    accessPolicyResource: Resource
  ): DescribeAccessPolicyResponse = {
    val __obj = js.Dynamic.literal(accessPolicyArn = accessPolicyArn.asInstanceOf[js.Any], accessPolicyCreationDate = accessPolicyCreationDate.asInstanceOf[js.Any], accessPolicyId = accessPolicyId.asInstanceOf[js.Any], accessPolicyIdentity = accessPolicyIdentity.asInstanceOf[js.Any], accessPolicyLastUpdateDate = accessPolicyLastUpdateDate.asInstanceOf[js.Any], accessPolicyPermission = accessPolicyPermission.asInstanceOf[js.Any], accessPolicyResource = accessPolicyResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccessPolicyResponse]
  }
  
  @scala.inline
  implicit class DescribeAccessPolicyResponseMutableBuilder[Self <: DescribeAccessPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPolicyArn(value: ARN): Self = StObject.set(x, "accessPolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyCreationDate(value: js.Date): Self = StObject.set(x, "accessPolicyCreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyId(value: ID): Self = StObject.set(x, "accessPolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyIdentity(value: Identity): Self = StObject.set(x, "accessPolicyIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyLastUpdateDate(value: js.Date): Self = StObject.set(x, "accessPolicyLastUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyPermission(value: Permission): Self = StObject.set(x, "accessPolicyPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyResource(value: Resource): Self = StObject.set(x, "accessPolicyResource", value.asInstanceOf[js.Any])
  }
}
