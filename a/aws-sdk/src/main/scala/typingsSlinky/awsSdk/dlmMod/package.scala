package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object dlmMod {
  
  type AvailabilityZone = java.lang.String
  
  type AvailabilityZoneList = js.Array[typingsSlinky.awsSdk.dlmMod.AvailabilityZone]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.dlmMod.ClientApiVersions
  
  type CmkArn = java.lang.String
  
  type CopyTags = scala.Boolean
  
  type CopyTagsNullable = scala.Boolean
  
  type Count = scala.Double
  
  type CronExpression = java.lang.String
  
  type CrossRegionCopyRules = js.Array[typingsSlinky.awsSdk.dlmMod.CrossRegionCopyRule]
  
  type Encrypted = scala.Boolean
  
  type ExcludeBootVolume = scala.Boolean
  
  type ExecutionRoleArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type GettablePolicyStateValues = typingsSlinky.awsSdk.dlmMod._GettablePolicyStateValues | java.lang.String
  
  type Interval = scala.Double
  
  type IntervalUnitValues = typingsSlinky.awsSdk.awsSdkStrings.HOURS | java.lang.String
  
  type LifecyclePolicySummaryList = js.Array[typingsSlinky.awsSdk.dlmMod.LifecyclePolicySummary]
  
  type PolicyArn = java.lang.String
  
  type PolicyDescription = java.lang.String
  
  type PolicyId = java.lang.String
  
  type PolicyIdList = js.Array[typingsSlinky.awsSdk.dlmMod.PolicyId]
  
  type PolicyTypeValues = typingsSlinky.awsSdk.awsSdkStrings.EBS_SNAPSHOT_MANAGEMENT | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.VOLUME
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE
    - java.lang.String
  */
  type ResourceTypeValues = typingsSlinky.awsSdk.dlmMod._ResourceTypeValues | java.lang.String
  
  type ResourceTypeValuesList = js.Array[typingsSlinky.awsSdk.dlmMod.ResourceTypeValues]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DAYS
    - typingsSlinky.awsSdk.awsSdkStrings.WEEKS
    - typingsSlinky.awsSdk.awsSdkStrings.MONTHS
    - typingsSlinky.awsSdk.awsSdkStrings.YEARS
    - java.lang.String
  */
  type RetentionIntervalUnitValues = typingsSlinky.awsSdk.dlmMod._RetentionIntervalUnitValues | java.lang.String
  
  type ScheduleList = js.Array[typingsSlinky.awsSdk.dlmMod.Schedule]
  
  type ScheduleName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type SettablePolicyStateValues = typingsSlinky.awsSdk.dlmMod._SettablePolicyStateValues | java.lang.String
  
  type StatusMessage = java.lang.String
  
  type String = java.lang.String
  
  type TagFilter = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.dlmMod.TagKey]
  
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dlmMod.TagValue]
  
  type TagValue = java.lang.String
  
  type TagsToAddFilterList = js.Array[typingsSlinky.awsSdk.dlmMod.TagFilter]
  
  type TagsToAddList = js.Array[typingsSlinky.awsSdk.dlmMod.Tag]
  
  type TargetRegion = java.lang.String
  
  type TargetTagList = js.Array[typingsSlinky.awsSdk.dlmMod.Tag]
  
  type TargetTagsFilterList = js.Array[typingsSlinky.awsSdk.dlmMod.TagFilter]
  
  type Time = java.lang.String
  
  type TimesList = js.Array[typingsSlinky.awsSdk.dlmMod.Time]
  
  type Timestamp = js.Date
  
  type VariableTagsList = js.Array[typingsSlinky.awsSdk.dlmMod.Tag]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-01-12`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.dlmMod._apiVersion | java.lang.String
}
