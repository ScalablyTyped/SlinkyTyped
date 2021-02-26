package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ioteventsdataMod {
  
  type BatchPutMessageErrorEntries = js.Array[typingsSlinky.awsSdk.ioteventsdataMod.BatchPutMessageErrorEntry]
  
  type BatchUpdateDetectorErrorEntries = js.Array[typingsSlinky.awsSdk.ioteventsdataMod.BatchUpdateDetectorErrorEntry]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.ioteventsdataMod.ClientApiVersions
  
  type DetectorModelName = java.lang.String
  
  type DetectorModelVersion = java.lang.String
  
  type DetectorSummaries = js.Array[typingsSlinky.awsSdk.ioteventsdataMod.DetectorSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceNotFoundException
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidRequestException
    - typingsSlinky.awsSdk.awsSdkStrings.InternalFailureException
    - typingsSlinky.awsSdk.awsSdkStrings.ServiceUnavailableException
    - typingsSlinky.awsSdk.awsSdkStrings.ThrottlingException
    - java.lang.String
  */
  type ErrorCode = typingsSlinky.awsSdk.ioteventsdataMod._ErrorCode | java.lang.String
  
  type ErrorMessage = java.lang.String
  
  type InputName = java.lang.String
  
  type KeyValue = java.lang.String
  
  type MaxResults = scala.Double
  
  type MessageId = java.lang.String
  
  type Messages = js.Array[typingsSlinky.awsSdk.ioteventsdataMod.Message]
  
  type NextToken = java.lang.String
  
  type Payload = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.ioteventsdataMod.Blob | java.lang.String
  
  type Seconds = scala.Double
  
  type StateName = java.lang.String
  
  type TimerDefinitions = js.Array[typingsSlinky.awsSdk.ioteventsdataMod.TimerDefinition]
  
  type TimerName = java.lang.String
  
  type Timers = js.Array[typingsSlinky.awsSdk.ioteventsdataMod.Timer]
  
  type Timestamp = js.Date
  
  type UpdateDetectorRequests = js.Array[typingsSlinky.awsSdk.ioteventsdataMod.UpdateDetectorRequest]
  
  type VariableDefinitions = js.Array[typingsSlinky.awsSdk.ioteventsdataMod.VariableDefinition]
  
  type VariableName = java.lang.String
  
  type VariableValue = java.lang.String
  
  type Variables = js.Array[typingsSlinky.awsSdk.ioteventsdataMod.Variable]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-10-23`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.ioteventsdataMod._apiVersion | java.lang.String
}
