package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object augmentedairuntimeMod {
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.augmentedairuntimeMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FreeOfPersonallyIdentifiableInformation
    - typingsSlinky.awsSdk.awsSdkStrings.FreeOfAdultContent
    - java.lang.String
  */
  type ContentClassifier = typingsSlinky.awsSdk.augmentedairuntimeMod._ContentClassifier | java.lang.String
  type ContentClassifiers = js.Array[typingsSlinky.awsSdk.augmentedairuntimeMod.ContentClassifier]
  type FailureReason = java.lang.String
  type FlowDefinitionArn = java.lang.String
  type HumanLoopArn = java.lang.String
  type HumanLoopName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
    - java.lang.String
  */
  type HumanLoopStatus = typingsSlinky.awsSdk.augmentedairuntimeMod._HumanLoopStatus | java.lang.String
  type HumanLoopSummaries = js.Array[typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopSummary]
  type InputContent = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Ascending_
    - typingsSlinky.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type SortOrder = typingsSlinky.awsSdk.augmentedairuntimeMod._SortOrder | java.lang.String
  type String = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-11-07`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.augmentedairuntimeMod._apiVersion | java.lang.String
}
