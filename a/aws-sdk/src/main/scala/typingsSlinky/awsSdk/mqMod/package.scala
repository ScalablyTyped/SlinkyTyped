package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mqMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SIMPLE
    - typingsSlinky.awsSdk.awsSdkStrings.LDAP
    - java.lang.String
  */
  type AuthenticationStrategy = typingsSlinky.awsSdk.mqMod._AuthenticationStrategy | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.CREATION_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETION_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.REBOOT_IN_PROGRESS
    - java.lang.String
  */
  type BrokerState = typingsSlinky.awsSdk.mqMod._BrokerState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EBS
    - typingsSlinky.awsSdk.awsSdkStrings.EFS
    - java.lang.String
  */
  type BrokerStorageType = typingsSlinky.awsSdk.mqMod._BrokerStorageType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type ChangeType = typingsSlinky.awsSdk.mqMod._ChangeType | java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.mqMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MONDAY
    - typingsSlinky.awsSdk.awsSdkStrings.TUESDAY
    - typingsSlinky.awsSdk.awsSdkStrings.WEDNESDAY
    - typingsSlinky.awsSdk.awsSdkStrings.THURSDAY
    - typingsSlinky.awsSdk.awsSdkStrings.FRIDAY
    - typingsSlinky.awsSdk.awsSdkStrings.SATURDAY
    - typingsSlinky.awsSdk.awsSdkStrings.SUNDAY
    - java.lang.String
  */
  type DayOfWeek = typingsSlinky.awsSdk.mqMod._DayOfWeek | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SINGLE_INSTANCE
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE_STANDBY_MULTI_AZ
    - typingsSlinky.awsSdk.awsSdkStrings.CLUSTER_MULTI_AZ
    - java.lang.String
  */
  type DeploymentMode = typingsSlinky.awsSdk.mqMod._DeploymentMode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVEMQ
    - typingsSlinky.awsSdk.awsSdkStrings.RABBITMQ
    - java.lang.String
  */
  type EngineType = typingsSlinky.awsSdk.mqMod._EngineType | java.lang.String
  
  type MaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DISALLOWED_ELEMENT_REMOVED
    - typingsSlinky.awsSdk.awsSdkStrings.DISALLOWED_ATTRIBUTE_REMOVED
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_ATTRIBUTE_VALUE_REMOVED
    - java.lang.String
  */
  type SanitizationWarningReason = typingsSlinky.awsSdk.mqMod._SanitizationWarningReason | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-11-27`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.mqMod._apiVersion | java.lang.String
  
  type boolean = scala.Boolean
  
  type integer = scala.Double
  
  type integerMin5Max100 = scala.Double
  
  type listOfAvailabilityZone = js.Array[typingsSlinky.awsSdk.mqMod.AvailabilityZone]
  
  type listOfBrokerEngineType = js.Array[typingsSlinky.awsSdk.mqMod.BrokerEngineType]
  
  type listOfBrokerInstance = js.Array[typingsSlinky.awsSdk.mqMod.BrokerInstance]
  
  type listOfBrokerInstanceOption = js.Array[typingsSlinky.awsSdk.mqMod.BrokerInstanceOption]
  
  type listOfBrokerSummary = js.Array[typingsSlinky.awsSdk.mqMod.BrokerSummary]
  
  type listOfConfiguration = js.Array[typingsSlinky.awsSdk.mqMod.Configuration]
  
  type listOfConfigurationId = js.Array[typingsSlinky.awsSdk.mqMod.ConfigurationId]
  
  type listOfConfigurationRevision = js.Array[typingsSlinky.awsSdk.mqMod.ConfigurationRevision]
  
  type listOfDeploymentMode = js.Array[typingsSlinky.awsSdk.mqMod.DeploymentMode]
  
  type listOfEngineVersion = js.Array[typingsSlinky.awsSdk.mqMod.EngineVersion]
  
  type listOfSanitizationWarning = js.Array[typingsSlinky.awsSdk.mqMod.SanitizationWarning]
  
  type listOfString = js.Array[typingsSlinky.awsSdk.mqMod.string]
  
  type listOfUser = js.Array[typingsSlinky.awsSdk.mqMod.User]
  
  type listOfUserSummary = js.Array[typingsSlinky.awsSdk.mqMod.UserSummary]
  
  type mapOfString = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.mqMod.string]
  
  type string = java.lang.String
  
  type timestampIso8601 = js.Date
}
