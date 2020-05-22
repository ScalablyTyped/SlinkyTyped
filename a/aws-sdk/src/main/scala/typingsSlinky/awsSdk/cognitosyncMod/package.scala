package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cognitosyncMod {
  type ApplicationArn = java.lang.String
  type ApplicationArnList = js.Array[typingsSlinky.awsSdk.cognitosyncMod.ApplicationArn]
  type AssumeRoleArn = java.lang.String
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_STARTED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - java.lang.String
  */
  type BulkPublishStatus = typingsSlinky.awsSdk.cognitosyncMod._BulkPublishStatus | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.cognitosyncMod.ClientApiVersions
  type ClientContext = java.lang.String
  type CognitoEventType = java.lang.String
  type DatasetList = js.Array[typingsSlinky.awsSdk.cognitosyncMod.Dataset]
  type DatasetName = java.lang.String
  type Date = js.Date
  type DeviceId = java.lang.String
  type Events = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cognitosyncMod.LambdaFunctionArn]
  type IdentityId = java.lang.String
  type IdentityPoolId = java.lang.String
  type IdentityPoolUsageList = js.Array[typingsSlinky.awsSdk.cognitosyncMod.IdentityPoolUsage]
  type Integer = scala.Double
  type IntegerString = scala.Double
  type LambdaFunctionArn = java.lang.String
  type Long = scala.Double
  type MergedDatasetNameList = js.Array[typingsSlinky.awsSdk.cognitosyncMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.replace_
    - typingsSlinky.awsSdk.awsSdkStrings.remove__
    - java.lang.String
  */
  type Operation = typingsSlinky.awsSdk.cognitosyncMod._Operation | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.APNS
    - typingsSlinky.awsSdk.awsSdkStrings.APNS_SANDBOX
    - typingsSlinky.awsSdk.awsSdkStrings.GCM
    - typingsSlinky.awsSdk.awsSdkStrings.ADM
    - java.lang.String
  */
  type Platform = typingsSlinky.awsSdk.cognitosyncMod._Platform | java.lang.String
  type PushToken = java.lang.String
  type RecordKey = java.lang.String
  type RecordList = js.Array[typingsSlinky.awsSdk.cognitosyncMod.Record]
  type RecordPatchList = js.Array[typingsSlinky.awsSdk.cognitosyncMod.RecordPatch]
  type RecordValue = java.lang.String
  type StreamName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type StreamingStatus = typingsSlinky.awsSdk.cognitosyncMod._StreamingStatus | java.lang.String
  type String = java.lang.String
  type SyncSessionToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-06-30`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.cognitosyncMod._apiVersion | java.lang.String
}
