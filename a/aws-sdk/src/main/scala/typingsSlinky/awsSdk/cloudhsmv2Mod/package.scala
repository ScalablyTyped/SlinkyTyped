package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cloudhsmv2Mod {
  
  type BackupId = java.lang.String
  
  type BackupPolicy = typingsSlinky.awsSdk.awsSdkStrings.DEFAULT | java.lang.String
  
  type BackupRetentionType = typingsSlinky.awsSdk.awsSdkStrings.DAYS | java.lang.String
  
  type BackupRetentionValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_DELETION
    - java.lang.String
  */
  type BackupState = typingsSlinky.awsSdk.cloudhsmv2Mod._BackupState | java.lang.String
  
  type Backups = js.Array[typingsSlinky.awsSdk.cloudhsmv2Mod.Backup]
  
  type BackupsMaxSize = scala.Double
  
  type Boolean = scala.Boolean
  
  type Cert = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.cloudhsmv2Mod.ClientApiVersions
  
  type ClusterId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.UNINITIALIZED
    - typingsSlinky.awsSdk.awsSdkStrings.INITIALIZE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.INITIALIZED
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.DEGRADED
    - java.lang.String
  */
  type ClusterState = typingsSlinky.awsSdk.cloudhsmv2Mod._ClusterState | java.lang.String
  
  type Clusters = js.Array[typingsSlinky.awsSdk.cloudhsmv2Mod.Cluster]
  
  type ClustersMaxSize = scala.Double
  
  type EniId = java.lang.String
  
  type ExternalAz = java.lang.String
  
  type ExternalSubnetMapping = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cloudhsmv2Mod.SubnetId]
  
  type Field = java.lang.String
  
  type Filters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cloudhsmv2Mod.Strings]
  
  type HsmId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DEGRADED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type HsmState = typingsSlinky.awsSdk.cloudhsmv2Mod._HsmState | java.lang.String
  
  type HsmType = java.lang.String
  
  type Hsms = js.Array[typingsSlinky.awsSdk.cloudhsmv2Mod.Hsm]
  
  type IpAddress = java.lang.String
  
  type MaxSize = scala.Double
  
  type NextToken = java.lang.String
  
  type PreCoPassword = java.lang.String
  
  type Region = java.lang.String
  
  type ResourceId = java.lang.String
  
  type SecurityGroup = java.lang.String
  
  type StateMessage = java.lang.String
  
  type String = java.lang.String
  
  type Strings = js.Array[typingsSlinky.awsSdk.cloudhsmv2Mod.String]
  
  type SubnetId = java.lang.String
  
  type SubnetIds = js.Array[typingsSlinky.awsSdk.cloudhsmv2Mod.SubnetId]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.cloudhsmv2Mod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.cloudhsmv2Mod.Tag]
  
  type TagValue = java.lang.String
  
  type Timestamp = js.Date
  
  type VpcId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-04-28`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.cloudhsmv2Mod._apiVersion | java.lang.String
}
