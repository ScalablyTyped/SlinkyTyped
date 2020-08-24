package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object syntheticsMod {
  type Arn = java.lang.String
  type Canaries = js.Array[typingsSlinky.awsSdk.syntheticsMod.Canary]
  type CanariesLastRun = js.Array[typingsSlinky.awsSdk.syntheticsMod.CanaryLastRun]
  type CanaryName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.PASSED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CanaryRunState = typingsSlinky.awsSdk.syntheticsMod._CanaryRunState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CANARY_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.EXECUTION_FAILURE
    - java.lang.String
  */
  type CanaryRunStateReasonCode = typingsSlinky.awsSdk.syntheticsMod._CanaryRunStateReasonCode | java.lang.String
  type CanaryRuns = js.Array[typingsSlinky.awsSdk.syntheticsMod.CanaryRun]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - typingsSlinky.awsSdk.awsSdkStrings.STARTING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type CanaryState = typingsSlinky.awsSdk.syntheticsMod._CanaryState | java.lang.String
  type CanaryStateReasonCode = typingsSlinky.awsSdk.awsSdkStrings.INVALID_PERMISSIONS | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.syntheticsMod.ClientApiVersions
  type MaxCanaryResults = scala.Double
  type MaxFifteenMinutesInSeconds = scala.Double
  type MaxOneYearInSeconds = scala.Double
  type MaxSize100 = scala.Double
  type MaxSize1024 = scala.Double
  type MaxSize3008 = scala.Double
  type RuntimeVersionList = js.Array[typingsSlinky.awsSdk.syntheticsMod.RuntimeVersion]
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[typingsSlinky.awsSdk.syntheticsMod.SecurityGroupId]
  type String = java.lang.String
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[typingsSlinky.awsSdk.syntheticsMod.SubnetId]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.syntheticsMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.syntheticsMod.TagValue]
  type TagValue = java.lang.String
  type Timestamp = js.Date
  type Token = java.lang.String
  type UUID = java.lang.String
  type VpcId = java.lang.String
  type _Blob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.syntheticsMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-10-11`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.syntheticsMod._apiVersion | java.lang.String
}
