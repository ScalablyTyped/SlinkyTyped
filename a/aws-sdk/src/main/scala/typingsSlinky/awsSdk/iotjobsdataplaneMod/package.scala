package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object iotjobsdataplaneMod {
  
  type ApproximateSecondsBeforeTimedOut = scala.Double
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.iotjobsdataplaneMod.ClientApiVersions
  
  type DescribeJobExecutionJobId = java.lang.String
  
  type DetailsKey = java.lang.String
  
  type DetailsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotjobsdataplaneMod.DetailsValue]
  
  type DetailsValue = java.lang.String
  
  type ExecutionNumber = scala.Double
  
  type ExpectedVersion = scala.Double
  
  type IncludeExecutionState = scala.Boolean
  
  type IncludeJobDocument = scala.Boolean
  
  type JobDocument = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.QUEUED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT
    - typingsSlinky.awsSdk.awsSdkStrings.REJECTED
    - typingsSlinky.awsSdk.awsSdkStrings.REMOVED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
    - java.lang.String
  */
  type JobExecutionStatus = typingsSlinky.awsSdk.iotjobsdataplaneMod._JobExecutionStatus | java.lang.String
  
  type JobExecutionSummaryList = js.Array[typingsSlinky.awsSdk.iotjobsdataplaneMod.JobExecutionSummary]
  
  type JobId = java.lang.String
  
  type LastUpdatedAt = scala.Double
  
  type QueuedAt = scala.Double
  
  type StartedAt = scala.Double
  
  type StepTimeoutInMinutes = scala.Double
  
  type ThingName = java.lang.String
  
  type VersionNumber = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-09-29`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.iotjobsdataplaneMod._apiVersion | java.lang.String
}
