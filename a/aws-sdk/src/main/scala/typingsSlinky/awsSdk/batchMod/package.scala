package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object batchMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.N_TO_N
    - typingsSlinky.awsSdk.awsSdkStrings.SEQUENTIAL
    - java.lang.String
  */
  type ArrayJobDependency = typingsSlinky.awsSdk.batchMod._ArrayJobDependency | java.lang.String
  
  type ArrayJobStatusSummary = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.batchMod.Integer]
  
  type AttemptDetails = js.Array[typingsSlinky.awsSdk.batchMod.AttemptDetail]
  
  type Boolean = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type CEState = typingsSlinky.awsSdk.batchMod._CEState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.VALID
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID
    - java.lang.String
  */
  type CEStatus = typingsSlinky.awsSdk.batchMod._CEStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MANAGED
    - typingsSlinky.awsSdk.awsSdkStrings.UNMANAGED
    - java.lang.String
  */
  type CEType = typingsSlinky.awsSdk.batchMod._CEType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BEST_FIT
    - typingsSlinky.awsSdk.awsSdkStrings.BEST_FIT_PROGRESSIVE
    - typingsSlinky.awsSdk.awsSdkStrings.SPOT_CAPACITY_OPTIMIZED
    - java.lang.String
  */
  type CRAllocationStrategy = typingsSlinky.awsSdk.batchMod._CRAllocationStrategy | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EC2
    - typingsSlinky.awsSdk.awsSdkStrings.SPOT
    - java.lang.String
  */
  type CRType = typingsSlinky.awsSdk.batchMod._CRType | java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.batchMod.ClientApiVersions
  
  type ComputeEnvironmentDetailList = js.Array[typingsSlinky.awsSdk.batchMod.ComputeEnvironmentDetail]
  
  type ComputeEnvironmentOrders = js.Array[typingsSlinky.awsSdk.batchMod.ComputeEnvironmentOrder]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.READ
    - typingsSlinky.awsSdk.awsSdkStrings.WRITE
    - typingsSlinky.awsSdk.awsSdkStrings.MKNOD
    - java.lang.String
  */
  type DeviceCgroupPermission = typingsSlinky.awsSdk.batchMod._DeviceCgroupPermission | java.lang.String
  
  type DeviceCgroupPermissions = js.Array[typingsSlinky.awsSdk.batchMod.DeviceCgroupPermission]
  
  type DevicesList = js.Array[typingsSlinky.awsSdk.batchMod.Device]
  
  type EnvironmentVariables = js.Array[typingsSlinky.awsSdk.batchMod.KeyValuePair]
  
  type EvaluateOnExitList = js.Array[typingsSlinky.awsSdk.batchMod.EvaluateOnExit]
  
  type Integer = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type JQState = typingsSlinky.awsSdk.batchMod._JQState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.VALID
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID
    - java.lang.String
  */
  type JQStatus = typingsSlinky.awsSdk.batchMod._JQStatus | java.lang.String
  
  type JobDefinitionList = js.Array[typingsSlinky.awsSdk.batchMod.JobDefinition]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.container_
    - typingsSlinky.awsSdk.awsSdkStrings.multinode
    - java.lang.String
  */
  type JobDefinitionType = typingsSlinky.awsSdk.batchMod._JobDefinitionType | java.lang.String
  
  type JobDependencyList = js.Array[typingsSlinky.awsSdk.batchMod.JobDependency]
  
  type JobDetailList = js.Array[typingsSlinky.awsSdk.batchMod.JobDetail]
  
  type JobQueueDetailList = js.Array[typingsSlinky.awsSdk.batchMod.JobQueueDetail]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNABLE
    - typingsSlinky.awsSdk.awsSdkStrings.STARTING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type JobStatus = typingsSlinky.awsSdk.batchMod._JobStatus | java.lang.String
  
  type JobSummaryList = js.Array[typingsSlinky.awsSdk.batchMod.JobSummary]
  
  type LogConfigurationOptionsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.batchMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`json-file`
    - typingsSlinky.awsSdk.awsSdkStrings.syslog
    - typingsSlinky.awsSdk.awsSdkStrings.journald
    - typingsSlinky.awsSdk.awsSdkStrings.gelf
    - typingsSlinky.awsSdk.awsSdkStrings.fluentd
    - typingsSlinky.awsSdk.awsSdkStrings.awslogs
    - typingsSlinky.awsSdk.awsSdkStrings.splunk
    - java.lang.String
  */
  type LogDriver = typingsSlinky.awsSdk.batchMod._LogDriver | java.lang.String
  
  type Long = scala.Double
  
  type MountPoints = js.Array[typingsSlinky.awsSdk.batchMod.MountPoint]
  
  type NetworkInterfaceList = js.Array[typingsSlinky.awsSdk.batchMod.NetworkInterface]
  
  type NodePropertyOverrides = js.Array[typingsSlinky.awsSdk.batchMod.NodePropertyOverride]
  
  type NodeRangeProperties = js.Array[typingsSlinky.awsSdk.batchMod.NodeRangeProperty]
  
  type ParametersMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.batchMod.String]
  
  type ResourceRequirements = js.Array[typingsSlinky.awsSdk.batchMod.ResourceRequirement]
  
  type ResourceType = typingsSlinky.awsSdk.awsSdkStrings.GPU | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RETRY
    - typingsSlinky.awsSdk.awsSdkStrings.EXIT
    - java.lang.String
  */
  type RetryAction = typingsSlinky.awsSdk.batchMod._RetryAction | java.lang.String
  
  type SecretList = js.Array[typingsSlinky.awsSdk.batchMod.Secret]
  
  type String = java.lang.String
  
  type StringList = js.Array[typingsSlinky.awsSdk.batchMod.String]
  
  type TagKey = java.lang.String
  
  type TagKeysList = js.Array[typingsSlinky.awsSdk.batchMod.TagKey]
  
  type TagValue = java.lang.String
  
  type TagrisTagsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.batchMod.TagValue]
  
  type TagsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.batchMod.String]
  
  type TmpfsList = js.Array[typingsSlinky.awsSdk.batchMod.Tmpfs]
  
  type Ulimits = js.Array[typingsSlinky.awsSdk.batchMod.Ulimit]
  
  type Volumes = js.Array[typingsSlinky.awsSdk.batchMod.Volume]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-08-10`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.batchMod._apiVersion | java.lang.String
}
