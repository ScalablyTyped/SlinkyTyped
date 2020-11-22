package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object kafkaMod {
  
  type BrokerAZDistribution = typingsSlinky.awsSdk.awsSdkStrings.DEFAULT | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TLS
    - typingsSlinky.awsSdk.awsSdkStrings.TLS_PLAINTEXT
    - typingsSlinky.awsSdk.awsSdkStrings.PLAINTEXT
    - java.lang.String
  */
  type ClientBroker = typingsSlinky.awsSdk.kafkaMod._ClientBroker | java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.kafkaMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ClusterState = typingsSlinky.awsSdk.kafkaMod._ClusterState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type ConfigurationState = typingsSlinky.awsSdk.kafkaMod._ConfigurationState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT
    - typingsSlinky.awsSdk.awsSdkStrings.PER_BROKER
    - typingsSlinky.awsSdk.awsSdkStrings.PER_TOPIC_PER_BROKER
    - typingsSlinky.awsSdk.awsSdkStrings.PER_TOPIC_PER_PARTITION
    - java.lang.String
  */
  type EnhancedMonitoring = typingsSlinky.awsSdk.kafkaMod._EnhancedMonitoring | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DEPRECATED
    - java.lang.String
  */
  type KafkaVersionStatus = typingsSlinky.awsSdk.kafkaMod._KafkaVersionStatus | java.lang.String
  
  type MaxResults = scala.Double
  
  type NodeType = typingsSlinky.awsSdk.awsSdkStrings.BROKER | java.lang.String
  
  type _Blob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.kafkaMod.Blob | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-11-14`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.kafkaMod._apiVersion | java.lang.String
  
  type boolean = scala.Boolean
  
  type double = scala.Double
  
  type integer = scala.Double
  
  type integerMin1Max15 = scala.Double
  
  type integerMin1Max16384 = scala.Double
  
  type listOfBrokerEBSVolumeInfo = js.Array[typingsSlinky.awsSdk.kafkaMod.BrokerEBSVolumeInfo]
  
  type listOfClusterInfo = js.Array[typingsSlinky.awsSdk.kafkaMod.ClusterInfo]
  
  type listOfClusterOperationInfo = js.Array[typingsSlinky.awsSdk.kafkaMod.ClusterOperationInfo]
  
  type listOfClusterOperationStep = js.Array[typingsSlinky.awsSdk.kafkaMod.ClusterOperationStep]
  
  type listOfCompatibleKafkaVersion = js.Array[typingsSlinky.awsSdk.kafkaMod.CompatibleKafkaVersion]
  
  type listOfConfiguration = js.Array[typingsSlinky.awsSdk.kafkaMod.Configuration]
  
  type listOfConfigurationRevision = js.Array[typingsSlinky.awsSdk.kafkaMod.ConfigurationRevision]
  
  type listOfKafkaVersion = js.Array[typingsSlinky.awsSdk.kafkaMod.KafkaVersion]
  
  type listOfNodeInfo = js.Array[typingsSlinky.awsSdk.kafkaMod.NodeInfo]
  
  type listOfString = js.Array[typingsSlinky.awsSdk.kafkaMod.string]
  
  type listOfUnprocessedScramSecret = js.Array[typingsSlinky.awsSdk.kafkaMod.UnprocessedScramSecret]
  
  type long = scala.Double
  
  type mapOfString = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.kafkaMod.string]
  
  type string = java.lang.String
  
  type stringMin1Max128 = java.lang.String
  
  type stringMin1Max64 = java.lang.String
  
  type stringMin5Max32 = java.lang.String
  
  type timestampIso8601 = js.Date
}
