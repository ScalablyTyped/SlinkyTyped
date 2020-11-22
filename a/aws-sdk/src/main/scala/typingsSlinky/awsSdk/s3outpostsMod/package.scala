package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object s3outpostsMod {
  
  type CidrBlock = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.s3outpostsMod.ClientApiVersions
  
  type CreationTime = js.Date
  
  type EndpointArn = java.lang.String
  
  type EndpointId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - java.lang.String
  */
  type EndpointStatus = typingsSlinky.awsSdk.s3outpostsMod._EndpointStatus | java.lang.String
  
  type Endpoints = js.Array[typingsSlinky.awsSdk.s3outpostsMod.Endpoint]
  
  type MaxResults = scala.Double
  
  type NetworkInterfaceId = java.lang.String
  
  type NetworkInterfaces = js.Array[typingsSlinky.awsSdk.s3outpostsMod.NetworkInterface]
  
  type NextToken = java.lang.String
  
  type OutpostId = java.lang.String
  
  type SecurityGroupId = java.lang.String
  
  type SubnetId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-07-25`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.s3outpostsMod._apiVersion | java.lang.String
}
