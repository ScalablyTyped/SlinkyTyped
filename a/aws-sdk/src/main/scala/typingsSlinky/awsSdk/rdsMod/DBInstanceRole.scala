package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBInstanceRole extends StObject {
  
  /**
    * The name of the feature associated with the AWS Identity and Access Management (IAM) role. For the list of supported feature names, see DBEngineVersion. 
    */
  var FeatureName: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB instance.
    */
  var RoleArn: js.UndefOr[String] = js.native
  
  /**
    * Describes the state of association between the IAM role and the DB instance. The Status property returns one of the following values:    ACTIVE - the IAM role ARN is associated with the DB instance and can be used to access other AWS services on your behalf.    PENDING - the IAM role ARN is being associated with the DB instance.    INVALID - the IAM role ARN is associated with the DB instance, but the DB instance is unable to assume the IAM role in order to access other AWS services on your behalf.  
    */
  var Status: js.UndefOr[String] = js.native
}
object DBInstanceRole {
  
  @scala.inline
  def apply(): DBInstanceRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBInstanceRole]
  }
  
  @scala.inline
  implicit class DBInstanceRoleMutableBuilder[Self <: DBInstanceRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatureName(value: String): Self = StObject.set(x, "FeatureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureNameUndefined: Self = StObject.set(x, "FeatureName", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
