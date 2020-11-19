package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cloud9Mod {
  
  type AutomaticStopTimeMinutes = scala.Double
  
  type BoundedEnvironmentIdList = js.Array[typingsSlinky.awsSdk.cloud9Mod.EnvironmentId]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.cloud9Mod.ClientApiVersions
  
  type ClientRequestToken = java.lang.String
  
  type EnvironmentArn = java.lang.String
  
  type EnvironmentDescription = java.lang.String
  
  type EnvironmentId = java.lang.String
  
  type EnvironmentIdList = js.Array[typingsSlinky.awsSdk.cloud9Mod.EnvironmentId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type EnvironmentLifecycleStatus = typingsSlinky.awsSdk.cloud9Mod._EnvironmentLifecycleStatus | java.lang.String
  
  type EnvironmentList = js.Array[typingsSlinky.awsSdk.cloud9Mod.Environment]
  
  type EnvironmentMembersList = js.Array[typingsSlinky.awsSdk.cloud9Mod.EnvironmentMember]
  
  type EnvironmentName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.error__
    - typingsSlinky.awsSdk.awsSdkStrings.creating__
    - typingsSlinky.awsSdk.awsSdkStrings.connecting__
    - typingsSlinky.awsSdk.awsSdkStrings.ready__
    - typingsSlinky.awsSdk.awsSdkStrings.stopping__
    - typingsSlinky.awsSdk.awsSdkStrings.stopped__
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - java.lang.String
  */
  type EnvironmentStatus = typingsSlinky.awsSdk.cloud9Mod._EnvironmentStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ssh_
    - typingsSlinky.awsSdk.awsSdkStrings.ec2_
    - java.lang.String
  */
  type EnvironmentType = typingsSlinky.awsSdk.cloud9Mod._EnvironmentType | java.lang.String
  
  type InstanceType = java.lang.String
  
  type MaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`read-write`
    - typingsSlinky.awsSdk.awsSdkStrings.`read-only`
    - java.lang.String
  */
  type MemberPermissions = typingsSlinky.awsSdk.cloud9Mod._MemberPermissions | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.owner__
    - typingsSlinky.awsSdk.awsSdkStrings.`read-write`
    - typingsSlinky.awsSdk.awsSdkStrings.`read-only`
    - java.lang.String
  */
  type Permissions = typingsSlinky.awsSdk.cloud9Mod._Permissions | java.lang.String
  
  type PermissionsList = js.Array[typingsSlinky.awsSdk.cloud9Mod.Permissions]
  
  type String = java.lang.String
  
  type SubnetId = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.cloud9Mod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.cloud9Mod.Tag]
  
  type TagValue = java.lang.String
  
  type Timestamp = js.Date
  
  type UserArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-09-23`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.cloud9Mod._apiVersion | java.lang.String
}
