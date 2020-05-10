package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object appconfigMod {
  type ApplicationList = js.Array[typingsSlinky.awsSdk.appconfigMod.Application]
  type Arn = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.appconfigMod.ClientApiVersions
  type ConfigurationProfileSummaryList = js.Array[typingsSlinky.awsSdk.appconfigMod.ConfigurationProfileSummary]
  type DeploymentList = js.Array[typingsSlinky.awsSdk.appconfigMod.DeploymentSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BAKING
    - typingsSlinky.awsSdk.awsSdkStrings.VALIDATING
    - typingsSlinky.awsSdk.awsSdkStrings.DEPLOYING
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.ROLLING_BACK
    - typingsSlinky.awsSdk.awsSdkStrings.ROLLED_BACK
    - java.lang.String
  */
  type DeploymentState = typingsSlinky.awsSdk.appconfigMod._DeploymentState | java.lang.String
  type DeploymentStrategyId = java.lang.String
  type DeploymentStrategyList = js.Array[typingsSlinky.awsSdk.appconfigMod.DeploymentStrategy]
  type Description = java.lang.String
  type EnvironmentList = js.Array[typingsSlinky.awsSdk.appconfigMod.Environment]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.READY_FOR_DEPLOYMENT
    - typingsSlinky.awsSdk.awsSdkStrings.DEPLOYING
    - typingsSlinky.awsSdk.awsSdkStrings.ROLLING_BACK
    - typingsSlinky.awsSdk.awsSdkStrings.ROLLED_BACK
    - java.lang.String
  */
  type EnvironmentState = typingsSlinky.awsSdk.appconfigMod._EnvironmentState | java.lang.String
  type GrowthFactor = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LINEAR
    - typingsSlinky.awsSdk.awsSdkStrings.EXPONENTIAL
    - java.lang.String
  */
  type GrowthType = typingsSlinky.awsSdk.appconfigMod._GrowthType | java.lang.String
  type Id = java.lang.String
  type Integer = scala.Double
  type Iso8601DateTime = js.Date
  type MaxResults = scala.Double
  type MinutesBetween0And24Hours = scala.Double
  type MonitorList = js.Array[typingsSlinky.awsSdk.appconfigMod.Monitor]
  type Name = java.lang.String
  type NextToken = java.lang.String
  type Percentage = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.SSM_DOCUMENT
    - java.lang.String
  */
  type ReplicateTo = typingsSlinky.awsSdk.appconfigMod._ReplicateTo | java.lang.String
  type String = java.lang.String
  type StringWithLengthBetween0And32768 = java.lang.String
  type StringWithLengthBetween1And64 = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.appconfigMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.appconfigMod.TagValue]
  type TagValue = java.lang.String
  type Uri = java.lang.String
  type ValidatorList = js.Array[typingsSlinky.awsSdk.appconfigMod.Validator]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.JSON_SCHEMA
    - typingsSlinky.awsSdk.awsSdkStrings.LAMBDA
    - java.lang.String
  */
  type ValidatorType = typingsSlinky.awsSdk.appconfigMod._ValidatorType | java.lang.String
  type ValidatorTypeList = js.Array[typingsSlinky.awsSdk.appconfigMod.ValidatorType]
  type Version = java.lang.String
  type _Blob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.appconfigMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-10-09`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.appconfigMod._apiVersion | java.lang.String
}
