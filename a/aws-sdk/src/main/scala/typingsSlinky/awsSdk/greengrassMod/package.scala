package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object greengrassMod {
  
  type BulkDeploymentResults = js.Array[typingsSlinky.awsSdk.greengrassMod.BulkDeploymentResult]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Initializing_
    - typingsSlinky.awsSdk.awsSdkStrings.Running_
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type BulkDeploymentStatus = typingsSlinky.awsSdk.greengrassMod._BulkDeploymentStatus | java.lang.String
  
  type BulkDeployments = js.Array[typingsSlinky.awsSdk.greengrassMod.BulkDeployment]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.greengrassMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NewDeployment
    - typingsSlinky.awsSdk.awsSdkStrings.Redeployment
    - typingsSlinky.awsSdk.awsSdkStrings.ResetDeployment
    - typingsSlinky.awsSdk.awsSdkStrings.ForceResetDeployment
    - java.lang.String
  */
  type DeploymentType = typingsSlinky.awsSdk.greengrassMod._DeploymentType | java.lang.String
  
  type Deployments = js.Array[typingsSlinky.awsSdk.greengrassMod.Deployment]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.binary__
    - typingsSlinky.awsSdk.awsSdkStrings.json_
    - java.lang.String
  */
  type EncodingType = typingsSlinky.awsSdk.greengrassMod._EncodingType | java.lang.String
  
  type ErrorDetails = js.Array[typingsSlinky.awsSdk.greengrassMod.ErrorDetail]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GreengrassContainer
    - typingsSlinky.awsSdk.awsSdkStrings.NoContainer
    - java.lang.String
  */
  type FunctionIsolationMode = typingsSlinky.awsSdk.greengrassMod._FunctionIsolationMode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GreengrassSystem
    - typingsSlinky.awsSdk.awsSdkStrings.Lambda_
    - java.lang.String
  */
  type LoggerComponent = typingsSlinky.awsSdk.greengrassMod._LoggerComponent | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEBUG
    - typingsSlinky.awsSdk.awsSdkStrings.INFO
    - typingsSlinky.awsSdk.awsSdkStrings.WARN
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.FATAL
    - java.lang.String
  */
  type LoggerLevel = typingsSlinky.awsSdk.greengrassMod._LoggerLevel | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FileSystem
    - typingsSlinky.awsSdk.awsSdkStrings.AWSCloudWatch
    - java.lang.String
  */
  type LoggerType = typingsSlinky.awsSdk.greengrassMod._LoggerType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ro_
    - typingsSlinky.awsSdk.awsSdkStrings.rw_
    - java.lang.String
  */
  type Permission = typingsSlinky.awsSdk.greengrassMod._Permission | java.lang.String
  
  type S3UrlSignerRole = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.core__
    - typingsSlinky.awsSdk.awsSdkStrings.ota_agent
    - java.lang.String
  */
  type SoftwareToUpdate = typingsSlinky.awsSdk.greengrassMod._SoftwareToUpdate | java.lang.String
  
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.greengrassMod.string]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.TRACE
    - typingsSlinky.awsSdk.awsSdkStrings.DEBUG
    - typingsSlinky.awsSdk.awsSdkStrings.VERBOSE
    - typingsSlinky.awsSdk.awsSdkStrings.INFO
    - typingsSlinky.awsSdk.awsSdkStrings.WARN
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.FATAL
    - java.lang.String
  */
  type UpdateAgentLogLevel = typingsSlinky.awsSdk.greengrassMod._UpdateAgentLogLevel | java.lang.String
  
  type UpdateTargets = js.Array[typingsSlinky.awsSdk.greengrassMod.string]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.armv6l
    - typingsSlinky.awsSdk.awsSdkStrings.armv7l
    - typingsSlinky.awsSdk.awsSdkStrings.x86_64_
    - typingsSlinky.awsSdk.awsSdkStrings.aarch64
    - java.lang.String
  */
  type UpdateTargetsArchitecture = typingsSlinky.awsSdk.greengrassMod._UpdateTargetsArchitecture | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ubuntu_
    - typingsSlinky.awsSdk.awsSdkStrings.raspbian
    - typingsSlinky.awsSdk.awsSdkStrings.amazon_linux_
    - typingsSlinky.awsSdk.awsSdkStrings.openwrt
    - java.lang.String
  */
  type UpdateTargetsOperatingSystem = typingsSlinky.awsSdk.greengrassMod._UpdateTargetsOperatingSystem | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-06-07`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.greengrassMod._apiVersion | java.lang.String
  
  type boolean = scala.Boolean
  
  type integer = scala.Double
  
  type listOfConnectivityInfo = js.Array[typingsSlinky.awsSdk.greengrassMod.ConnectivityInfo]
  
  type listOfConnector = js.Array[typingsSlinky.awsSdk.greengrassMod.Connector]
  
  type listOfCore = js.Array[typingsSlinky.awsSdk.greengrassMod.Core]
  
  type listOfDefinitionInformation = js.Array[typingsSlinky.awsSdk.greengrassMod.DefinitionInformation]
  
  type listOfDevice = js.Array[typingsSlinky.awsSdk.greengrassMod.Device]
  
  type listOfFunction = js.Array[typingsSlinky.awsSdk.greengrassMod.Function]
  
  type listOfGroupCertificateAuthorityProperties = js.Array[typingsSlinky.awsSdk.greengrassMod.GroupCertificateAuthorityProperties]
  
  type listOfGroupInformation = js.Array[typingsSlinky.awsSdk.greengrassMod.GroupInformation]
  
  type listOfLogger = js.Array[typingsSlinky.awsSdk.greengrassMod.Logger]
  
  type listOfResource = js.Array[typingsSlinky.awsSdk.greengrassMod.Resource]
  
  type listOfResourceAccessPolicy = js.Array[typingsSlinky.awsSdk.greengrassMod.ResourceAccessPolicy]
  
  type listOfString = js.Array[typingsSlinky.awsSdk.greengrassMod.string]
  
  type listOfSubscription = js.Array[typingsSlinky.awsSdk.greengrassMod.Subscription]
  
  type listOfVersionInformation = js.Array[typingsSlinky.awsSdk.greengrassMod.VersionInformation]
  
  type mapOfString = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.greengrassMod.string]
  
  type string = java.lang.String
}
